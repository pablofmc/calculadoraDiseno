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
        this.listNumbers = (ArrayList<Integer>)myDTO.getListNumbers().clone();
        myDTO.getListNumbers().clear();
        for (Integer number : this.listNumbers) {
            myDTO.addNumber(Integer.toBinaryString(number));
        }
        return myDTO;
    } 
}