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
    
    public String calculate(DTO myDTO) {
        this.listNumbers = myDTO.getListNumbers();
        this.listNumbers = listNumbers;
        this.result = Integer.toBinaryString(this.listNumbers.get(0));
        return this.result;
    } 
}