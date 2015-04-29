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
    public DTO calculate(DTO myDTO) {
        this.listNumbers = myDTO.getListNumbers();
        myDTO.getListNumbers().clear();
        for (Integer number : listNumbers) {
            partialResult += number;
        }
        
        myDTO.addNumber(Integer.toString(partialResult));
        return myDTO;
    }

}
