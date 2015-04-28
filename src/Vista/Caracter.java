package Vista;

import Controlador.ITController;
import Controlador.TController;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 */
public class Caracter {
    ITController myController;
    BufferedReader br;
    String sTexto;
    
    /**
     * 
     */
    public Caracter() {
        this.myController = new TController();
        showMenu();
    }
    
    private void showMenu() {
        
        System.out.println(
        "Por favor elija una de las sgts acciones \n" +
        "1. Sumar \n" +
        "2. Restar \n" + 
        "3. Multiplicar \n" +
        "4. Dividir \n" +
        );
        do {
            br = new BufferedReader(new InputStreamReader(System.in));
            try {
                sTexto = br.readLine();
            } catch (IOException ex) {
                Logger.getLogger(TController.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(sTexto);
            this.myController.addNumber();
            
        } while(!sTexto.equals("5"));
    }

}