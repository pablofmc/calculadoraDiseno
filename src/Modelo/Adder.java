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
        this.listNumbers = (ArrayList<String>)myDTO.getListNumbers().clone();
        myDTO.getListNumbers().clear();
        for (String number : listNumbers) {
            partialResult += Integer.parseInt(number);
        }
        
        myDTO.addNumber(Integer.toString(partialResult));
        return myDTO;
    }

}
