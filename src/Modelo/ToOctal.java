/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


/**
 *
 * @author diego
 */
public class ToOctal extends Calculator{
    
    /**
     * 
     */
    public ToOctal() {
    }
    
    @Override
    public DTO calculate(DTO myDTO) {
        this.listNumbers = myDTO.getListNumbers();
        myDTO.getListNumbers().clear();
        for (Integer number : this.listNumbers) {
            myDTO.addNumber(Integer.toOctalString(number));
        }
        return myDTO;
    } 
}
