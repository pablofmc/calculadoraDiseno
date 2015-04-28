package Modelo;

import java.util.*;

/**
 * 
 */
public class Adder extends Calculator {

    int resultado;
    ArrayList<Integer> numeros;
    /**
     * 
     */
    public Adder() {
       this.resultado = 0;
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