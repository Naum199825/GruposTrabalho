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
    
    @Inject
    private GrupoServiceLocal gS;
            
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
            
            //<editor-fold defaultstate="collapsed" desc="Q1">
//            out.println("<h2> Q1: Dados das Pessoas por Query </h2>");
//            out.println("<pre class=\"high\">" + Util.toJson(pS.dadosPessoas()) +"</pre>");
//            out.println("<h2> Q1: Dados das Pessoas por TypedQuery </h2>");
//            out.println("<pre class=\"high\">" + Util.toJson(pS.dadosPessoaTyped()) +"</pre>");
//            out.println("<h2> Q1: Dados das Pessoas por NamedQuery </h2>");
//            out.println("<pre class=\"high\">>" + Util.toJson(pS.dadosPessoaNamedQuery())+"</pre>");
//</editor-fold>

            //<editor-fold defaultstate="collapsed" desc="Q2">
//            out.println("<h2> Q2: Nome das Pessoas por Query </h2>");
//            out.println("<pre class=\"high\">" + Util.toJson(pS.nomePessoas()) +"</pre>");
//            out.println("<h2> Q2: Nome das Pessoas por TypedQuery </h2>");
//            out.println("<pre class=\"high\">" + Util.toJson(pS.nomePessoasTyped()) +"</pre>");
//            out.println("<h2> Q2: Nome das Pessoas por NamedQuery </h2>");
//            out.println("<pre class=\"high\">" + Util.toJson(pS.nomePessoaNamedQuery())+"</pre>");
//</editor-fold>

            //<editor-fold defaultstate="collapsed" desc="Q3">
//            out.println("<h2> Q3: Nome das Pessoas e seus Enderecos por Query </h2>");
//            out.println("<pre class=\"high\">" + Util.toJson(pS.nomePessoasEnderecos())+"</pre>");
//            out.println("<h2> Q3: Nome das Pessoas e seus Enderecos por TypedQuery </h2>");
//            out.println("<pre class=\"high\">" + Util.toJson(pS.nomePessoasEnderecosTypedQuery())+"</pre>");
//            out.println("<h2> Q3: Nome das Pessoas e seus Enderecos por NamedQuery </h2>");
//            out.println("<pre class=\"high\">" + Util.toJson(pS.nomePessoaEnderecosNamedQuery())+"</pre>");
//</editor-fold>

            //<editor-fold defaultstate="collapsed" desc="Q4">
//                 out.println("<h2> Q4: Pessoas que moram em Avenida por Query </h2>");
//              out.println("<pre class=\"high\">" + Util.toJson(pS.pessoasMAvenidas())+"</pre>");
//
//               out.println("<h2> Q4: Pessoas que moram em Avenida por TypedQuery</h2>");
//              out.println("<pre class=\"high\">" + Util.toJson(pS.pessoasMAvenidaTypedQuery())+"</pre>");
//              
//               out.println("<h2> Q4: Pessoas que moram em Avenida Por NamedQuery </h2>");
//              out.println("<pre class=\"high\">" + Util.toJson(pS.pessoaMAvenidaNamedQuery())+"</pre>");
//</editor-fold>

            //<editor-fold defaultstate="collapsed" desc="Q5">
//                out.println("<h2> Q5: Nome das Pessoas que  não moram em Praca </h2>");
//              out.println("<pre class=\"high\">" + Util.toJson(pS.pessoasNMPraca())+"</pre>");
//
//               out.println("<h2> Q5: Nome das Pessoas que  não moram em Praca por TypedQuery</h2>");
//              out.println("<pre class=\"high\">" + Util.toJson(pS.pessoasNMPracaTypedQuery())+"</pre>");
//              
//               out.println("<h2> Q5: Nome das Pessoas que  não moram em Praca Por NamedQuery </h2>");
//              out.println("<pre class=\"high\">" + Util.toJson(pS.pessoasNMPracaNamedQuery())+"</pre>");
//</editor-fold>

            //<editor-fold defaultstate="collapsed" desc="Q6">
//            out.println("<h2> Q6: Nome das Pessoas e seus Telefones por Query </h2>");
//              out.println("<pre class=\"high\">" + Util.toJson(pS.nomePessoasTelefones())+"</pre>");

//            out.println("<h2> Q6: Nome das Pessoas e seus Telefones por TypedQuery </h2>");
//            out.println("<pre class=\"high\">" + Util.toJson(pS.nomePessoastelefonesTypedQuery())+"</pre>");

//            out.println("<h2> Q6: Nome das Pessoas e seus Telefoness por NamedQuery </h2>");
//            out.println("<pre class=\"high\">" + Util.toJson(pS.nomePessoaTelefonesNamedQuery())+"</pre>");
//</editor-fold>
 
            //<editor-fold defaultstate="collapsed" desc="Q7">
//              out.println("<h2> Q7: Pessoas que nascem entre duas datas por Query </h2>");
//              out.println("<pre class=\"high\">" + Util.toJson(pS.PessoasDataNasc())+"</pre>");
//</editor-fold>

            //<editor-fold defaultstate="collapsed" desc="Q8">
//               out.println("<h2> Q8A: Pessoas com DDD do Parana </h2>");
//               out.println("<pre class=\"high\">" + Util.toJson(pS.PessoasDDDQuery())+"</pre>");

//               out.println("<h2> Q8B: Pessoas com DDD </h2>");
//               out.println("<pre class=\"high\">" + Util.toJson(pS.PessoasDDD2Query())+"</pre>");
//</editor-fold>
              
            //<editor-fold defaultstate="collapsed" desc="Q9">
//               out.println("<h2> Q9: Pessoas que não tem Telefone </h2>");
//                out.println("<pre class=\"high\">" + Util.toJson(pS.PessoasSemTelefoneQuery())+"</pre>");
//</editor-fold>      

            //<editor-fold defaultstate="collapsed" desc="Q10">
//                out.println("<h2> Q10: Pessoas e qtd de Telefones </h2>");
//                out.println("<pre class=\"high\">" + Util.toJson(pS.PessoasQTDTelefonesQuery())+"</pre>");
//</editor-fold>
           
            //<editor-fold defaultstate="collapsed" desc="Q11">
//                out.println("<h2> Q11: Grupos não Ativos </h2>");
//                out.println("<pre class=\"high\">" + Util.toJson(gS.GruposNAtivos())+"</pre>");
//</editor-fold>
            
            //<editor-fold defaultstate="collapsed" desc="Q12">
//                out.println("<h2> Q12: Grupos e Lideres </h2>");
//                out.println("<pre class=\"high\">" + Util.toJson(gS.GruposLideres())+"</pre>");
//</editor-fold>
                
        
//                

                
                out.println("<h2> Q13: Memebros e Grupos Especifico 'Estudo IV' por Ordem Descrescente </h2>");
                out.println("<pre class=\"high\">" + Util.toJson(pS.membrosDescQuery("Estudo IV"))+"</pre>");
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
