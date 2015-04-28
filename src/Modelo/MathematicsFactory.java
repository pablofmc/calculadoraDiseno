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
        this.operatorType = operatorType;
        switch (this.operatorType) {
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
                this.operation = new ToBinary();
            case 8:
                this.operation = new ToOctal();
            case 9:
                this.operation = new ToHexadecimal();                
        }
        return this.operation;
    }

}