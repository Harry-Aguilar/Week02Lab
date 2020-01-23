/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import jdk.nashorn.internal.ir.RuntimeNode;

/**
 *
 * @author 799229
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

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
        
        int first = 0;
        int second = 0;
        int result;
        
        try {
            first = Integer.parseInt(request.getParameter("first"));
            second = Integer.parseInt(request.getParameter("second"));
        } catch (NumberFormatException e) {
            request.setAttribute("result", "---");
        }
        String operator = request.getParameter("operator");
        
        if (operator != null) {
            switch(operator) {
                case "+":
                    result = first + second;
                    request.setAttribute("result", result);
                    break;
                case "-":
                    result = first - second;
                    request.setAttribute("result", result);
                    break;
                case "*":
                    result = first * second;
                    request.setAttribute("result", result);
                    break;
                case "/":
                    result = first / second;
                    request.setAttribute("result", result);
                    break;
                default:
                    request.setAttribute("result", "---");
            }
        }
        
//        if (operator.equals("+")) {
//            
//        } else if (operator.equals("-")) {
//            
//        } else if (operator.equals("*")) {
//            
//        } else if (operator.equals("/")) {
//            
//        }
              
        getServletContext().getRequestDispatcher("/arithmeticcalculator.jsp").forward(request, response);
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
