package Modelo;
import java.io.File;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 */
public class MathematicsFactory {
    int operatorType;
    String calcString;
    Calculator operation;
    TreeMap <Integer,String>pairs;
    /**
     * 
     * @param fichero
     */
    public MathematicsFactory(LeeFichero fichero) {
        pairs = new TreeMap();
        fichero.read(pairs);
    }
    
    public Calculator createInstance(int operatorType) {
        this.operatorType = operatorType;
        this.calcString = pairs.get(this.operatorType);
        if (this.calcString == null) {
            return this.operation = null;
        }
        Class calc;
        try {
            calc = Class.forName(calcString);
            try {
                this.operation = (Calculator)calc.newInstance();
            } catch (InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(MathematicsFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MathematicsFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return this.operation;
    }

}