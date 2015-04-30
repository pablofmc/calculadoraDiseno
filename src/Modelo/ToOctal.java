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
    
    @Override
    public DTO calculate(DTO myDTO) {
        this.listNumbers = (ArrayList<String>)myDTO.getListNumbers().clone();
        myDTO.getListNumbers().clear();
        for (String number : this.listNumbers) {
            myDTO.addNumber(Integer.toOctalString(Integer.parseInt(number)));
        }
        return myDTO;
    } 
}
