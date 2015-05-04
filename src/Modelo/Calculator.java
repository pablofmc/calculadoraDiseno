package Modelo;

import java.awt.Color;
import java.net.URL;
import java.util.*;
import javax.swing.ImageIcon;

/**
 * 
 */
public abstract class Calculator implements ICalculate {
    ArrayList<String> listNumbers;
    DTO result;
    Color myColor;
    ImageIcon image;
    String path;
    URL url;
    /**
     * 
     */
    public Calculator() {
        
    }

    @Override
    public DTO calculate(DTO myDTO) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Color getBackgroundColor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ImageIcon getImage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }  
}
