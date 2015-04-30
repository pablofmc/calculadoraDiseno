package Controlador;

import Modelo.DTO;
import Modelo.MathematicsFactory;

/**
 * 
 */
public interface ITController {
    
    void setFactory(MathematicsFactory myFactory);
    MathematicsFactory getFactory();
    void addOperatorType(String operatorType);
    void addNumber( String number);
    String calculateResult();
    String asString(DTO myDTO);
}