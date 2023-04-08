/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaej1enc2;

/**
 *
 * @author Pulga
 */
public class JavaEj1Enc2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int numero1;
        int numero2;
        int suma;
        Scanner leer = new Scanner (System.in);  
        System.out.println ("Ingresa dos numeros:");
         
        numero1 = leer.nextInt ();
        numero2 = leer.nextInt();
         
        suma = numero1 + numero2;
        System.out.println ("La suma es: " + suma ); 
    }
    }
    
}
