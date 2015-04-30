package Modelo;

import java.util.*;

/**
 * 
 */
public class Exponenter extends Calculator {

    double partialResult;
    /**
     * 
     */
    public Exponenter() {
        partialResult = 0;
    }
    
    @Override
    public DTO calculate(DTO myDTO) {
        this.listNumbers = (ArrayList<String>)myDTO.getListNumbers().clone();
        myDTO.getListNumbers().clear();
        int e;
        for (int i = 0; i < this.listNumbers.size()-1; i+=2){
            e = i+1;
            myDTO.addNumber(Double.toString(Math.pow(Integer.parseInt(listNumbers.get(i)), Integer.parseInt(listNumbers.get(e)))));
        }
        return myDTO;
    }


}