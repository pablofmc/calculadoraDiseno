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
        this.listNumbers = (ArrayList<Integer>)myDTO.getListNumbers().clone();
        myDTO.getListNumbers().clear();
        partialResult = listNumbers.get(0);
        for(int i = 1;i < listNumbers.size();i++) {
            partialResult = partialResult/listNumbers.get(i);
        }
        myDTO.addNumber(Integer.toString(partialResult));
        return myDTO;
    }
}