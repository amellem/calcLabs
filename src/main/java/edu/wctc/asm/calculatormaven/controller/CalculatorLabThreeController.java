/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wctc.asm.calculatormaven.controller;

import edu.wctc.asm.calculatormaven.model.CalculateCircleArea;
import edu.wctc.asm.calculatormaven.model.CalculateHypotenuse;
import edu.wctc.asm.calculatormaven.model.CalculateRectangleArea;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Aerius
 */
@WebServlet(name = "CalculatorLabThreeController", urlPatterns = {"/CalculatorLabThreeController"})
public class CalculatorLabThreeController extends HttpServlet {
    private static final String RESULT_PAGE = "lab3.jsp";
    private static final String ERROR_PAGE = "errorPage.jsp";
    
    
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
        
        String destination = RESULT_PAGE;
        
        try{
            String calcType = request.getParameter("calcType");
            if(calcType.equals("rectangle")){
                String length = request.getParameter("length");
                String width = request.getParameter("width");

                CalculateRectangleArea rectangle = new CalculateRectangleArea();

                request.setAttribute("rectangleAreaThree", rectangle.calculateArea(length, width));
            } else if (calcType.equals("circle")){
                String radius = request.getParameter("radius");
                
                CalculateCircleArea circle = new CalculateCircleArea();
                request.setAttribute("circleArea", circle.calculateArea(radius));
            } else if (calcType.equals("hypotenuse")){
                String legOne = request.getParameter("leg1");
                String legTwo = request.getParameter("leg2");
                
                CalculateHypotenuse hypotenuse = new CalculateHypotenuse();
                request.setAttribute("hypotenuse", hypotenuse.calculateHypotenuse(legOne, legTwo));
            }
        }catch(Exception e){
         destination = ERROR_PAGE;
            request.setAttribute("errorMsg", e.getMessage());
        }
        RequestDispatcher view =
                request.getRequestDispatcher(destination);
        view.forward(request, response);
        
        destination = RESULT_PAGE;
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
