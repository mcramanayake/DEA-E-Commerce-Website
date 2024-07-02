package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>About Us Page</title>\r\n");
      out.write("        <style>\r\n");
      out.write("            body{\r\n");
      out.write("               background-color: #193E29;\r\n");
      out.write("            }\r\n");
      out.write("            .about{\r\n");
      out.write("                margin-left: 5%;\r\n");
      out.write("                margin-right: 5%;\r\n");
      out.write("            }\r\n");
      out.write("            .about-container{\r\n");
      out.write("                display: flex;\r\n");
      out.write("            }\r\n");
      out.write("            .about-content{\r\n");
      out.write("                color: #fff;\r\n");
      out.write("                font-weight: 300;\r\n");
      out.write("                width: 60%;\r\n");
      out.write("                align-items: center;\r\n");
      out.write("                justify-content: center;\r\n");
      out.write("                padding-top: 10%;\r\n");
      out.write("                padding-left: 2%;\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            .about-content h1{\r\n");
      out.write("                font-weight: 700;\r\n");
      out.write("            }\r\n");
      out.write("            .about-content p{\r\n");
      out.write("                padding-top: 10px;\r\n");
      out.write("                color:#fff;\r\n");
      out.write("            }\r\n");
      out.write("            .discover{\r\n");
      out.write("                padding-top: 15px;\r\n");
      out.write("            }\r\n");
      out.write("            .discover button{\r\n");
      out.write("                color: white;\r\n");
      out.write("                border: 1px solid white;\r\n");
      out.write("                cursor: pointer;\r\n");
      out.write("                position: relative;\r\n");
      out.write("                height: 40px;\r\n");
      out.write("                width: 150px;\r\n");
      out.write("                font-size: 16px;\r\n");
      out.write("                font-family: Inter;\r\n");
      out.write("                font-weight: 700;\r\n");
      out.write("                word-wrap: break-word;\r\n");
      out.write("                background: transparent;\r\n");
      out.write("                font-family: 'Montserrat', sans-serif;\r\n");
      out.write("            }\r\n");
      out.write("            .members{\r\n");
      out.write("                 margin-top: 5%;\r\n");
      out.write("            }\r\n");
      out.write("            .b-title{                    \r\n");
      out.write("                text-align: center;\r\n");
      out.write("                color: #FFF;\r\n");
      out.write("                font-size: 24px;\r\n");
      out.write("                font-weight: bold;\r\n");
      out.write("                margin-bottom: 4%;\r\n");
      out.write("            }\r\n");
      out.write("            .row{\r\n");
      out.write("                padding-left: 5px;\r\n");
      out.write("                \r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            .member-card{\r\n");
      out.write("                    color: #FFF;\r\n");
      out.write("                    background-color: transparent;\r\n");
      out.write("                    width: 260px;\r\n");
      out.write("                    height: 550px;\r\n");
      out.write("                    border: none;\r\n");
      out.write("                    text-align: center;\r\n");
      out.write("                }\r\n");
      out.write("            .member-card img{\r\n");
      out.write("                width: 260px;\r\n");
      out.write("                height:300px;\r\n");
      out.write("            }\r\n");
      out.write("            .img-container{\r\n");
      out.write("                margin-top: 10px;\r\n");
      out.write("            }\r\n");
      out.write("            .img-container h4{\r\n");
      out.write("                font-size: 20px;\r\n");
      out.write("                color: #FFF;\r\n");
      out.write("            }\r\n");
      out.write("            .img-container p{\r\n");
      out.write("                font-size: 14px;\r\n");
      out.write("                color: #FFF;\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            @media (max-width: 991px){\r\n");
      out.write("                .about{\r\n");
      out.write("                    margin-left: 0;\r\n");
      out.write("                    margin-right: 0;\r\n");
      out.write("                }\r\n");
      out.write("                .about-container{\r\n");
      out.write("                    display: block;\r\n");
      out.write("                    padding-top: 20%;\r\n");
      out.write("                    \r\n");
      out.write("                }\r\n");
      out.write("                .about-img img{\r\n");
      out.write("                    width: 400px;\r\n");
      out.write("                }\r\n");
      out.write("                .about-content{\r\n");
      out.write("                    align-items: center;\r\n");
      out.write("                    justify-content: center;\r\n");
      out.write("                    padding-left: 5%;\r\n");
      out.write("                    width: 400px;\r\n");
      out.write("                }\r\n");
      out.write("                \r\n");
      out.write("            }\r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
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
      out.write("        <div class=\"about\">\r\n");
      out.write("           <div class=\"about-container\">\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("            <div class=\"about-img\">\r\n");
      out.write("                <center><img src=\"img/about.jpg\"></center>\r\n");
      out.write("            </div>\r\n");
      out.write("            ");
      out.write("\r\n");
      out.write("            <div class=\"about-content\">\r\n");
      out.write("                <h1>OUR STORY</h1>\r\n");
      out.write("                <p>Welcome to the official website of Verdevo, brought to life by the collaborative efforts of our dedicated team as part of our final group assignment for our Development Enterprise Applications (DEA) course.<br> <br>\r\n");
      out.write("                    Here, you'll discover a seamless fusion of technology and sustainability, as we've utilized JavaServer Pages (JSP) and servlets to bring our vision to fruition. Our website isn't just a digital storefront; it's a platform designed to showcase our commitment to eco-friendly fashion and responsible business practices.<br> <br>\r\n");
      out.write("                    With JSP and servlets, we've crafted an intuitive and dynamic online shopping experience that allows you to explore our collection of sustainable garments with ease. From browsing our latest arrivals to securely checking out, every aspect of our website is tailored to provide you with a seamless and enjoyable shopping journey. <br> <br>\r\n");
      out.write("                    Behind the scenes, our team has worked tirelessly to ensure that our website reflects the values of Verdevo. We've implemented efficient database management systems and optimized server-side processing to minimize our environmental footprint and enhance the performance of our platform. <br> <br>\r\n");
      out.write("                    As we present our final group assignment, we invite you to explore our website and discover the passion and dedication that went into its creation. Thank you for joining us on this journey towards a more sustainable future, powered by technology and innovation.\r\n");
      out.write("                </p>\r\n");
      out.write("            </div> \r\n");
      out.write("        </div>\r\n");
      out.write("        </div>\r\n");
      out.write("          \r\n");
      out.write("        <div class=\"members\">\r\n");
      out.write("            <div class=\"members-content\">\r\n");
      out.write("                <div class=\"bellow-section\">\r\n");
      out.write("                  <p class=\"b-title\">Meet Our Passionate Software Development Team</p>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-3\">\r\n");
      out.write("                        <div class=\"member-card\">\r\n");
      out.write("                            <img src=\"img/isira.jpg\" alt=\"1\">\r\n");
      out.write("                            <div class=\"img-container\">\r\n");
      out.write("                              <h4>I Wickramasinghe</h4>\r\n");
      out.write("                              <p class=\"card-title\">Software Developer</p>\r\n");
      out.write("                              <p class=\"university\">NSBM Green University</p>\r\n");
      out.write("                              <p class=\"email\">iwickramasinghe@students.nsbm.ac.lk</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-3\">\r\n");
      out.write("                        <div class=\"member-card\">\r\n");
      out.write("                            <img src=\"img/senuki.jpg\" alt=\"1\">\r\n");
      out.write("                            <div class=\"img-container\">\r\n");
      out.write("                              <h4>I A S M Perera</h4>\r\n");
      out.write("                              <p class=\"card-title\">Software Developer</p>\r\n");
      out.write("                              <p class=\"university\">NSBM Green University</p>\r\n");
      out.write("                              <p class=\"email\">pereraasm@students.nsbm.ac.lk</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-3\">\r\n");
      out.write("                        <div class=\"member-card\">\r\n");
      out.write("                            <img src=\"img/chinthaka.jpg\" alt=\"1\">\r\n");
      out.write("                            <div class=\"img-container\">\r\n");
      out.write("                              <h4>M C Ramanayake</h4>\r\n");
      out.write("                              <p class=\"card-title\">Software Developer</p>\r\n");
      out.write("                              <p class=\"university\">NSBM Green University</p>\r\n");
      out.write("                              <p class=\"email\">mcramanayaka@students.nsbm.ac.lk</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-3\">\r\n");
      out.write("                        <div class=\"member-card\">\r\n");
      out.write("                            <img src=\"img/lakmi.jpg\" alt=\"1\">\r\n");
      out.write("                            <div class=\"img-container\">\r\n");
      out.write("                              <h4>M L P Kodithuwakku</h4>\r\n");
      out.write("                              <p class=\"card-title\">Software Developer</p>\r\n");
      out.write("                              <p class=\"university\">NSBM Green University</p>\r\n");
      out.write("                              <p class=\"email\">mlpkodithuwakku@students.nsbm.ac.lk</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <center>\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-4\">\r\n");
      out.write("                        <div class=\"member-card\">\r\n");
      out.write("                            <img src=\"img/nimsara.jpg\" alt=\"1\">\r\n");
      out.write("                            <div class=\"img-container\">\r\n");
      out.write("                              <h4>G M S Nimsara</h4>\r\n");
      out.write("                              <p class=\"card-title\">Software Developer</p>\r\n");
      out.write("                              <p class=\"university\">NSBM Green University</p>\r\n");
      out.write("                              <p class=\"email\">gmsnimsara@students.nsbm.ac.lk</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-4\">\r\n");
      out.write("                        <div class=\"member-card\">\r\n");
      out.write("                            <img src=\"img/shehan.jpg\" alt=\"1\">\r\n");
      out.write("                            <div class=\"img-container\">\r\n");
      out.write("                              <h4>S Sanjula</h4>\r\n");
      out.write("                              <p class=\"card-title\">Software Developer</p>\r\n");
      out.write("                              <p class=\"university\">NSBM Green University</p>\r\n");
      out.write("                              <p class=\"email\">hdssanjula@students.nsbm.ac.lk</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-4\">\r\n");
      out.write("                        <div class=\"member-card\">\r\n");
      out.write("                            <img src=\"img/awanthi.jpg\" alt=\"1\">\r\n");
      out.write("                            <div class=\"img-container\">\r\n");
      out.write("                              <h4>M A Y Malawanage</h4>\r\n");
      out.write("                              <p class=\"card-title\">Software Developer</p>\r\n");
      out.write("                              <p class=\"university\">NSBM Green University</p>\r\n");
      out.write("                              <p class=\"email\">Malawanagemay@students.nsbm.ac.lk</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                </center>\r\n");
      out.write("                <center>\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-md-6\">\r\n");
      out.write("                        <div class=\"member-card\">\r\n");
      out.write("                            <img src=\"img/prabasha.jpg\" alt=\"1\">\r\n");
      out.write("                            <div class=\"img-container\">\r\n");
      out.write("                              <h4>J P Rashmitha</h4>\r\n");
      out.write("                              <p class=\"card-title\">Software Developer</p>\r\n");
      out.write("                              <p class=\"university\">NSBM Green University</p>\r\n");
      out.write("                              <p class=\"email\">jkprashmitha@students.nsbm.ac.lk</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-6\">\r\n");
      out.write("                        <div class=\"member-card\">\r\n");
      out.write("                            <img src=\"img/ruwanthi.jpg\" alt=\"1\">\r\n");
      out.write("                            <div class=\"img-container\">\r\n");
      out.write("                              <h4>B H R Yashodara</h4>\r\n");
      out.write("                              <p class=\"card-title\">Software Developer</p>\r\n");
      out.write("                              <p class=\"university\">NSBM Green University</p>\r\n");
      out.write("                              <p class=\"email\">bhryashodara@students.nsbm.ac.lk</p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                </center>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("         ");
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