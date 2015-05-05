/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.DTO;
import Modelo.ICalculate;
import Modelo.MathematicsFactory;
import Modelo.LeeFichero;
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
    LeeFichero file;
    
    /**
     * 
     */
    public WController() {
        this.myDTO = new DTO();
        this.file = new LeeFichero("C:\\Users\\Pablo Mora\\Desktop\\interface.txt");
        this.myFactory = new MathematicsFactory(file);
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
    public void addNumber(String numberOne, String numberTwo) {
        if (numberTwo.isEmpty()) {
            this.myDTO.addNumber(numberOne);
        } else {
            this.myDTO.addNumber(numberOne);
            this.myDTO.addNumber(numberTwo);
        }
    }

    @Override
    public String calculateResult() {
        String result = "";
        result = asString(this.operation.calculate(this.myDTO));
        this.myDTO.getListNumbers().clear();
        return result;
    }

    @Override
    public String asString(DTO aDTO) {
        this.myDTO = aDTO;
        String result="";
        int size = this.myDTO.getListNumbers().size();
        for (int i = 0; i < size - 1; i++) {
            result += this.myDTO.getListNumbers().get(i) + "| ";
        }
        result += this.myDTO.getListNumbers().get(size - 1);
        return result;
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
        return this.operation.getImage();
    }

    @Override
    public boolean isOperationNull() {
        return this.operation == null;
    }
    
    
}
