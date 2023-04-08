
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
public class Ej2_Teorico_Guia5 {

    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        String nombres[]=new String [10];
        for(int i=0;i<10;i++){
        System.out.println("Ingrese el nombre");
        String nom=leer.next();
          nombres[i]=nom; 
          
        }
        for (int i = 0; i < 10; i++) {
        System.out.println("[" + nombres[i] + "]");
    }
    
}
}
