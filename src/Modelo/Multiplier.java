package Modelo;

import java.util.*;

/**
 * 
 */
public class Multiplier extends Calculator {

    int partialResult;
    /**
     * 
     */
    public Multiplier() {
        this.partialResult = 0;
    }
    
    public String calculate() {
        for(int i = 0;i <= listNumbers.size();i++) {
            partialResult *= listNumbers.indexOf(i);
        }
        result = Integer.toString(partialResult);
        return result;
    }
    
    public void getList(ArrayList<Integer> listNumbers) {
        this.listNumbers = listNumbers;
    }

}