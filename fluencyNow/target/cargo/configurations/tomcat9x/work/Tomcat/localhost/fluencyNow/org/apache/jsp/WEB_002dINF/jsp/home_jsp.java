/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.22
 * Generated at: 2023-05-05 01:02:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-5.2.3.RELEASE.jar", Long.valueOf(1683248332665L));
    _jspx_dependants.put("jar:file:/C:/Users/robson.vlima3/IdeaProjects/fluencynow/fluencyNow/target/cargo/configurations/tomcat9x/webapps/fluencyNow/WEB-INF/lib/spring-webmvc-5.2.3.RELEASE.jar!/META-INF/spring.tld", Long.valueOf(1578999040000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fnobody;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"pt-BR\">\r\n");
      out.write("\r\n");
      if (_jspx_meth_spring_005furl_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      if (_jspx_meth_spring_005furl_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<meta charset=\"utf-8\"/>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("  <title>Fluency Now</title>\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${allminCSS}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${indexCSS}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("  <!-- <link rel=\"stylesheet\" href=\"reset.css\"> -->\r\n");
      out.write("  <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("  <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css2?family=Montserrat&display=swap\" rel=\"stylesheet\">\r\n");
      out.write(" </head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("  <header>\r\n");
      out.write("    <nav class=\"navbar navbar-expand-md navbar-light bg-light\">\r\n");
      out.write("      <div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("        <a class=\"navbar-brand\" href=\"#\">\r\n");
      out.write("          <img src=\"resources/images/Logo.png\" alt=\"Logo\" style=\"height: 150px;\">\r\n");
      out.write("        </a>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"navbar-text mx-auto\">\r\n");
      out.write("          Fluency Now\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("          <li class=\"nav-item\">\r\n");
      out.write("            <a class=\"admin-btn\" href=\"login\">Administrador</a>\r\n");
      out.write("          </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("  </header>\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("      <div class=\"col-md-6\">\r\n");
      out.write("        <h2>Porque escolher a Fluency Now?</h2>\r\n");
      out.write("        <p>\r\n");
      out.write("            <br>A Fluency Now nasceu do amor pela lingua inglesa e pela paixao em ensinar da Helena Carvalho.\r\n");
      out.write("                          Após lecionar em escolas particulares por mais de 10 anos, em 2005 Helena decidiu criar seu proprio método de\r\n");
      out.write("                          ensino, afinal, cada aluno tem um ritmo de aprendizado diferente, então não é eficaz utilizar o mesmo método\r\n");
      out.write("                          para todos. Assim, ela segue\r\n");
      out.write("                          ensinando a língua inglesa até hoje, adaptando o ensino aos alunos.\r\n");
      out.write("                          A Fluency Now acredita que para o aprendizado não tem limites, então não existe idade certa para iniciar seus\r\n");
      out.write("                          estudos, atendemos alunos de todas as idades e todos os niveis, do básico ao avançado.\r\n");
      out.write("                          Quer conhecer melhor a Flueny Now? Nos envie uma mensagem que iremos atender e respeitar o seu processo de\r\n");
      out.write("                          aprendizado com paciencia e paixão pela língua inglesa.</p>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"col-md-6\">\r\n");
      out.write("        <form class=\"formulario-contato\">\r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <label for=\"nome\"></label>\r\n");
      out.write("            <input type=\"text\" class=\"form-control\" id=\"nome\" placeholder=\"Digite seu nome\">\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <label for=\"email\"></label>\r\n");
      out.write("            <input type=\"email\" class=\"form-control\" id=\"email\" placeholder=\"Digite seu e-mail\">\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <label for=\"data-nascimento\"></label>\r\n");
      out.write("            <input type=\"date\" textarea class=\"form-control\" id=\"data-nascimento\"\r\n");
      out.write("              placeholder=\"Digite sua data data de nascimento\"></textarea>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <label for=\"endereco\"></label>\r\n");
      out.write("            <input type=\"address\" textarea class=\"form-control\" id=\"endereco\"\r\n");
      out.write("              placeholder=\"Digite seu endereco\"></textarea>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"form-group\">\r\n");
      out.write("            <label for=\"telefone\"></label>\r\n");
      out.write("            <input type=\"number\" textarea class=\"form-control\" id=\"telefone\"\r\n");
      out.write("              placeholder=\"Digite seu telefone\"></textarea>\r\n");
      out.write("            <a href=\"https://wa.me/5511945390855\" class=\"btn btn-primary btn-enviar\">Enviar WhatsApp <img class=\"whats\"\r\n");
      out.write("                src=\"resources/images/whatsapp1.png\" /></a>\r\n");
      out.write("          </div>\r\n");
      out.write("          <!-- <a href=\"https://wa.me/5511945390855\" class=\"btn btn-primary btn-enviar\" >Enviar WhatsApp <img class=\"whats\" src=\"resources/images/whatsapp1.png\" > -->\r\n");
      out.write("        </form>\r\n");
      out.write("\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <div class=\"container-2\">\r\n");
      out.write("    <h1>Pacotes</h1>\r\n");
      out.write("\r\n");
      out.write("    <div id=\"demo\" class=\"carousel slide\" data-ride=\"carousel\">\r\n");
      out.write("\r\n");
      out.write("      <!-- Indicators -->\r\n");
      out.write("      <ul class=\"carousel-indicators mb-0 pb-0\">\r\n");
      out.write("        <li data-target=\"#demo\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("        <li data-target=\"#demo\" data-slide-to=\"1\"></li>\r\n");
      out.write("\r\n");
      out.write("      </ul>\r\n");
      out.write("\r\n");
      out.write("      <!-- The slideshow -->\r\n");
      out.write("      <div class=\"carousel-inner no-padding my-5\">\r\n");
      out.write("        <div class=\"carousel-item active\">\r\n");
      out.write("          <div class=\"col-xs-4 col-sm-4 col-md-4\">\r\n");
      out.write("            <img src=\"resources/images/Ingles.png\" class=\"card-img-top\" alt=\"Imagem do Card 1\">\r\n");
      out.write("            <h5 class=\"card-title\">Ingles | Individual</h5>\r\n");
      out.write("            <p class=\"card-text\">5x de R$50,00</p>\r\n");
      out.write("            </a>\r\n");
      out.write("            <p>Duas aulas de 60 minutos por semana</p>\r\n");
      out.write("\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("          <div class=\"col-xs-4 col-sm-4 col-md-4\">\r\n");
      out.write("            <img src=\"resources/images/Ingles.png\" class=\"card-img-top\" alt=\"Imagem do Card 1\">\r\n");
      out.write("            <h5 class=\"card-title\">Ingles | Grupo</h5>\r\n");
      out.write("            <p class=\"card-text\">5x de R$50,00</p>\r\n");
      out.write("            </a>\r\n");
      out.write("            <p>Duas aulas de 60 minutos por semana</p>\r\n");
      out.write("\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"col-xs-4 col-sm-4 col-md-4\">\r\n");
      out.write("            <img src=\"resources/images/Ingles.png\" class=\"card-img-top\" alt=\"Imagem do Card 1\">\r\n");
      out.write("            <h5 class=\"card-title\">Ingles | Intensivo</h5>\r\n");
      out.write("            <p class=\"card-text\">5x de R$70,00</p>\r\n");
      out.write("            </a>\r\n");
      out.write("            <p>Quatro aulas de 60 minutos por semana</p>\r\n");
      out.write("\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"carousel-item\">\r\n");
      out.write("          <div class=\"col-xs-4 col-sm-4 col-md-4\">\r\n");
      out.write("            <img src=\"resources/images/Espanhol.png\" class=\"card-img-top\" alt=\"Imagem do Card 1\">\r\n");
      out.write("            <h5 class=\"card-title\">Espanhol | Individual </h5>\r\n");
      out.write("            <p class=\"card-text\">5x de R$50,00</p>\r\n");
      out.write("            </a>\r\n");
      out.write("            <p>Duas aulas de 60 minutos por semana</p>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"col-xs-4 col-sm-4 col-md-4\">\r\n");
      out.write("            <img src=\"resources/images/Espanhol.png\" class=\"card-img-top\" alt=\"Imagem do Card 1\">\r\n");
      out.write("            <h5 class=\"card-title\">Espanhol | Grupo</h5>\r\n");
      out.write("            <p class=\"card-text\">5x de R$50,00</p>\r\n");
      out.write("            </a>\r\n");
      out.write("            <p>Duas aulas de 60 minutos por semana</p>\r\n");
      out.write("\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"col-xs-4 col-sm-4 col-md-4\">\r\n");
      out.write("\r\n");
      out.write("            <img src=\"resources/images/Espanhol.png\" class=\"card-img-top\" alt=\"Imagem do Card 1\">\r\n");
      out.write("            <h5 class=\"card-title\">Espanhol | Intensivo</h5>\r\n");
      out.write("            <p class=\"card-text\">5x de R$70,00</p>\r\n");
      out.write("            </a>\r\n");
      out.write("            <p>Quatro aulas de 60 minutos por semana</p>\r\n");
      out.write("\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <!-- Left and right controls -->\r\n");
      out.write("      <a class=\"carousel-control-prev\" href=\"#demo\" data-slide=\"prev\">\r\n");
      out.write("        <span class=\"carousel-control-prev-icon sp\"></span>\r\n");
      out.write("      </a>\r\n");
      out.write("      <a class=\"carousel-control-next\" href=\"#demo\" data-slide=\"next\">\r\n");
      out.write("        <span class=\"carousel-control-next-icon sp\"></span>\r\n");
      out.write("      </a>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("    <h1>Depoimentos</h1>\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("      <div class=\"col-md-4 col-sm-6 col-xs-12\">\r\n");
      out.write("        <div class=\"card-box\">\r\n");
      out.write("          <div class=\"card-title\">\r\n");
      out.write("            <h2>Julia Andrade, 12 anos:\r\n");
      out.write("            </h2>\r\n");
      out.write("            <p>A professora Helena e incrivel! <br>\r\n");
      out.write("              Com as aulas online dela consegui melhorar minhas notas na escola, ela tem muita paciencia! </p>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"col-md-4 col-sm-6 col-xs-12\">\r\n");
      out.write("        <div class=\"card-box\">\r\n");
      out.write("          <div class=\"card-title\">\r\n");
      out.write("            <h2>Junior Ferreira, 45 anos:</h2>\r\n");
      out.write("            <p>\r\n");
      out.write("              Tive um grande avanco em meu ingles! <br> A Helena seguiu um plano de aulas personalizado focando\r\n");
      out.write("              em gramatica. Dentro de 5 meses consegui uma oportunidade de emprego que pedia ingles.\r\n");
      out.write("              A Helena e uma grande profissional que tem muito conhecimento e experiencia. </p>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"col-md-4 col-sm-6 col-xs-12\">\r\n");
      out.write("        <div class=\"card-box\">\r\n");
      out.write("          <div class=\"card-title\">\r\n");
      out.write("            <h2>Maria Souza, 33 anos:</h2>\r\n");
      out.write("            <p>\r\n");
      out.write("              Meu sonho sempre foi ir para Disney! <br>Mas eu nao sabia nada de ingles, entao, comecei as aulas com a\r\n");
      out.write("              Helena, que criou um plano personalizado focando no ingles para o dia a dia.\r\n");
      out.write("              Depois de alguns meses de aula realizei o meu sonho de viajar para a Disney e consegui me comunicar com\r\n");
      out.write("              todos!</p>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("  <footer class=\"footer\" style=\"background-color: #8CB3FD;\">\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <div class=\"row align-items-center\">\r\n");
      out.write("        <div class=\"col-md-3\">\r\n");
      out.write("          <img src=\"resources/images/Logo.png\" alt=\"Logo\" style=\"height: 150px;\">\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-md-6 text-center\">\r\n");
      out.write("          <p class=\"mb-0\">Baixe nosso aplicativo</p>\r\n");
      out.write("          <a href=\"#\"><i class=\"fab fa-android fa-2x\"></i></a>\r\n");
      out.write("          <a href=\"#\"><i class=\"fab fa-apple fa-2x\"></i></a>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"col-md-3 text-right\">\r\n");
      out.write("          <a href=\"#\"><i class=\"fab fa-facebook fa-2x\"></i></a>\r\n");
      out.write("          <a href=\"#\"><i class=\"fab fa-twitter fa-2x\"></i></a>\r\n");
      out.write("          <a href=\"#\"><i class=\"fab fa-whatsapp fa-2x\"></i></a>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <hr>\r\n");
      out.write("      <div class=\"row\">\r\n");
      out.write("        <div class=\"col-md-12 text-center\">\r\n");
      out.write("          <p>&copy; 2023 Todos os direitos reservados.</p>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </footer>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <!-- Scripts do Bootstrap -->\r\n");
      out.write("  <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"></script>\r\n");
      out.write("  <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js\"\r\n");
      out.write("    integrity=\"sha384-wiJyZO0jX6hh60ggnIh0YzZU6QIXx4jI0gblZWfD0yE6fr5XhLgB1CxojrbjzlzF\"\r\n");
      out.write("    crossorigin=\"anonymous\"></script>\r\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_spring_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f0 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fnobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    boolean _jspx_th_spring_005furl_005f0_reused = false;
    try {
      _jspx_th_spring_005furl_005f0.setPageContext(_jspx_page_context);
      _jspx_th_spring_005furl_005f0.setParent(null);
      // /WEB-INF/jsp/home.jsp(8,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_spring_005furl_005f0.setValue("resources/css/all.min.css");
      // /WEB-INF/jsp/home.jsp(8,0) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_spring_005furl_005f0.setVar("allminCSS");
      int[] _jspx_push_body_count_spring_005furl_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_spring_005furl_005f0 = _jspx_th_spring_005furl_005f0.doStartTag();
        if (_jspx_th_spring_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_005furl_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_005furl_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_005furl_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_spring_005furl_005f0);
      _jspx_th_spring_005furl_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_spring_005furl_005f0, _jsp_getInstanceManager(), _jspx_th_spring_005furl_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005furl_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f1 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fnobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    boolean _jspx_th_spring_005furl_005f1_reused = false;
    try {
      _jspx_th_spring_005furl_005f1.setPageContext(_jspx_page_context);
      _jspx_th_spring_005furl_005f1.setParent(null);
      // /WEB-INF/jsp/home.jsp(9,0) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_spring_005furl_005f1.setValue("resources/index.css");
      // /WEB-INF/jsp/home.jsp(9,0) name = var type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_spring_005furl_005f1.setVar("indexCSS");
      int[] _jspx_push_body_count_spring_005furl_005f1 = new int[] { 0 };
      try {
        int _jspx_eval_spring_005furl_005f1 = _jspx_th_spring_005furl_005f1.doStartTag();
        if (_jspx_th_spring_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_005furl_005f1[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_005furl_005f1.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_005furl_005f1.doFinally();
      }
      _005fjspx_005ftagPool_005fspring_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_spring_005furl_005f1);
      _jspx_th_spring_005furl_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_spring_005furl_005f1, _jsp_getInstanceManager(), _jspx_th_spring_005furl_005f1_reused);
    }
    return false;
  }
}
