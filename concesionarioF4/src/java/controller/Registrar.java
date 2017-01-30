/*
 * To change this license header, choose License Headers in Project Properties.
 * Este es un controlador que va a registar los valores 
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Hector Erazo
 */
public class Registrar extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws javax.servlet.ServletException
     * @throws java.io.IOException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        String domicilio= request.getParameter("domicilio");
        String telefono= request.getParameter("telefono");
           
        modelo.Cliente cliente = new.modelo.Cliente();
             cliente.setIdCliente(0);
            cliente.setnombre();
            cliente.settelefono();
            cliente.setIdVehiculo(Integer.MIN_VALUE);
            
            EntityManager em;
            EntityManagerFactory emf;
            
            emf= Persistence.createEntityManagerFactory("concesionarioF4PU");
            em = emf.EntityManager();
            
            em.getTransaction().begin();
            em.persist(cliente).begin();
            em.flush();
            em.GetTransaction().commit();
            response.sendRedirect("correcto.jsp");                   
    }

    /**
     * Returns a short description of the servlet
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
