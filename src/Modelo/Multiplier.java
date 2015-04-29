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
    
    @Override
    public DTO calculate(DTO myDTO) {
        this.listNumbers = myDTO.getListNumbers();
        myDTO.getListNumbers().clear();
        partialResult = listNumbers.get(0);
        for(int i = 1;i < listNumbers.size();i++) {
            partialResult = partialResult*listNumbers.get(i);
        }
        myDTO.addNumber(Integer.toString(partialResult));
        return myDTO;
    }

}