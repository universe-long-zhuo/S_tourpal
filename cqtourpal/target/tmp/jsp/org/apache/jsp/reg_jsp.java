package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reg_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\r');
      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<base href=\"");
      out.print(basePath );
      out.write("\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>老牛驴友社区</title>\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link href=\"resources/tourpal/css/jquery.mobile-1.3.2.min.css\" type=\"text/css\"\r\n");
      out.write("\trel=\"stylesheet\">\r\n");
      out.write("<link href=\"resources/tourpal/css/jquery.mobile.tabs.css\" type=\"text/css\" rel=\"stylesheet\">\r\n");
      out.write("<script src=\"resources/tourpal/js/jquery-1.8.3.min.js\"></script>\r\n");
      out.write("<script src=\"resources/tourpal/js/jquery.mobile-1.3.2.min.js\"></script>\r\n");
      out.write("<script src=\"resources/tourpal/js/jquery.mobile.tabs.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div data-role=\"page\">\r\n");
      out.write("\t\t<div data-role=\"header\">\r\n");
      out.write("\t\t\t<a href=\"login.jsp\" data-ajax=\"false\" data-role=\"button\">返回登录</a>\r\n");
      out.write("\t\t\t<h1>驴友社区注册</h1>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div data-role=\"content\">\r\n");
      out.write("\t\t\t<div align=\"center\" style=\"color: red;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${info }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("\t\t\t<form action=\"tourpal/reg.do\" method=\"post\" data-ajax=\"true\">\r\n");
      out.write("\t\t\t\t<label for=\"userNumber\">账号：</label>\r\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"userNumber\" id=\"userNumber\" placeholder=\"请输入账号\"/>\r\n");
      out.write("\t\t\t\t<label for=\"userPw\">密码：</label>\r\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"userPw\" id=\"userPw\" placeholder=\"请输入密码\"/>\r\n");
      out.write("\t\t\t\t<label for=\"userName\">姓名：</label>\r\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"userName\" id=\"userName\" placeholder=\"请输入姓名\"/>\r\n");
      out.write("\t\t\t\t<input type=\"submit\" value=\"免费注册\" data-theme=\"b\"/>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div data-role=\"footer\" data-position=\"fixed\">\r\n");
      out.write("\t\t\t<h1>版权所有：老牛</h1>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
