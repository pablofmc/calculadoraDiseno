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
                break;
            case 2:
                this.operation = new Substracter();
                break;
            case 3:
                this.operation = new Multiplier();
                break;
            case 4:
                this.operation = new Divider();
                break;
            case 5:
                this.operation = new Exponenter();
                break;
            case 6:
                this.operation = new SquareRooter();
                break;
            case 7:
                this.operation = new ToBinary();
                break;
            case 8:
                this.operation = new ToOctal();
                break;
            case 9:
                this.operation = new ToHexadecimal();    
                break;
        }
        return this.operation;
    }
    
    

}