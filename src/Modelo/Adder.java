package Modelo;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 * 
 */
public class Adder extends Calculator {

    int partialResult;

    public Adder() {
        this.myColor = Color.BLUE;
        this.image = new ImageIcon("src/Modelo/Images/img1.jpg");
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
    
    @Override
    public Color getBackgroundColor() {
        return this.myColor;
    }
    
    @Override
    public ImageIcon getImage() {
        return this.image;
    }

}
