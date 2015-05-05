/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import java.io.*;
import java.util.ArrayList;
import java.util.TreeMap;
 
public class LeeFichero {
    File file;
    File valids; 
    FileReader fr1;
    FileReader fr2;
    BufferedReader br1;
    BufferedReader br2;
    ArrayList<Integer> listValids;
    public LeeFichero(String path) {
        file = null;
        fr1 = null;
        br2 = null;
        valids = new File(path);
        this.listValids = new ArrayList();
    }
    public void read(TreeMap pairs) {
        try {
            file = new File ("./src/Modelo/Archivos/archivo.txt");
            fr1 = new FileReader (valids);
            br1 = new BufferedReader(fr1);

            String numero;
            while((numero=br1.readLine())!=null) {
                this.listValids.add(Integer.parseInt(numero));
            }
            fr2 = new FileReader (file);
            br2 = new BufferedReader(fr2);
            String path = null;
            while((numero=br2.readLine())!=null) {
                path = br2.readLine();
                if (this.listValids.contains(Integer.parseInt(numero))){
                    pairs.put(Integer.parseInt(numero), path);
                }
            }
        }
        catch(IOException | NumberFormatException e){
        }finally{
            try{                    
                if( null != fr1 || null != fr2  ){   
                   fr1.close();     
                }                  
            }catch (IOException e2){ 
            }
        }
    }
}
   

 