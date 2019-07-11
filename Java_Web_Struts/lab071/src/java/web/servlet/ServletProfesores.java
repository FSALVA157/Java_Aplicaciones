package web.servlet;

import dto.Profesores;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dao.DaoProfesores;
import model.dao.impl.DaoProfesoresImpl;

@WebServlet(name = "ServletProfesores", urlPatterns = {"/Profesores"})
public class ServletProfesores extends HttpServlet {

    protected void processRequest(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        // ---
        String accion = request.getParameter("accion");
        String result = null;
        String target = null;
        // ---
        DaoProfesores daoProfesores = new DaoProfesoresImpl();

        if (accion == null) {
            result = "Solicitud no recibida";

        } else if (accion.equals("QRY")) {
            List<Profesores> list = daoProfesores.profesoresQry();

            if (list != null) {
                request.getSession().setAttribute("list", list);
                target = "view/profesores/";

            } else {
                result = "Problemas en Consulta";
            }

        } else if (accion.equals("INS")) {
        } else if (accion.equals("DEL")) {
        } else if (accion.equals("GET")) {
        } else if (accion.equals("UPD")) {
        } else {
            result = "Solicitud no reconocida";
        }

        if (result != null) {
            request.getSession().setAttribute("msg", result);
            target = "view/mensaje.jsp";
        }

        if (target != null) {
            response.sendRedirect(target);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}

