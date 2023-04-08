
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
public class Ej1Enc2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese dos numeros enteros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        System.out.println("La suma de los numeros es: " +(num1+num2));
        
    }
    
}
