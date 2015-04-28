package Controlador;

import Modelo.MathematicsFactory;
import java.util.*;

/**
 * 
 */
public interface ITController {
    MathematicsFactory myFactory = new MathematicsFactory();
    
    void showMenu();
}