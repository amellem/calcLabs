/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wctc.asm.calculatormaven.model;

/**
 *
 * @author Aerius
 */
public class CalculateCircleArea {
    
    public String calculateArea(String radius){
        double area = Double.parseDouble(radius) * Math.PI;
        return Double.toString(area);
    }
}
