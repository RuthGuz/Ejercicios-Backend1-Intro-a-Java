
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
public class Ej5Enc2 {

    /**
     * @param args the command line arguments
     */
   
        public static void main(String[] args) {
       
         int numero;

        Scanner leer = new Scanner (System.in);  
        System.out.println ("Ingresa un numero:");
         
        numero = leer.nextInt ();
    
        System.out.println ("La Raiz cuadrada es:" + Math.sqrt(numero)+ " El doble es:" + numero*2 + " El triple es:" + numero*3 ); 
       
     
}
    }
    
