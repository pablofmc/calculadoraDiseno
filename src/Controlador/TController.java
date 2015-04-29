package Controlador;

import Modelo.DTO;
import Modelo.ICalculate;
import Modelo.MathematicsFactory;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 */
public class TController implements ITController {
    
    MathematicsFactory myFactory;
    DTO myDTO;
    int operatorType;
    ICalculate operation;
    
    /**
     * 
     */
    public TController() {
        this.myFactory = new MathematicsFactory();
        this.myDTO = new DTO();
    }

    @Override
    public void setFactory(MathematicsFactory myFactory) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public MathematicsFactory getFactory() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addNumber(String number) {
        this.myDTO.addNumber(number);
    }

    @Override
    public String calculateResult() {
        this.operation = this.myFactory.createInstance(this.operatorType);
        return this.operation.calculate(this.myDTO);
    }

    @Override
    public void addOperatorType(String operatorType) {
        this.operatorType = Integer.parseInt(operatorType);
    }
      
    
    
}
