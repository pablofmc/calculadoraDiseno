/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class ToOctal extends Calculator{
    
    /**
     * 
     */
    public ToOctal() {
    }
    
    public String calculate(ArrayList listNumbers) {
        this.listNumbers = listNumbers;
        this.result = Integer.toBinaryString(this.listNumbers.get(0));
        return this.result;
    } 
}
