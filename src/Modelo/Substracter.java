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
        this.listNumbers = (ArrayList<String>)myDTO.getListNumbers().clone();
        myDTO.getListNumbers().clear();
        partialResult = Integer.parseInt(this.listNumbers.get(0));
        for(int i = 1;i < listNumbers.size();i++) {
            partialResult -= Integer.parseInt(this.listNumbers.get(i));
        }
        myDTO.addNumber(Integer.toString(partialResult));
        return myDTO;
    }

}