package Modelo;

import java.util.*;

/**
 * 
 */
public class Divider extends Calculator {

    int partialResult;
    /**
     * 
     */
    public Divider() {
        this.partialResult = 0;
    }
    
    public String calculate(DTO myDTO) {
        this.listNumbers = myDTO.getListNumbers();
        partialResult = listNumbers.get(0);
        for(int i = 1;i < listNumbers.size();i++) {
            partialResult = partialResult/listNumbers.get(i);
        }
        result = Integer.toString(partialResult);
        return result;
    }
}