/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package io.github.naum.grupostrabalho;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;

/**
 *
 * @author IFNMG
 */
@Transactional
@WebServlet(name = "Relatorios", urlPatterns = {"/Relatorios"})
public class Relatorios extends HttpServlet {
    
    @Inject
    private PessoaServiceLocal pS;
            
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Relatorios</title>");            
            out.println("</head>");
            out.println("<body>");
//            out.println("<h2> Q1: Dados das Pessoas por Query </h2>");
//            out.println("<h2>" + Util.toJson(pS.dadosPessoas()) +"</h2>");
//            out.println("<h2> Q1: Dados das Pessoas por TypedQuery </h2>");
//            out.println("<h2>" + Util.toJson(pS.dadosPessoaTyped()) +"</h2>");
//            out.println("<h2> Q1: Dados das Pessoas por NamedQuery </h2>");
//            out.println("<h2>" + Util.toJson(pS.dadosPessoaNamedQuery())+"</h2>");
//            out.println("<h2> Q2: Nome das Pessoas por Query </h2>");
//            out.println("<h2>" + Util.toJson(pS.nomePessoas()) +"</h2>");
//            out.println("<h2> Q2: Nome das Pessoas por TypedQuery </h2>");
//            out.println("<h2>" + Util.toJson(pS.nomePessoasTyped()) +"</h2>");
//            out.println("<h2> Q2: Nome das Pessoas por NamedQuery </h2>");
//            out.println("<h2>" + Util.toJson(pS.nomePessoaNamedQuery())+"</h2>");
//            out.println("<h2> Q3: Nome das Pessoas e seus Enderecos por Query </h2>");
//            out.println("<h2>" + Util.toJson(pS.nomePessoasEnderecos())+"</h2>");
//            out.println("<h2> Q3: Nome das Pessoas e seus Enderecos por TypedQuery </h2>");
//            out.println("<h2>" + Util.toJson(pS.nomePessoasEnderecosTypedQuery())+"</h2>");
//            out.println("<h2> Q3: Nome das Pessoas e seus Enderecos por NamedQuery </h2>");
//            out.println("<h2>" + Util.toJson(pS.nomePessoaEnderecosNamedQuery())+"</h2>");
              out.println("<h2> Q3: Nome das Pessoas e seus Enderecos por Query </h2>");
              out.println("<h2>" + Util.toJson(pS.pessoasNMPraca())+"</h2>");
//            out.println("<h2> Q3: Nome das Pessoas e seus Enderecos por TypedQuery </h2>");
//            out.println("<h2>" + Util.toJson(pS.nomePessoasEnderecosTypedQuery())+"</h2>");
//            out.println("<h2> Q3: Nome das Pessoas e seus Enderecos por NamedQuery </h2>");
//            out.println("<h2>" + Util.toJson(pS.nomePessoaEnderecosNamedQuery())+"</h2>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
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
     * Handles the HTTP <code>POST</code> method.
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
