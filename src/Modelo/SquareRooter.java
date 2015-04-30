package Modelo;

import java.awt.Color;
import java.util.*;
import javax.swing.ImageIcon;

/**
 * 
 */
public class SquareRooter extends Calculator {
    
    double partialResult;
    /**
     * 
     */
    public SquareRooter() {
        this.myColor = Color.ORANGE;
        this.image = new ImageIcon("img6.jpg");
        partialResult = 0;
    }
    
    @Override
   public DTO calculate(DTO myDTO) {
       this.listNumbers = (ArrayList<String>)myDTO.getListNumbers().clone();
       myDTO.getListNumbers().clear();
       for (int i = 0; i < this.listNumbers.size(); i++){
           myDTO.addNumber(Double.toString(Math.sqrt(Integer.parseInt(listNumbers.get(i)))));
       }
       return myDTO;
   }
   
   @Override
    public java.awt.Color getBackgroundColor() {
        return this.myColor;
    }
    
    @Override
    public ImageIcon getImage() {
        return this.image;
    }

}