package org.apache.jsp.adminpage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addnew_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/adminpage/allCss.jsp");
  }

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <link href='https://unpkg.com/boxicons@2.0.7/css/boxicons.min.css' rel='stylesheet'>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"navbar.css\">\r\n");
      out.write("        \r\n");
      out.write("        ");
      out.write(" <script src=\"https://unpkg.com/boxicons@2.1.4/dist/boxicons.js\"></script>\r\n");
      out.write(" \r\n");
      out.write(" \r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"path/to/font-awesome/css/font-awesome.min.css\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"style.css\">\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        <div class=\"sidebar\">\r\n");
      out.write("            <div class=\"logo-details\">\r\n");
      out.write("              \r\n");
      out.write("                <div class=\"logo_name\">LOGO HERE</div>\r\n");
      out.write("                <i class='bx bx-menu' id=\"btn\" ></i>\r\n");
      out.write("            </div>\r\n");
      out.write("            <ul class=\"nav-list\">\r\n");
      out.write("                <li>\r\n");
      out.write("                  <i class='bx bx-search' ></i>\r\n");
      out.write("                 <input type=\"text\" placeholder=\"Search...\">\r\n");
      out.write("                 <span class=\"tooltip\">Search</span>\r\n");
      out.write("              </li>\r\n");
      out.write("              <li>\r\n");
      out.write("                  <a href=\"home.jsp\" >\r\n");
      out.write("                  <i class='bx bx-grid-alt'></i>\r\n");
      out.write("                  <span class=\"links_name\">Dashboard</span>\r\n");
      out.write("                </a>\r\n");
      out.write("                 <span class=\"tooltip \">Dashboard</span>\r\n");
      out.write("              </li>\r\n");
      out.write("              \r\n");
      out.write("             <li>\r\n");
      out.write("               <a href=\"addnew.jsp\">\r\n");
      out.write("                 <i class='bx bx-chat' ></i>\r\n");
      out.write("                 <span class=\"links_name\">Add New Item</span>\r\n");
      out.write("               </a>\r\n");
      out.write("               <span class=\"tooltip\">Add New Item</span>\r\n");
      out.write("             </li>\r\n");
      out.write("             <li class=\"list\">\r\n");
      out.write("               <a href=\"#\">\r\n");
      out.write("                 <i class='bx bx-pie-chart-alt-2' ></i>\r\n");
      out.write("                 <span class=\"links_name\">All Items</span>\r\n");
      out.write("               </a>\r\n");
      out.write("               <span class=\"tooltip\">All Items</span>\r\n");
      out.write("             </li>\r\n");
      out.write("             <li class=\"list\">\r\n");
      out.write("               <a href=\"#\">\r\n");
      out.write("                 <i class='bx bx-folder' ></i>\r\n");
      out.write("                 <span class=\"links_name\">Analytics</span>\r\n");
      out.write("               </a>\r\n");
      out.write("               <span class=\"tooltip\">Files</span>\r\n");
      out.write("             </li>\r\n");
      out.write("             <li class=\"list\">\r\n");
      out.write("               <a href=\"#\">\r\n");
      out.write("                 <i class='bx bx-cart-alt' ></i>\r\n");
      out.write("                 <span class=\"links_name\">Orders</span>\r\n");
      out.write("               </a>\r\n");
      out.write("               <span class=\"tooltip\">Orders</span>\r\n");
      out.write("             </li>\r\n");
      out.write("             <li class=\"list\">\r\n");
      out.write("               <a href=\"#\">\r\n");
      out.write("                 <i class='bx bx-heart' ></i>\r\n");
      out.write("                 <span class=\"links_name\">Reviews</span>\r\n");
      out.write("               </a>\r\n");
      out.write("               <span class=\"tooltip\">Reviews</span>\r\n");
      out.write("             </li>\r\n");
      out.write("             <li class=\"list\">\r\n");
      out.write("               <a href=\"#\">\r\n");
      out.write("                 <i class='bx bx-user' ></i>\r\n");
      out.write("                 <span class=\"links_name\">User</span>\r\n");
      out.write("               </a>\r\n");
      out.write("               <span class=\"tooltip\">User</span>\r\n");
      out.write("             </li>\r\n");
      out.write("             <li class=\"list\">\r\n");
      out.write("               <a href=\"#\">\r\n");
      out.write("                 <i class='bx bx-cog' ></i>\r\n");
      out.write("                 <span class=\"links_name\">Setting</span>\r\n");
      out.write("               </a>\r\n");
      out.write("               <span class=\"tooltip\">Setting</span>\r\n");
      out.write("             </li>\r\n");
      out.write("             <li class=\"profile\">\r\n");
      out.write("                 <div class=\"profile-details\">\r\n");
      out.write("                   <img src=\"profile.jpg\" alt=\"profileImg\">\r\n");
      out.write("                   <div class=\"name_job\">\r\n");
      out.write("                     <div class=\"name\">Prem Shahi</div>\r\n");
      out.write("                     <div class=\"job\">Web designer</div>\r\n");
      out.write("                   </div>\r\n");
      out.write("                 </div>\r\n");
      out.write("                 <i class='bx bx-log-out' id=\"log_out\" ></i>\r\n");
      out.write("             </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("          </div>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        <section class=\"home-section\">\r\n");
      out.write("            <div class=\"text\">Add New Item</div>\r\n");
      out.write("        </section>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        <script>\r\n");
      out.write("            let sidebar = document.querySelector(\".sidebar\");\r\n");
      out.write("            let closeBtn = document.querySelector(\"#btn\");\r\n");
      out.write("            let searchBtn = document.querySelector(\".bx-search\");\r\n");
      out.write("            closeBtn.addEventListener(\"click\", ()=>{\r\n");
      out.write("              sidebar.classList.toggle(\"open\");\r\n");
      out.write("              menuBtnChange();//calling the function(optional)\r\n");
      out.write("            });\r\n");
      out.write("            searchBtn.addEventListener(\"click\", ()=>{ // Sidebar open when you click on the search iocn\r\n");
      out.write("              sidebar.classList.toggle(\"open\");\r\n");
      out.write("              menuBtnChange(); //calling the function(optional)\r\n");
      out.write("            });\r\n");
      out.write("            // following are the code to change sidebar button(optional)\r\n");
      out.write("            function menuBtnChange() {\r\n");
      out.write("             if(sidebar.classList.contains(\"open\")){\r\n");
      out.write("               closeBtn.classList.replace(\"bx-menu\", \"bx-menu-alt-right\");//replacing the iocns class\r\n");
      out.write("             }else {\r\n");
      out.write("               closeBtn.classList.replace(\"bx-menu-alt-right\",\"bx-menu\");//replacing the iocns class\r\n");
      out.write("             }\r\n");
      out.write("            }\r\n");
      out.write("        </script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
