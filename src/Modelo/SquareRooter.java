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
    
   public String Calculate() {
       partialResult = Math.sqrt(listNumbers.indexOf(0));
       result = Double.toString(partialResult);
       return result;
   }
   
   public void getList(ArrayList<Integer> listNumbers) {
        this.listNumbers = listNumbers;
    }

}