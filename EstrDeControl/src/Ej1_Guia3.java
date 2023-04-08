
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
public class Ej1_Guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;

        Scanner leer = new Scanner (System.in);  
        System.out.println ("Ingresa un numero:");
         
        num = leer.nextInt ();
        
        if(num/2 !=0){
        System.out.println ("El numero ingresado es impar");
    } else { 
        System.out.println ("El numero ingresado es par");
    }
    }
}

