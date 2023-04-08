/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Pulga
 */
public class Juego {
   private int num1;
   private int num2;
   private String nom1;
   private String nom2;
   private String ronda1;
   
   
 public void iniciarJuego(){
     Scanner leer = new Scanner(System.in);
     int num1,num2,totalintentos=0,intentos=0,totalintentos1=0;
    
   
     
     System.out.println("*******************************************************************************************");
         System.out.println("Reglas del Juego");
         System.out.println("1.  El primer jugador elige un número y el segundo jugador intenta adivinarlo");
         System.out.println("El segundo jugador tiene un número limitado de intentos y recibe una pista de más alto o más bajo después de cada intento");
         System.out.println("El juego termina cuando el segundo jugador adivina el número o se queda sin intentos");
         System.out.println("*******************************************************************************************");
         
     for(int i=0;i<2;i++) {
         intentos=0;
       System.out.println("Jugador 1 ingrese su Alias");
     nom1=leer.next();
      System.out.println("Jugador 2 ingrese su Alias");
     nom2=leer.next();
     
     System.out.println(nom1 + " ingrese el numero secreto del 0 al 10");
     num1=leer.nextInt();
     System.out.println(nom2 + " tiene 4 intentos,que comience el juego!!!");
     System.out.println(nom2 + " ingrese el numero");
     
     
       while(intentos<4){
         num2=leer.nextInt();
         intentos++;
         if(num1==num2){
             totalintentos=intentos;
             System.out.println(nom2 + " Felicitaciones Adivinaste el numero!!! en: "+ intentos+" intentos");
            
             if(i==0){
                  totalintentos1=intentos;
                  ronda1=nom2;

       }
             System.out.println(totalintentos);
             System.out.println(totalintentos1);
              intentos=0;
             break;
         }else if(num2>num1){
             System.out.println("Ingrese un numero mas bajo");
         }else
             System.out.println("Ingrese un numero mas Alto");
     }
     if(intentos>=4){
       System.out.println(nom2 + " No adivinaste el numero y te quedaste sin INTENTOS");
       intentos++;
       
      
       
       
     }
     
     }
     if(totalintentos1<=totalintentos){
         System.out.println("felicitaciones " +ronda1+ " sos el ganador");
     }else{ 
         System.out.println("felicitaciones " +nom2+ " sos el ganador");
     }
     
 }  
        
     
}
