package Modelo;


import java.util.*;
    
/**
 * 
 */
public class DTO {
    private ArrayList<Integer> listNumbers;
    private int actualNumber;
    /**
     * 
     */  
    public DTO() {
        this.listNumbers = new ArrayList();
        actualNumber = 0;
    }
    
    public void addNumber(String num) {
        this.actualNumber = Integer.parseInt(num);
        this.listNumbers.add(this.actualNumber);
    }
    
    public boolean isNull() {
        if (listNumbers == null){
            return true;
        } else {
            return false;
        }
    }
    
    public ArrayList<Integer> getListNumbers() {
        return this.listNumbers;
    }
    
}