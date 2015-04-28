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
        for(int i = 0;i <= listNumbers.size();i++) {
            partialResult /= listNumbers.indexOf(i);
        }
        result = Integer.toString(partialResult);
        return result;
    }
}