package Modelo;

import java.awt.Color;
import java.util.*;
import javax.swing.ImageIcon;

/**
 * 
 */
public class Divider extends Calculator {

    int partialResult;
    /**
     * 
     */
    public Divider() {
        this.myColor = Color.DARK_GRAY;
        this.image = new ImageIcon("src/Modelo/Images/img4.jpg");
        this.partialResult = 0;
    }
    
    @Override
    public DTO calculate(DTO myDTO) {    
        this.listNumbers = (ArrayList<String>)myDTO.getListNumbers().clone();
        myDTO.getListNumbers().clear();
        partialResult = Integer.parseInt(listNumbers.get(0));
        for(int i = 1;i < listNumbers.size();i++) {
            partialResult = partialResult/Integer.parseInt(listNumbers.get(i));
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