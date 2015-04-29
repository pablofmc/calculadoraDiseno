package Modelo;

import java.util.*;

/**
 * 
 */
public class ToBinary extends Calculator {
  
    /**
     * 
     */
    public ToBinary() {
        
    }
    
    @Override
    public DTO calculate(DTO myDTO) {    
        this.listNumbers = (ArrayList<String>)myDTO.getListNumbers().clone();
        myDTO.getListNumbers().clear();
        for (String number : this.listNumbers) {
            myDTO.addNumber(Integer.toBinaryString(Integer.parseInt(number)));
        }
        return myDTO;
    } 
}