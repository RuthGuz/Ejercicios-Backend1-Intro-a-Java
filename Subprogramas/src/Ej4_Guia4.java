
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
public class Ej4_Guia4 {

     static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
       
        System.out.println("Ingrese un numero");
        int num=leer.nextInt();
        System.out.println("El "+num+" es primo? "+ EsPrimo(num));
    }
    public static boolean EsPrimo(int n){
        
        for(int i=2;i<n;i++){
            if(n%i==0){
               return false;  
            }
           
        }
   
    return true ;
}
    
}
