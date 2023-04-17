/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import bao.UserBeanAction;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *业务处理:调用注册用户函数,往数据库新增一条数据信息,根据结果进行页面跳转
 * @author Administrator
 */
public class RegServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            request.setCharacterEncoding("UTF-8");//request:全局对象,请求,里面包含上一个页面元素对象信息
            String userName = request.getParameter("userName");//读取上一个页面name=userName的值
            String pasw = request.getParameter("password1");
            String sex = request.getParameter("sex");
            String email = request.getParameter("email");
            UserBeanAction uba = new  UserBeanAction();
            boolean falg = uba.regUser(userName,pasw,sex,email);
            if(falg){
//                System.out.println("注册成功");
                out.println("<script>");
                out.println("alert('注册成功请登录');");
                out.println("location.href='login.jsp';");
                out.println("</script>");
            }else{
                out.println("<script>");
                out.println("alert('注册失败请重新注册');");
                out.println("location.href='reg.jsp';");
                out.println("</script>");
                
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
