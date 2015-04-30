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
    
    @Override
    public DTO calculate(DTO myDTO) {    
        this.listNumbers = (ArrayList<String>)myDTO.getListNumbers().clone();
        myDTO.getListNumbers().clear();
        partialResult = Integer.parseInt(listNumbers.get(0));
        for(int i = 1;i < listNumbers.size();i++) {
            partialResult = partialResult/Integer.parseInt(listNumbers.get(i));
        }
        myDTO.addNumber(Integer.toString(partialResult));
        return myDTO;
    }
}