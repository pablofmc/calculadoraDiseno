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
       this.listNumbers = (ArrayList<String>)myDTO.getListNumbers().clone();
       myDTO.getListNumbers().clear();
       for (int i = 0; i < this.listNumbers.size(); i++){
           myDTO.addNumber(Double.toString(Math.sqrt(Integer.parseInt(listNumbers.get(i)))));
       }
       return myDTO;
   }

}