package Modelo;

import java.util.ArrayList;

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
        this.listNumbers = (ArrayList<Integer>)myDTO.getListNumbers().clone();
        myDTO.getListNumbers().clear();
        for (Integer number : listNumbers) {
            partialResult += number;
        }
        
        myDTO.addNumber(Integer.toString(partialResult));
        return myDTO;
    }

}
