package Modelo;

import java.util.*;

/**
 * 
 */
public class SquareRooter extends Calculator {
    
    double partialResult;
    /**
     * 
     */
    public SquareRooter() {
        partialResult = 0;
    }
    
   public String calculate(DTO myDTO) {
       this.listNumbers = myDTO.getListNumbers();
       partialResult = Math.sqrt(listNumbers.get(0));
       result = Double.toString(partialResult);
       return result;
   }

}