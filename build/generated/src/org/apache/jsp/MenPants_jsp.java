package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class MenPants_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/all_component/allCss.jsp");
    _jspx_dependants.add("/all_component/navbar.jsp");
    _jspx_dependants.add("/all_component/footer.jsp");
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
      out.write("        <title>Men Pants</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <style>\r\n");
      out.write("            body{\r\n");
      out.write("                padding-top: 150px;\r\n");
      out.write("            }\r\n");
      out.write("            .card{\r\n");
      out.write("                width: 253px;\r\n");
      out.write("                height: 500px;\r\n");
      out.write("                border: none;\r\n");
      out.write("                margin: 18px;\r\n");
      out.write("            }\r\n");
      out.write("            .card-body button{\r\n");
      out.write("                color: white;\r\n");
      out.write("                border: 1px solid white;\r\n");
      out.write("                border-radius: 50px;\r\n");
      out.write("                cursor: pointer;\r\n");
      out.write("                position: relative;\r\n");
      out.write("                height: 40px;\r\n");
      out.write("                width: 200px;\r\n");
      out.write("                font-size: 16px;\r\n");
      out.write("                font-family: Inter;\r\n");
      out.write("                font-weight: 700;\r\n");
      out.write("                word-wrap: break-word;\r\n");
      out.write("                background: #193E29;\r\n");
      out.write("                font-family: 'Montserrat', sans-serif;\r\n");
      out.write("                margin-top: 20px;\r\n");
      out.write("            }\r\n");
      out.write("            .card-img{\r\n");
      out.write("                overflow: hidden;\r\n");
      out.write("                position: relative;\r\n");
      out.write("                display: inline-block;\r\n");
      out.write("                cursor: pointer;\r\n");
      out.write("            }\r\n");
      out.write("            .cardh{\r\n");
      out.write("                height: 100%;\r\n");
      out.write("                width: 100%;\r\n");
      out.write("                background-size: cover;\r\n");
      out.write("                transition: all 1.1s;\r\n");
      out.write("            }\r\n");
      out.write("            .card-img:hover .cardh{\r\n");
      out.write("                transform: scale(1.2);\r\n");
      out.write("            }\r\n");
      out.write("            .card-body button:hover{\r\n");
      out.write("                background: transparent;\r\n");
      out.write("                color: #193E29;\r\n");
      out.write("                border: 1px solid #193E29;\r\n");
      out.write("            }\r\n");
      out.write("            .card p{\r\n");
      out.write("                text-align: center;\r\n");
      out.write("            }\r\n");
      out.write("            .row{\r\n");
      out.write("                display: block;\r\n");
      out.write("                align-items: center;\r\n");
      out.write("                justify-content: center;\r\n");
      out.write("            }\r\n");
      out.write("            h2{\r\n");
      out.write("                font-weight: bolder;\r\n");
      out.write("                color: #193E29;\r\n");
      out.write("                text-align: center;\r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
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
      out.write("<link rel=\"stylesheet\" href=\"all_component/style.css\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://unicons.iconscout.com/release/v4.0.8/css/line.css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        ");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark fixed-top\" style=\"background-color: #193E29;\">\r\n");
      out.write("    <a class=\"navbar-brand\" href=\"#\"><img src=\"img/logo.png\" style=\"width: 115px; height: 70px;\"></a>\r\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("  </button>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("    <ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("      <li class=\"nav-item\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"index.jsp\">HOME<span class=\"sr-only\">(current)</span></a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item active dropdown\">\r\n");
      out.write("        <a class=\"nav-link dropdown-toggle\" href=\"ladies.jsp\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("          WOMEN'S\r\n");
      out.write("        </a>\r\n");
      out.write("        <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\" style=\"background-color: #193E29;\">\r\n");
      out.write("            <a class=\"dropdown-item\" href=\"Ladies_t-shirt.jsp\" style=\"color: white;\" onmouseover=\"this.style.color='#193E29' \" onmouseout=\"this.style.color='white'\">T-Shirts</a>\r\n");
      out.write("          <a class=\"dropdown-item\" href=\"Ladies-croptops.jsp\" style=\"color: white;\" onmouseover=\"this.style.color='#193E29'\" onmouseout=\"this.style.color='white'\">Crop-Tops</a>\r\n");
      out.write("          <a class=\"dropdown-item\" href=\"Ladies-Pants.jsp\" style=\"color: white;\" onmouseover=\"this.style.color='#193E29'\" onmouseout=\"this.style.color='white'\">Pants</a>\r\n");
      out.write("          <a class=\"dropdown-item\" href=\"Ladies-Short.jsp\" style=\"color: white;\" onmouseover=\"this.style.color='#193E29'\" onmouseout=\"this.style.color='white'\">Shorts</a>\r\n");
      out.write("          <a class=\"dropdown-item\" href=\"Ladies-Jacket.jsp\" style=\"color: white;\" onmouseover=\"this.style.color='#193E29'\" onmouseout=\"this.style.color='white'\">Jackets</a>\r\n");
      out.write("          \r\n");
      out.write("        </div>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item dropdown active\">\r\n");
      out.write("        <a class=\"nav-link dropdown-toggle\" href=\"Men.jsp\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("          MEN'S\r\n");
      out.write("        </a>\r\n");
      out.write("        <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\" style=\"background-color: #193E29;\">\r\n");
      out.write("          <a class=\"dropdown-item\" href=\"MenTshirts.jsp\" style=\"color: white;\" onmouseover=\"this.style.color='#193E29'\" onmouseout=\"this.style.color='white'\">T-Shirts</a>\r\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\" style=\"color: white;\" onmouseover=\"this.style.color='#193E29'\" onmouseout=\"this.style.color='white'\">Pants</a>\r\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\" style=\"color: white;\" onmouseover=\"this.style.color='#193E29'\" onmouseout=\"this.style.color='white'\">Shorts</a>\r\n");
      out.write("          <a class=\"dropdown-item\" href=\"#\" style=\"color: white;\" onmouseover=\"this.style.color='#193E29'\" onmouseout=\"this.style.color='white'\">Jackets</a>\r\n");
      out.write("         \r\n");
      out.write("        </div>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item dropdown active\" >\r\n");
      out.write("        <a class=\"nav-link dropdown-toggle\" href=\"newarr.jsp\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("          SHOP LATEST\r\n");
      out.write("        </a>\r\n");
      out.write("        <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\" style=\"background-color: #193E29;\">\r\n");
      out.write("          <a class=\"dropdown-item\" href=\"newarr.jsp#latest_release\" style=\"color: white;\" onmouseover=\"this.style.color='#193E29'\" onmouseout=\"this.style.color='white'\">New Drop</a>\r\n");
      out.write("          <a class=\"dropdown-item\" href=\"newarr.jsp#top_sell\" style=\"color: white;\" onmouseover=\"this.style.color='#193E29'\" onmouseout=\"this.style.color='white'\">Best Selling</a>\r\n");
      out.write("          \r\n");
      out.write("        </div>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item dropdown active\" >\r\n");
      out.write("        <a class=\"nav-link dropdown-toggle\" href=\"Accessories.jsp\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("          ACCESSORIES\r\n");
      out.write("        </a>\r\n");
      out.write("        <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\" style=\"background-color: #193E29;\">\r\n");
      out.write("          <a class=\"dropdown-item\" href=\"Accessories.jsp#shoes\" style=\"color: white;\" onmouseover=\"this.style.color='#193E29'\" onmouseout=\"this.style.color='white'\">Shoes</a>\r\n");
      out.write("          <a class=\"dropdown-item\" href=\"Accessories.jsp#bags\" style=\"color: white;\" onmouseover=\"this.style.color='#193E29'\" onmouseout=\"this.style.color='white'\">Bags</a>\r\n");
      out.write("          \r\n");
      out.write("        </div>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item active\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"giftcard.jsp\">GIFT CARDS</a>\r\n");
      out.write("      </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <!--<form class=\"form-inline my-2 my-lg-0\">\r\n");
      out.write("      \r\n");
      out.write("     <button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\">Search</button>\r\n");
      out.write("    </form>!-->\r\n");
      out.write("      <div class=\"form-inline my-2 my-lg-0\">\r\n");
      out.write("          <ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("            <!--<li class=\"nav-item\">\r\n");
      out.write("                <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\r\n");
      out.write("            </li>!-->\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("              <a class=\"nav-link disabled\" href=\"Login.jsp\"><box-icon name='user-circle'  color='#ffffff' ></box-icon></a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li class=\"nav-item\">\r\n");
      out.write("              <a class=\"nav-link disabled\" href=\"cart.jsp\"><box-icon name='cart-alt' color='#ffffff'></box-icon></a>\r\n");
      out.write("            </li>\r\n");
      out.write("          </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("        <h2>PANTS</h2>\r\n");
      out.write("        <br>\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"card\">\r\n");
      out.write("                <div class=\"card-img\">\r\n");
      out.write("                <div  class=\"cardh\"><img alt=\"\" src=\"img/mp2.jpeg\" style=\"width:253px; height: 350px;\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("                    <div class=\"card-body\">\r\n");
      out.write("                        <p><b>Dark Green Cargo Pant</b></p>\r\n");
      out.write("                        <p>LKR 9,650.00</p>\r\n");
      out.write("                        <a><button>ADD TO CART</button></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"card\">\r\n");
      out.write("                <div class=\"card-img\">\r\n");
      out.write("                <div  class=\"cardh\"><img alt=\"\" src=\"img/mp3.jpeg\" style=\"width:253px; height: 350px;\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                            <p><b>Casual Patch Denim</b></p>\r\n");
      out.write("                            <p>LKR 7,450.00</p>\r\n");
      out.write("                        <a><button>ADD TO CART</button></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"card\">\r\n");
      out.write("                <div class=\"card-img\">\r\n");
      out.write("                <div  class=\"cardh\"><img alt=\"\" src=\"img/mp4.jpeg\" style=\"width:253px; height: 350px;\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("                    <div class=\"card-body\">\r\n");
      out.write("                        <p><b>Casual Cotton Pant</b></p>\r\n");
      out.write("                            <p>LKR 7,350.00</p>\r\n");
      out.write("                        <a><button>ADD TO CART</button></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"card\">\r\n");
      out.write("                <div class=\"card-img\">\r\n");
      out.write("                <div  class=\"cardh\"><img alt=\"\" src=\"img/mp5.jpeg\" style=\"width:253px; height: 350px;\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("                    <div class=\"card-body\">\r\n");
      out.write("                        <p><b>Black Color Casual Pant</b></p>\r\n");
      out.write("                            <p>LKR 6,900.00</p>\r\n");
      out.write("                        <a><button>ADD TO CART</button></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        <br><br>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"card\">\r\n");
      out.write("                <div class=\"card-img\">\r\n");
      out.write("                <div  class=\"cardh\"><img alt=\"\" src=\"img/mp6.jpeg\" style=\"width:253px; height: 350px;\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("                    <div class=\"card-body\">\r\n");
      out.write("                        <p><b>Dennim Casual Pant</b></p>\r\n");
      out.write("                            <p>LKR 9,500.00</p>\r\n");
      out.write("                        <a><button>ADD TO CART</button></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"card\">\r\n");
      out.write("                <div class=\"card-img\">\r\n");
      out.write("                <div  class=\"cardh\"><img alt=\"\" src=\"img/mp7.jpeg\" style=\"width:253px; height: 350px;\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("                    <div class=\"card-body\">\r\n");
      out.write("                        <p><b>White Color Casual Pant</b></p>\r\n");
      out.write("                            <p>LKR 7,600.00</p>\r\n");
      out.write("                        <a><button>ADD TO CART</button></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            \r\n");
      out.write("            <div class=\"card\">\r\n");
      out.write("                <div class=\"card-img\">\r\n");
      out.write("                <div  class=\"cardh\"><img alt=\"\" src=\"img/mp8.jpeg\" style=\"width:253px; height: 350px;\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("                    <div class=\"card-body\">\r\n");
      out.write("                        <p><b>Linnen Cargo Pant</b></p>\r\n");
      out.write("                            <p>LKR 7,800.00</p>\r\n");
      out.write("                        <a><button>ADD TO CART</button></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"card\">\r\n");
      out.write("                <div class=\"card-img\">\r\n");
      out.write("                <div  class=\"cardh\"><img alt=\"\" src=\"img/mp9.jpeg\" style=\"width:253px; height: 350px;\"></div>\r\n");
      out.write("                </div>\r\n");
      out.write("                    <div class=\"card-body\">\r\n");
      out.write("                        <p><b>Gray Color Cargo Pant</b></p>\r\n");
      out.write("                            <p>LKR 8,000.00</p>\r\n");
      out.write("                        <a><button>ADD TO CART</button></a>\r\n");
      out.write("                    </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        ");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("  <title>Footer Design</title>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"all_component/footer.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("  <footer class=\"footer\">\r\n");
      out.write("  \t <div class=\"container\">\r\n");
      out.write("  \t \t<div class=\"row\">\r\n");
      out.write("  \t \t\t<div class=\"footer-col\">\r\n");
      out.write("  \t \t\t\t<h4>MENU</h4>\r\n");
      out.write("  \t \t\t\t<ul>\r\n");
      out.write("  \t \t\t\t\t<li><a href=\"index.jsp\">HOME</a></li>\r\n");
      out.write("  \t \t\t\t\t<li><a href=\"ladies.jsp\">WOMENS</a></li>\r\n");
      out.write("  \t \t\t\t\t<li><a href=\"Men.jsp\">MENS</a></li>\r\n");
      out.write("  \t \t\t\t\t<li><a href=\"Accessories.jsp\">ACCESSORIES</a></li>\r\n");
      out.write("  \t \t\t\t</ul>\r\n");
      out.write("  \t \t\t</div>\r\n");
      out.write("  \t \t\t<div class=\"footer-col\">\r\n");
      out.write("  \t \t\t\t<h4>SHOP LATEST</h4>\r\n");
      out.write("  \t \t\t\t<ul>\r\n");
      out.write("  \t \t\t\t\t<li><a href=\"newarr.jsp#latest_release\">NEW DROP</a></li>\r\n");
      out.write("  \t \t\t\t\t<li><a href=\"newarr.jsp#top_sell\">BEST SELLING</a></li>\r\n");
      out.write("  \t \t\t\t\t\r\n");
      out.write("  \t \t\t\t</ul>\r\n");
      out.write("  \t \t\t</div>\r\n");
      out.write("  \t \t\t<div class=\"footer-col\">\r\n");
      out.write("  \t \t\t\t<h4>SUPPORT</h4>\r\n");
      out.write("  \t \t\t\t<ul>\r\n");
      out.write("  \t \t\t\t\t<li><a href=\"about.jsp\">ABOUT US</a></li>\r\n");
      out.write("  \t \t\t\t\t<li><a href=\"contactus.jsp\">CONTACT US</a></li>\r\n");
      out.write("  \t \t\t\t\t<li><a href=\"help.jsp\">FAQ</a></li>\r\n");
      out.write("  \t \t\t\t\t\r\n");
      out.write("  \t \t\t\t</ul>\r\n");
      out.write("  \t \t\t</div>\r\n");
      out.write("  \t \t\t<div class=\"footer-col\">\r\n");
      out.write("  \t \t\t\t<h4>follow us</h4>\r\n");
      out.write("  \t \t\t\t<div class=\"social-links\">\r\n");
      out.write("  \t \t\t\t\t<a href=\"www.facebook.com\"><i class=\"fab fa-facebook-f\"></i></a>\r\n");
      out.write("  \t \t\t\t\t<a href=\"www.twitter.com\"><i class=\"fab fa-twitter\"></i></a>\r\n");
      out.write("  \t \t\t\t\t<a href=\"www.instagram.com\"><i class=\"fab fa-instagram\"></i></a>\r\n");
      out.write("  \t \t\t\t\t\r\n");
      out.write("  \t \t\t\t</div>\r\n");
      out.write("  \t \t\t</div>\r\n");
      out.write("  \t \t</div>\r\n");
      out.write("  \t </div>\r\n");
      out.write("  </footer>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");
      out.write("\r\n");
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
