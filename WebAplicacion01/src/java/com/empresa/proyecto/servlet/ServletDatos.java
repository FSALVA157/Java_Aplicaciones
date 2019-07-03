package com.empresa.proyecto.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "ServletDatos", urlPatterns = {"/RecibirDatos"})
public class ServletDatos extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        request.setCharacterEncoding("UTF-8");
        
        String nombre = request.getParameter("nombre");
        String genero = request.getParameter("genero");
        String estudios = request.getParameter("estudios");
        String[] deportes = request.getParameterValues("deportes");
        String[] pasatiempos = request.getParameterValues("pasatiempos");
        
        
        HttpSession session = request.getSession();
        session.setAttribute("nombre", nombre);
        session.setAttribute("genero", genero);
        session.setAttribute("estudios", estudios);
        session.setAttribute("deportes", Arrays.toString(deportes));
        session.setAttribute("pasatiempos", Arrays.toString(pasatiempos));
        
        response.sendRedirect("salida.jsp");
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
