package Modelo;

import java.util.*;

/**
 * 
 */
public class Substracter extends Calculator {

    int partialResult;
    /**
     * 
     */
    public Substracter() {
        partialResult = 0;
    }
    
    public String calculate(DTO myDTO) {
        this.listNumbers = myDTO.getListNumbers();
        partialResult = this.listNumbers.get(0);
        for(int i = 1;i < listNumbers.size();i++) {
            partialResult -= this.listNumbers.get(i);
        }
        result = Integer.toString(partialResult);
        return result;
    }

}