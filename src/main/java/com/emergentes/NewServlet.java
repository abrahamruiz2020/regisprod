
package com.emergentes;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "NewServlet", urlPatterns = {"/NewServlet"})
public class NewServlet extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String producto = request.getParameter("producto");
        
        String categoria = request.getParameter("categoria"); 
        String existencia = request.getParameter("existencia");
        String precio = request.getParameter("precio");
        //paso 2
       prod per = new prod();
        //paso 3
        per.setProducto(producto);
        per.setCategoria(categoria);
        per.setExistencia(existencia);
        per.setPrecio(precio);
        //paso 4
        request.setAttribute("pro", per);
        //pasdo 5
        request.getRequestDispatcher("salida.jsp").forward(request, response);
    }

   
   
}
