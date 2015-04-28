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
public class ToHexadecimal extends Calculator{
    /**
     * 
     */
    public ToHexadecimal() {
    }
    
    public String calculate(ArrayList listNumbers) {
        this.listNumbers = listNumbers;
        this.result = Integer.toHexString(this.listNumbers.get(0));
        return this.result;
    } 
}
