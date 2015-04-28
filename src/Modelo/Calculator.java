package Modelo;

import java.util.*;

/**
 * 
 */
public abstract class Calculator implements ICalculate {
    ArrayList<Integer> listNumbers;
    String result;
    /**
     * 
     */
    public Calculator() {
        
    }

    @Override
    public String calculate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
