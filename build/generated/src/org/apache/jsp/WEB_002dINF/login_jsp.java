package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("        * {\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            list-style: url(\"pre.gif\") outside circle;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("\n");
      out.write("        .whole {\n");
      out.write("            overflow: hidden;\n");
      out.write("            width: 950px;\n");
      out.write("            height: auto;\n");
      out.write("            margin: 0 auto;\n");
      out.write("            /* background-color: pink; */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .logo {\n");
      out.write("            width: 950px;\n");
      out.write("            height: 70px;\n");
      out.write("            /* background-color: #fff; */\n");
      out.write("            /* margin: 0 auto; */\n");
      out.write("            /* background-color: skyblue; */\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .navigation {\n");
      out.write("            width: 950px;\n");
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
      out.write("            width: 197px;\n");
      out.write("            height: 500px;\n");
      out.write("            /* margin: 0 auto; */\n");
      out.write("            /* background-color: green; */\n");
      out.write("            border-right: 3px solid #999999;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .right {\n");
      out.write("            float: left;\n");
      out.write("            width: 100px;\n");
      out.write("            height: 500px;\n");
      out.write("            /* margin: 0 auto; */\n");
      out.write("            /* background-color: orange; */\n");
      out.write("\n");
      out.write("\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .tail {\n");
      out.write("            float: left;\n");
      out.write("            width: 100%;\n");
      out.write("            height: 50px;\n");
      out.write("\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("            /* margin: 0 auto; */\n");
      out.write("            /* background-color: yellow; */\n");
      out.write("        }\n");
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
      out.write("            width: 850px;\n");
      out.write("            height: 400px;\n");
      out.write("\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .mainBotton {\n");
      out.write("            /* background-color: #F30; */\n");
      out.write("            width: 850px;\n");
      out.write("            height: 50px;\n");
      out.write("\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
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
      out.write("            width: 600px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        button {\n");
      out.write("            padding: 8px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <div class=\"whole\">\n");
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
      out.write("            <table width=\"100px\" border=\"\" class=\"tiezi\">\n");
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
      out.write("            <form method=\"post\" action=\"RegServlet\">\n");
      out.write("            <div class=\"mainTop\">\n");
      out.write("                <table border=\"3px\" class=\"xinxi\">\n");
      out.write("                    <tr>\n");
      out.write("                        <th colspan=\"2\">登录信息</th>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>用户名</td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"text\" name=\"userName\" id=\"userName\">\n");
      out.write("                            <div id=\"user\"></div>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>密码</td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"password\" name=\"password\" id=\"pasw\">\n");
      out.write("                            <div id=\"psw\"></div>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("         \n");
      out.write("            <div class=\"mainBotton\">\n");
      out.write("                <button type=\"reset\">重置</button>\n");
      out.write("                &nbsp\n");
      out.write("                &nbsp\n");
      out.write("                <button type=\"submit\">提交</button>\n");
      out.write("            </div>\n");
      out.write("                </form>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"tail\"></div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("   \n");
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
