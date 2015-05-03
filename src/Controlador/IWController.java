/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.DTO;
import Modelo.MathematicsFactory;
import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author diego
 */
public interface IWController {
    void setFactory(MathematicsFactory myFactory);
    MathematicsFactory getFactory();
    void addOperatorType(String operatorType);
    void addNumber( String numberOne, String numberTwo);
    String calculateResult();
    String asString(DTO myDTO);
    Color getBackgroundColor();
    ImageIcon getImage();
    void changeOperation();
    boolean isOperationNull();
}
