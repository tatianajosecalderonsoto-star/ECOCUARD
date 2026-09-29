package com.mycompany.ecoguard;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "MedicionServlet", urlPatterns = {"/MedicionServlet"})
public class MedicionServlet extends HttpServlet {

    // Método GET
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html lang='es'>");
        out.println("<head>");
        out.println("<meta charset='UTF-8'>");
        out.println("<title>ECOGUARD</title>");
        out.println("</head>");
        out.println("<body>");

        out.println("<h1>ECOGUARD</h1>");
        out.println("<h2>Módulo de mediciones ambientales</h2>");

        out.println("<p>El servlet está funcionando correctamente mediante GET.</p>");

        out.println("<a href='index_1.html'>Volver al formulario</a>");

        out.println("</body>");
        out.println("</html>");
    }

    // Método POST
     // Método POST
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        String temperatura = request.getParameter("temperatura");
        String humedadAire = request.getParameter("humedadAire");
        String humedadSuelo = request.getParameter("humedadSuelo");
        String nivelLuz = request.getParameter("nivelLuz");

        request.setAttribute("temperatura", temperatura);
        request.setAttribute("humedadAire", humedadAire);
        request.setAttribute("humedadSuelo", humedadSuelo);
        request.setAttribute("nivelLuz", nivelLuz);

        request.getRequestDispatcher("resultado.jsp").forward(request, response);
    }

}