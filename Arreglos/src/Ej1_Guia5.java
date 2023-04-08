
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
public class Ej1_Guia5 {

    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        int vector[]=new int [10];
        
        System.out.println("Ingrese 10 numeros enteros");
        for(int i=0;i<10;i++){
        vector [i]=i+1;
        
        
        } 
        
        for(int i=9;i>=0;i--){
          System.out.println("["+vector[i]+"]");  
        }
        
    }
    
}
