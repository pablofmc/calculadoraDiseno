package Modelo;
import java.util.*;

/**
 * 
 */
public class MathematicsFactory {
    int operatorType;
    Calculator operation;
    /**
     * 
     */
    public MathematicsFactory() {
    }
    
    public Calculator createInstance(int operatorType) {
        switch (operatorType) {
            case 1:
                this.operation = new Adder();
            case 2:
                this.operation = new Substracter();
            case 3:
                this.operation = new Multiplier();
            case 4:
                this.operation = new Divider();
            case 5:
                this.operation = new Exponenter();
            case 6:
                this.operation = new SquareRooter();
            case 7:
                this.operation = new 
                
        }
        return this.operation;
    }

}