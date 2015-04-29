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
       this.listNumbers = (ArrayList<Integer>)myDTO.getListNumbers().clone();
       myDTO.getListNumbers().clear();
       System.out.println("PABLO  " + this.listNumbers.size() );
       for (int i = 0; i < this.listNumbers.size(); i++){
           System.out.println("siii");
           myDTO.addNumber(Double.toString(Math.sqrt(listNumbers.get(i))));
       }
       return myDTO;
   }

}