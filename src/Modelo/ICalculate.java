package Modelo;

import java.awt.Color;
import java.util.*;
import javax.swing.ImageIcon;

/**
 * 
 */
public interface ICalculate {

    DTO calculate(DTO myDTO);
    Color getBackgroundColor();
    ImageIcon getImage();
}