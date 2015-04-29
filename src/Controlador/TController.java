package Controlador;

import Modelo.DTO;
import Modelo.ICalculate;
import Modelo.MathematicsFactory;

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
        return asString(this.operation.calculate(this.myDTO));
    }

    @Override
    public void addOperatorType(String operatorType) {
        this.operatorType = Integer.parseInt(operatorType);
    }

    @Override
    public String asString(DTO aDTO) {
        this.myDTO = aDTO;
        String result="";
        int size = this.myDTO.getListNumbers().size();
        for (int i = 0; i < size - 1; i++) {
            result += this.myDTO.getListNumbers().get(i).toString() + "| ";
        }
        System.out.println("hola holaa" + this.myDTO.getListNumbers().get(size - 1).toString());
        result += this.myDTO.getListNumbers().get(size - 1).toString();
        return result;
    }   
}
