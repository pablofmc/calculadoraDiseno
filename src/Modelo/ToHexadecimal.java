/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author diego
 */
public class ToHexadecimal extends Calculator{
    /**
     * 
     */
    public ToHexadecimal() {
        this.myColor = Color.RED;
        this.image = new ImageIcon("img9.jpg");
    }
    
    @Override
    public DTO calculate(DTO myDTO) {   
        this.listNumbers = (ArrayList<String>)myDTO.getListNumbers().clone();
        myDTO.getListNumbers().clear();
        for (String number : this.listNumbers) {
            myDTO.addNumber(Integer.toHexString(Integer.parseInt(number)));
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
