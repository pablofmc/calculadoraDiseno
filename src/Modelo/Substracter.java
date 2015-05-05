package Modelo;

import java.awt.Color;
import java.util.*;
import javax.swing.ImageIcon;

/**
 * 
 */
public class Substracter extends Calculator {

    int partialResult;
    /**
     * 
     */
    public Substracter() {
        this.myColor = Color.LIGHT_GRAY;
        this.image = new ImageIcon("src/Modelo/Images/img2.jpg");
        partialResult = 0;
    }
    
    @Override
    public DTO calculate(DTO myDTO) {   
        this.listNumbers = (ArrayList<String>)myDTO.getListNumbers().clone();
        myDTO.getListNumbers().clear();
        partialResult = Integer.parseInt(this.listNumbers.get(0));
        for(int i = 1;i < listNumbers.size();i++) {
            partialResult -= Integer.parseInt(this.listNumbers.get(i));
        }
        myDTO.addNumber(Integer.toString(partialResult));
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