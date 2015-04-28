package Modelo;

import java.util.*;

/**
 * 
 */
public class Adder extends Calculator {

    String resultado;
    ArrayList<Integer> numeros;
    /**
     * 
     */
    public Adder() {
       this.resultado = "";
    }
    
    @Override
    public String calculate() {
        for(int i = 0;i <= numeros.size();i++) {
            resultado += numeros.indexOf(i);
        }
        return resultado;
    }
    
    public void getList(ArrayList<Integer> listaNumeros) {
        this.numeros = listaNumeros;
    }

}