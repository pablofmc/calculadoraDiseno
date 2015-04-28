package Controlador;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 
 */
public class TController implements ITController {
    BufferedReader br;
    String sTexto;
    /**
     * 
     */
    public TController() {
        showMenu();
    }

    @Override
    public void showMenu() {
        System.out.println(
        "Por favor elija una de las sgts acciones \n" +
        "1. Sumar \n" +
        "2. Restar \n" + 
        "3. Multiplicar \n" +
        "4. Dividir \n"
        );
        br = new BufferedReader(new InputStreamReader(System.in));
        try {
            sTexto = br.readLine();
        } catch (IOException ex) {
            Logger.getLogger(TController.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(sTexto);
    }
      
    
    
}