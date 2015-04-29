package Modelo;

import java.util.*;

/**
 * 
 */
public abstract class Calculator implements ICalculate {
    ArrayList<String> listNumbers;
    DTO result;
    /**
     * 
     */
    public Calculator() {
        
    }

    @Override
    public DTO calculate(DTO myDTO) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
