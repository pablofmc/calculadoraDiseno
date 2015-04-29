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
    
    public DTO calculate(DTO myDTO) {
        this.listNumbers = (ArrayList<Integer>)myDTO.getListNumbers().clone();
        myDTO.getListNumbers().clear();
        partialResult = this.listNumbers.get(0);
        for(int i = 1;i < listNumbers.size();i++) {
            partialResult -= this.listNumbers.get(i);
        }
        myDTO.addNumber(Integer.toString(partialResult));
        return myDTO;
    }

}