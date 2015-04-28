package Modelo;

import java.util.*;

/**
 * 
 */
public class Adder extends Calculator {

    int partialResult;

    public Adder() {
       this.partialResult = 0;
    }
    
    @Override
    public String calculate() {
        for(int i = 0;i <= listNumbers.size();i++) {
            partialResult += listNumbers.indexOf(i);
        }
        result = Integer.toString(partialResult);
        return result;
    }
    
    public void getList(ArrayList<Integer> listNumbers) {
        this.listNumbers = listNumbers;
    }

}
