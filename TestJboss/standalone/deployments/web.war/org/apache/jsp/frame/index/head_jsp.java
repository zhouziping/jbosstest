/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: JBoss EAP 7.1.0.GA (WildFly Core 3.0.10.Final-redhat-1) - 1.4.18.Final-redhat-2
 * Generated at: 2021-03-24 01:17:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.frame.index;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.eframework.core.config.systemconfig.SystemConfig;
import com.eframework.module.comp.login.LoginThreadLocal;
import com.eframework.module.comp.login.LoginInfo;
import com.eframework.core.constant.Constant;

public final class head_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.eframework.core.config.systemconfig.SystemConfig");
    _jspx_imports_classes.add("com.eframework.module.comp.login.LoginInfo");
    _jspx_imports_classes.add("com.eframework.core.constant.Constant");
    _jspx_imports_classes.add("com.eframework.module.comp.login.LoginThreadLocal");
  }

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JBWEB004248: JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      response.addHeader("X-Powered-By", "JSP/2.3");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
 String userName = (String) request.getAttribute("userName");
      out.write('\r');
      out.write('\n');

    String menu = (String) request.getAttribute("menuHtml");
    if(menu==null){
        menu = "";
    }

    LoginInfo loginInfo = LoginThreadLocal.getLoginInfo();
    String isAdmin = loginInfo.sysUserServiceDO.getIsAdmin();
    String userId = loginInfo.getLoginUserId();

    if (userId == null) {
        userId = "";
    } else {
        userId = userId.trim().toLowerCase();
    }

    String root = request.getContextPath();

    String fontsizePreference=loginInfo.sysUserServiceDO.getFontsizePreference();
    if(fontsizePreference == null){
        fontsizePreference="small";
    }
    String welcomeUrl =    (String) request.getAttribute("welcomeUrl");
    if(welcomeUrl==null){
        welcomeUrl = "";
    }
    String welcomeJs =  (String) request.getAttribute("welcomeJs");
    if(welcomeJs==null){
        welcomeJs = "";
    }

    String title = SystemConfig.getConfigXML().getProgramName();
    String icon = SystemConfig.getConfigXML().getProgramIcon();
    String iconUrl = "";
    if(icon!=null&&!"".equals(icon)){
        iconUrl=root+icon;
    }
    String version = Constant.EFRAME_VERSION;

      out.write("\r\n");
      out.write("<!-- Header Navigation Right -->\r\n");
      out.write("<header  data-ng-controller=\"HeaderCtrl\" id=\"header-navbar\" class=\"content-mini content-mini-full header-background\">\r\n");
      out.write("<ul class=\"nav-header pull-right\">\r\n");
      out.write("\r\n");
      out.write("    <li class=\"pull-right\">\r\n");
      out.write("        <div class=\" btn-group btn-rounded   \">\r\n");
      out.write("            <div class=\"btn-group btn-rounded  \">\r\n");
      out.write("                <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" aria-expanded=\"false\" style=\"color: white;font-size:14px;\">\r\n");
      out.write("                    <img src=\"assets/img/avatars/avatar10.png\" alt=\"Avatar\" style=\"width: 32px;height: 32px; border-radius: 70%;margin: 0 3px;\">\r\n");
      out.write("                    ");
      out.print(userName);
      out.write(" <span class=\"caret\"></span>\r\n");
      out.write("                </a>\r\n");
      out.write("\r\n");
      out.write("                <ul class=\"dropdown-menu\">\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a tabindex=\"-1\" href=\"javascript:void(0)\"\r\n");
      out.write("                           ng-click=\"tools.openDialog({ title: '????????????',view:'/frame/systemmanagement/usermanagement/user/userlogin/userloginmanagement.action?frameControlSubmitFunction=init',\r\n");
      out.write("                                                          file: ['/frame/systemmanagement/usermanagement/user/userlogin/userloginmanagement.js'],\r\n");
      out.write("                                                          width: '800px',height: '600px',})\"><i\r\n");
      out.write("                                class=\"si si-user\" style=\" float: right;\"></i>????????????</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a tabindex=\"-1\" href=\"javascript:void(0)\"\r\n");
      out.write("                           ng-click=\"tools.openDialog({ title: '????????????',view:'/frame/systemmanagement/usermanagement/user/userlogin/passwordmanagement.action?frameControlSubmitFunction=init',\r\n");
      out.write("                                                          file: ['/frame/systemmanagement/usermanagement/user/userlogin/passwordmanagement.js'],\r\n");
      out.write("                                                          width: '400px',height: '300px',})\">\r\n");
      out.write("                            <i class=\"si si-lock \" style=\" float: right;\"></i>????????????</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("                    <li>\r\n");
      out.write("                        <a tabindex=\"-1\" href=\"javascript:void(0)\"\r\n");
      out.write("                           data-ng-click=\"logout()\">\r\n");
      out.write("                            <i class=\"si si-power \" style=\" float: right;\"></i>????????????</a>\r\n");
      out.write("                    </li>\r\n");
      out.write("\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("                           ");
      out.write("\r\n");
      out.write("                                                         ");
      out.write("\r\n");
      out.write("                                                         ");
      out.write("\r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("                            ");
      out.write("\r\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("                </ul>\r\n");
      out.write("                <div style=\"position: relative;top: 6px;display: inline-block;\">\r\n");
      out.write("                    <div class=\"btn-group btn-group-sm font-size-btn\" style=\"margin: -12px 0 0 10px;font-size: 14px\">\r\n");
      out.write("                        <button class=\"btn dropdown-toggle\" data-toggle=\"dropdown\" aria-expanded=\"false\" title=\"????????????\">\r\n");
      out.write("                            ??? <span id=\"fonttext\" style=\"font-size: 14px\"></span>\r\n");
      out.write("                            <span class=\"caret\"></span>\r\n");
      out.write("                        </button>\r\n");
      out.write("                        <ul class=\"dropdown-menu\">\r\n");
      out.write("                            <li class=\"dropdown-header\">????????????</li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"javascript:void(0)\" onclick=\"changeStyle('small')\">???</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"javascript:void(0)\" onclick=\"changeStyle('middle')\">???</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            <li>\r\n");
      out.write("                                <a href=\"javascript:void(0)\" onclick=\"changeStyle('large')\">???</a>\r\n");
      out.write("                            </li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <a data-ng-click=\"oneui.settings.sidebarMini = ! oneui.settings.sidebarMini\" data-js-blur title=\"????????????\" style=\"margin: 0 10px\" href=\"javascript:void(0)\" >\r\n");
      out.write("                        <i class=\"si si-list fa-2x\" style=\"color: white\"></i>\r\n");
      out.write("                    </a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("                    <script>\r\n");
      out.write("                        changeFont('");
      out.print(fontsizePreference);
      out.write("');\r\n");
      out.write("                        function changeStyle(size) {\r\n");
      out.write("                            console.log(size);\r\n");
      out.write("                            var obj1 = document.getElementById(\"ext-kendo-css\");\r\n");
      out.write("                            var urlkendo=root+\"/frame/resource/css/\"+size+\"/ext-kendo.css?jsVersion=\"+jsVersion;\r\n");
      out.write("                            obj1.setAttribute(\"href\",urlkendo);\r\n");
      out.write("                            var obj2 = document.getElementById(\"ext-oneui-css\");\r\n");
      out.write("                            var urlOneui=root+\"/frame/resource/css/\"+size+\"/ext-oneui.css?jsVersion=\"+jsVersion;\r\n");
      out.write("                            obj2.setAttribute(\"href\",urlOneui);\r\n");
      out.write("                            changeFont(size);\r\n");
      out.write("                            var form={\r\n");
      out.write("                                userId:frameControlUserId,\r\n");
      out.write("                                fontsizePreference:size\r\n");
      out.write("                            }\r\n");
      out.write("                            var url=root+\"/frame/systemmanagement/usermanagement/user/usermanagement.action?frameControlSubmitFunction=saveUserFont\"\r\n");
      out.write("                            $.ajax({type:\"POST\",\r\n");
      out.write("                                url:encodeURI(url),\r\n");
      out.write("                                contentType: 'application/json; charset=utf-8',\r\n");
      out.write("                                data:kendo.stringify(form),\r\n");
      out.write("                                dataType:\"json\",\r\n");
      out.write("                                success:function(){\r\n");
      out.write("                                },\r\n");
      out.write("                            });\r\n");
      out.write("                        }\r\n");
      out.write("                        function changeFont(val) {\r\n");
      out.write("                            console.log(\"changeFont::\");\r\n");
      out.write("                            console.log(val);\r\n");
      out.write("                            var fontsize = val? val:'small';\r\n");
      out.write("                            if(fontsize == 'small'){\r\n");
      out.write("                                $(\"#fonttext\").text('(???)')\r\n");
      out.write("                            }else if(fontsize == 'middle'){\r\n");
      out.write("                                $(\"#fonttext\").text('(???)')\r\n");
      out.write("                            }else{\r\n");
      out.write("                                $(\"#fonttext\").text('(???)')\r\n");
      out.write("                            }\r\n");
      out.write("                        }\r\n");
      out.write("                    </script>\r\n");
      out.write("\r\n");
      out.write("                    <a data-ng-click=\"oneui.settings.sidebarOpenXs = ! oneui.settings.sidebarOpenXs\" data-js-blur onclick=\"screenfull.toggle()\" title=\"????????????\" style=\"margin: 0 10px\" href=\"javascript:void(0)\" >\r\n");
      out.write("                        <i class=\"si si-frame fa-2x\" style=\"color: white\"></i>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("   ");
      out.write("\r\n");
      out.write("</ul>\r\n");
      out.write("<!-- END Header Navigation Right -->\r\n");
      out.write("\r\n");
      out.write("<!-- Header Navigation Left -->\r\n");
      out.write("<ul class=\"nav-header pull-left\" style=\"position: relative;\">\r\n");
      out.write("    <li>\r\n");
      out.write("        <div style=\"height:34px;width:500px; position: absolute;background-image: url(title.png);background-repeat:no-repeat;\">\r\n");
      out.write("        </div>\r\n");
      out.write("    </li>\r\n");
      out.write("    <li class=\"hidden-md hidden-lg\">\r\n");
      out.write("\r\n");
      out.write("    </li>\r\n");
      out.write("\r\n");
      out.write("   ");
      out.write("\r\n");
      out.write("</ul>\r\n");
      out.write("</header>\r\n");
      out.write("<!-- END Header Navigation Left -->\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
