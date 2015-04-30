/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.DTO;
import Modelo.ICalculate;
import Modelo.MathematicsFactory;

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
}
