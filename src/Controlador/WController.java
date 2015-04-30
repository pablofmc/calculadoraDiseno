/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.DTO;
import Modelo.ICalculate;
import Modelo.MathematicsFactory;
import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author diego
 */
public class WController implements IWController{
    MathematicsFactory myFactory;
    DTO myDTO;
    int operatorType;
    ICalculate operation;
    
    /**
     * 
     */
    public WController() {
        this.myFactory = new MathematicsFactory();
        this.myDTO = new DTO();
    }

    @Override
    public void setFactory(MathematicsFactory myFactory) {
        
    }

    @Override
    public MathematicsFactory getFactory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addOperatorType(String operatorType) {
        this.operatorType = Integer.parseInt(operatorType);
    }

    @Override
    public void addNumber(String number) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String calculateResult() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String asString(DTO myDTO) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Color getBackgroundColor() {
        return this.operation.getBackgroundColor();
    }

    @Override
    public void changeOperation() {
        this.operation = this.myFactory.createInstance(operatorType);
    }

    @Override
    public ImageIcon getImage() {
        System.out.println(operation.toString());
        return this.operation.getImage();
    }
}
