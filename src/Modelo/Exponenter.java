package Modelo;

import java.util.*;

/**
 * 
 */
public class Exponenter extends Calculator {

    double partialResult;
    /**
     * 
     */
    public Exponenter() {
        partialResult = 0;
    }
    
    public String calculate(DTO myDTO) {
        this.listNumbers = myDTO.getListNumbers();
        partialResult = Math.pow(listNumbers.indexOf(0), listNumbers.indexOf(1));
        result = Double.toString(partialResult);
        return result;
    }


}