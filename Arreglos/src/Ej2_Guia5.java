
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
public class Ej2_Guia5 {

    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Ingrese la dimension del vector");
        int n=leer.nextInt(), c;
        c=0;
        int vector[]=new int [n];
        
        for(int i=0;i<n;i++){
        vector[i] =(int) (Math.random() *10)+1;
       }
        for(int i=0;i<n;i++){
            
            System.out.println("["+vector[i]+"]");
        }
        
        System.out.println("Ingrese el numero a buscar dentro del vector");
        int num=leer.nextInt();
        
        for(int i=0;i<n;i++){
          if(vector[i]==num){
            System.out.println("posicion["+i+"]");
            c++;
           
          }
              
          
    } 
   
    if(c>1){
        System.out.println("El numero esta repetido");
    } else if(c==0){
        System.out.println("El numero no se encontro");
    }
    
         
    
}
}
