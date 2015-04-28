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
    public String calculate(DTO myDTO) {
        this.listNumbers = myDTO.getListNumbers();
        for(int i = 0;i < listNumbers.size();i++) {
            partialResult += listNumbers.indexOf(i);
        }
        result = Integer.toString(partialResult);
        return result;
    }

}
