package Controlador;


import java.util.*;

/**
 * 
 */
public class DTO {
    ArrayList<Integer> listaNumeros;
    /**
     * 
     */  
    public DTO() {
        this.listaNumeros = new ArrayList();
    }
    
    public void anadirNumero(int num) {
        this.listaNumeros.add(num);
    }

}