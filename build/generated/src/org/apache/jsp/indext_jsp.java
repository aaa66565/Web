package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import bao.TobliceBean;
import java.util.ArrayList;
import bao.TopicBeanAction;

public final class indext_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");

TopicBeanAction tba = new TopicBeanAction();
int pageSize = 5;
int currentPage = 1;//当前页是第一页
if(request.getParameter("currentPage")!=null){
    currentPage = Integer.parseInt(request.getParameter("currentPage"));//超链接传递的参数值
};
ArrayList al = tba.getTopicByPage(pageSize, currentPage);
int rowCount = tba.getRowCount();//总行数
int pageCount = rowCount/pageSize;//总页数
if(rowCount%pageSize!=0){
    pageCount++;
}

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script>\n");
      out.write("            function check(){\n");
      out.write("                var num = document.getElementById(\"num\").value;\n");
      out.write("                var i_num = parseInt(num);\n");
      out.write("                if(i_num == \"NaN\"){\n");
      out.write("                    alert(\"请输入阿拉伯数字\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else if(i_num)");
      out.print(pageCount);
      out.write("|i_num<1{\n");
      out.write("                    alert(\"页码不对,过大或过小\")\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                location href=\"indext.jsp?currentPage=\"+i_num;\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("         <style>\n");
      out.write("        * {\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            list-style: url(\"pre.gif\") outside circle;\n");
      out.write("            text-decoration: none;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("\n");
      out.write("        .whole {\n");
      out.write("            overflow: hidden;\n");
      out.write("            width: 95%;\n");
      out.write("            height: auto;\n");
      out.write("            margin: 0 auto;\n");
      out.write("            /* background-color: pink; */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .logo {\n");
      out.write("            width: 95%;\n");
      out.write("            height: 70px;\n");
      out.write("             /*background-color: #fff;*/ \n");
      out.write("            /* margin: 0 auto; */\n");
      out.write("            /* background-color: skyblue; */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .navigation {\n");
      out.write("            width: 95%;\n");
      out.write("            height: 50px;\n");
      out.write("            /* margin: 0 auto; */\n");
      out.write("            background-color: #ccc;\n");
      out.write("            /* 居中 */\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .left {\n");
      out.write("            float: left;\n");
      out.write("            width: 275px;\n");
      out.write("            height: 500px;\n");
      out.write("            /* margin: 0 auto; */\n");
      out.write("            /* background-color: green; */\n");
      out.write("            border-right: 3px solid #999999;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .right {\n");
      out.write("            /*display: flex;*/\n");
      out.write("            float: left;\n");
      out.write("            width: 75%;\n");
      out.write("            height: auto;\n");
      out.write("            /*flex-wrap:wrap;*/\n");
      out.write("            /*background-color:  #00f;*/\n");
      out.write("/*          margin: 0 auto; \n");
      out.write("            background-color: orange; */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        \n");
      out.write("\n");
      out.write("        img {\n");
      out.write("            width: 100%;\n");
      out.write("            height: 100%;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .navigation ul li {\n");
      out.write("            float: left;\n");
      out.write("            text-align: center;\n");
      out.write("            width: 237.5px;\n");
      out.write("            height: 100px;\n");
      out.write("            /* background-color: blue; */\n");
      out.write("\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .mainTop {\n");
      out.write("            /* background-color: #9c0; */\n");
      out.write("            width: 100%;\n");
      out.write("            height: auto;\n");
      out.write("            /*background-color:#0f0;*/\n");
      out.write("\n");
      out.write("            /*display: flex;*/\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .mainBotton {\n");
      out.write("            /* background-color: #F30; */\n");
      out.write("            width: 100%;\n");
      out.write("            height: auto;\n");
      out.write("            /*background-color:#19AAD8;*/\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("            /*flex-wrap:wrap;*/\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        th {\n");
      out.write("            padding: 8px;\n");
      out.write("            background-color: pink;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        td {\n");
      out.write("            padding: 8px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        tr {\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .tiezi {\n");
      out.write("            width: 100%;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        table {\n");
      out.write("            border-spacing: 0;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .xinxi {\n");
      out.write("            width: 100%;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        button {\n");
      out.write("            padding: 8px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!--<div class=\"whole\">-->\n");
      out.write("        <div class=\"logo\">\n");
      out.write("            <img src=\"真.png\" alt=\"\">\n");
      out.write("        </div>\n");
      out.write("        <!-- 导航 -->\n");
      out.write("        <div class=\"navigation\">\n");
      out.write("            <table width=\"950\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>你好</td>\n");
      out.write("                    <td>你好</td>\n");
      out.write("                    <td>你好</td>\n");
      out.write("                    <td>你好</td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"left\">\n");
      out.write("            <table  border=\"\" class=\"tiezi\">\n");
      out.write("                <tr>\n");
      out.write("                    <th>热帖榜</th>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>2</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>3</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>4</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>4</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>5</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>6</td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"right\">\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <div class=\"mainTop\">\n");
      out.write("                <table width=\"100%\" border=\"1\">\n");
      out.write("  <tr>\n");
      out.write("    <td width=\"76\">标题</td>\n");
      out.write("    <td width=\"68\">作者</td>\n");
      out.write("    <td width=\"80\">发帖时间</td>\n");
      out.write("    <td width=\"121\"><p>回复数</p></td>\n");
      out.write("  </tr>\n");
      out.write("  ");
for(int i = 0;i<al.size();i++){
      TobliceBean tb = (TobliceBean)al.get(i);
  
      out.write("\n");
      out.write("  <tr>\n");
      out.write("      <td><a href=\"content?topicId=");
      out.print(tb.getID());
      out.write('"');
      out.write('>');
      out.print(tb.getTitle());
      out.write("</td>\n");
      out.write("    <td>");
      out.print(tb.getUser());
      out.write("</td>\n");
      out.write("    <td>");
      out.print(tb.getTopicDat());
      out.write("</td>\n");
      out.write("    <td>");
      out.print(tb.getReplyNumber());
      out.write("</td>\n");
      out.write("  </tr>\n");
      out.write("  ");
}
      out.write("\n");
      out.write("  <tr>\n");
      out.write("      <td colspan=\"4\">\n");
      out.write("          <a href=\"indext.jsp?currentPage=1\"> 首页</a>\n");
      out.write("          ");

           if(currentPage<pageCount&currentPage>0){
          
      out.write("\n");
      out.write("          <a href=\"indext.jsp?currentPage=");
      out.print(currentPage+1);
      out.write("\">下一页</a>\n");
      out.write("          ");

           }
          if(currentPage>1){
      out.write("\n");
      out.write("          <a href=\"indext.jsp?currentPage=");
      out.print(currentPage-1);
      out.write("\">上一页</a>\n");
      out.write("          ");
}
      out.write("\n");
      out.write("          <a href=\"indext.jsp?currentPage=");
      out.print(currentPage);
      out.write("\">末页</a>\n");
      out.write("          总页数:");
      out.print(pageCount);
      out.write(" 当前页");
      out.print(currentPage);
      out.write("\n");
      out.write("          第<input type=\"text\" name=\"num\" id=\"num\" size=\"2\"/>页\n");
      out.write("          <input type=\"button\" value=\"跳转\" onclick=\"return check()\"/>\n");
      out.write("          \n");
      out.write("      </td>\n");
      out.write("          \n");
      out.write("  </tr>\n");
      out.write("</table>\n");
      out.write("        </div>\n");
      out.write("    </div>  \n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
