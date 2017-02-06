/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wctc.asm.calculatormaven.model;

import java.text.DecimalFormat;


/**
 *
 * @author Aerius
 */
public class CalculateRectangleArea{
    
    public String calculateArea(String length, String width){
        DecimalFormat df = new DecimalFormat("###.##");
        double area = (Double.parseDouble(length) * Double.parseDouble(width));
        String newArea = df.format(area);
        return newArea;
    }
}
