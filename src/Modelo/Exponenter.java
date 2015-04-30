package Modelo;

import java.awt.Color;
import java.util.*;
import javax.swing.ImageIcon;

/**
 * 
 */
public class Exponenter extends Calculator {

    double partialResult;
    /**
     * 
     */
    public Exponenter() {
        this.myColor = Color.GREEN;
        this.image = new ImageIcon("img4.jpg");
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
    
    @Override
    public Color getBackgroundColor() {
        return this.myColor;
    }
    
    @Override
    public ImageIcon getImage() {
        return this.image;
    }

}