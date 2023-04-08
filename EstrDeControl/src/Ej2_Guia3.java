
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
public class Ej2_Guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        String palabra;
        System.out.println("Ingesa una palabra:");
        palabra = leer.nextLine();
        if (palabra.equalsIgnoreCase("eureka")){
            System.out.println("Correcto");
        }else{
           System.out.println("Incorrecto"); 
        }
    }
    
}
