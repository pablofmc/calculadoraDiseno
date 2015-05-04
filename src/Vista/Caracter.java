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
    String input;
    
    /**
     * 
     */
    public Caracter() throws IOException {
        this.myController = new TController();
        br = new BufferedReader(new InputStreamReader(System.in));
        showMenu();
    }
    
    private void showMenu() throws IOException {
        while(true){
            System.out.println(
            "Por favor elija una de las sgts opciones \n" +
            "1. Sumar \n" +
            "2. Restar \n" + 
            "3. Multiplicar \n" +
            "4. Dividir \n" +
            "5. Exponente \n" +
            "6. Raiz Cuadrada \n" +
            "7. Conversion a Binario \n" +
            "8. Conversion a Octal \n" +
            "9. Conversion a hexadeximal \n" +
            "10. Salir"        
            );

            try {
                input = br.readLine();
            } catch (IOException ex) {
                Logger.getLogger(Caracter.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if (input.equals("10"))
                break;
            this.myController.addOperatorType(input);
            if (!this.myController.createInstance()){
                System.out.println("Operacion no disponible");
                continue;
            }

            do {
                System.out.println(
                "Por favor eliga una de las sgts opciones \n" +
                "1. Agregar" +
                "2. Aceptar"
                );
                input = br.readLine();

                if (input.equals("1")) {
                    System.out.println(
                    "Por favor ingrese un numero \n"
                    );
                    input = br.readLine();
                    this.myController.addNumber(input);
                    input = "1";
                }
            } while(!input.equals("2"));

            System.out.println("Resultado: " +this.myController.calculateResult());
        }
    }

}
