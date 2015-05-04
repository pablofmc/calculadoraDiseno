package Controlador;

import Modelo.DTO;
import Modelo.ICalculate;
import Modelo.MathematicsFactory;
import Modelo.LeeFichero;

/**
 * 
 */
public class TController implements ITController {
    
    MathematicsFactory myFactory;
    DTO myDTO;
    int operatorType;
    ICalculate operation;
    LeeFichero file;
    
    /**
     * 
     */
    public TController() {
        this.myDTO = new DTO();
        this.file = new LeeFichero("C:\\Users\\diego\\Desktop\\caracter.txt");
        this.myFactory = new MathematicsFactory(file);
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
        String result;
        result = asString(this.operation.calculate(this.myDTO));
        return result;
    }

    @Override
    public void addOperatorType(String operatorType) {
        this.operatorType = Integer.parseInt(operatorType);
        System.out.println("jahgsj");
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
    public boolean createInstance() {
        this.operation = this.myFactory.createInstance(this.operatorType);
        if(this.operation == null){
            return false;
        } else {
            return true;
        }
    }
}
