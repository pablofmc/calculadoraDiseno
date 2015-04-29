package Modelo;


import java.util.*;
    
/**
 * 
 */
public class DTO {
    private ArrayList<String> listNumbers;
    private int actualNumber;
    /**
     * 
     */  
    public DTO() {
        this.listNumbers = new ArrayList();
        actualNumber = 0;
    }
    
    public void addNumber(String num) {
        this.listNumbers.add(num);
    }
    
    public boolean isNull() {
        return listNumbers == null;
    }
    
    public ArrayList<String> getListNumbers() {
        return this.listNumbers;
    }
    
}