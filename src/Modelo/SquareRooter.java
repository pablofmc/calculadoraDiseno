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
    
    @Override
   public DTO calculate(DTO myDTO) {
       this.listNumbers = myDTO.getListNumbers();
       myDTO.getListNumbers().clear();
       System.out.println("siii");
       for (int i = 0; i < this.listNumbers.size(); i++){
           System.out.println("siii");
           myDTO.addNumber(Double.toString(Math.sqrt(listNumbers.get(0))));
       }
       return myDTO;
   }

}