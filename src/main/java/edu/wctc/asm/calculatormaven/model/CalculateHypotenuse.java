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
public class CalculateHypotenuse {
    
    public String calculateHypotenuse(String leg1, String leg2){
        DecimalFormat df = new DecimalFormat("###.##");
        double legOne = Double.parseDouble(leg1);
        double legTwo = Double.parseDouble(leg2);
        double hypotenuse = Math.sqrt((Math.pow(legOne, 2) + (Math.pow(legTwo, 2))));
        String newHypotenuse = df.format(hypotenuse);
        return newHypotenuse;
    }
}
