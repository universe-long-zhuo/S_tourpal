package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<base href=\"");
      out.print(basePath );
      out.write("\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
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
      out.write("<body><div data-role=\"page\">\r\n");
      out.write("\t\t<div data-role=\"header\">\r\n");
      out.write("\t\t\t<a href=\"");
      out.print(basePath );
      out.write("login.jsp\" data-role=\"button\" data-ajax=\"false\">退出登录</a>\r\n");
      out.write("\t\t\t<h1>欢迎来到驴友社区</h1>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div data-role=\"content\">\r\n");
      out.write("\t\t\t<ul data-role=\"listview\" data-filter=\"true\" data-filter-placeholder=\"请输入景点名称\" >\r\n");
      out.write("\t\t\t\t");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_0.setParent(null);
      _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${list }", java.lang.Object.class, (PageContext)_jspx_page_context, null));
      _jspx_th_c_forEach_0.setVar("view");
      int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t\t\t<li>\r\n");
            out.write("\t\t\t\t\t<a href=\"");
            out.print(basePath );
            out.write("tourpal/queryInfo.do?viewId=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${view.viewId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\" data-ajax=\"false\">\r\n");
            out.write("\t\t\t\t\t\t<img alt=\"\" src=\"");
            out.print(basePath );
            out.write("upload/");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${view.viewPhoto }", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\" width=\"200px\" height=\"100px\">\r\n");
            out.write("\t\t\t\t\t\t<h2>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${view.viewName }", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</h2>\r\n");
            out.write("\t\t\t\t\t\t<p>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${view.viewDesc }", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\r\n");
            out.write("\t\t\t\t\t\t</p>\r\n");
            out.write("\t\t\t\t\t</a>\r\n");
            out.write("\t\t\t\t</li>\r\n");
            out.write("\t\t\t\t");
            int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_0.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
      }
      out.write("\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div data-role=\"footer\" data-position=\"fixed\" align=\"center\">\r\n");
      out.write("\t\t\t<div data-role=\"navbar\">\r\n");
      out.write("\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      out.print(basePath );
      out.write("tourpal/query.do\" data-ajax=\"false\"  class=\"ui-btn-active\">景点介绍</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      out.print(basePath );
      out.write("user_list.jsp\" data-ajax=\"false\"  >个人信息</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\r\n");
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
