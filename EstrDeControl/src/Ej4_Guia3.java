
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pulga
 */
public class Ej4_Guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer = new Scanner (System.in);
        String palabra;
        System.out.println("Ingese una palabra");
        palabra = leer.next();

        if (palabra.substring(0,1).equalsIgnoreCase("a") ){
            System.out.println("Correcto");
        }else{
           System.out.println("Incorrecto"); 
        }
    }
    
}
