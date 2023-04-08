
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
public class Ej7_Guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadena ;int tamaño, cont1, cont2;
        cont1=0;
        cont2=0;
        boolean flag=false;
        
        
        Scanner leer = new Scanner (System.in);
        do {
           System.out.println("Ingrese una cadena de max 5 caracteres");
        cadena= leer.next();
        tamaño =cadena.length();
        if (tamaño==5 && cadena.substring(0,1).equalsIgnoreCase("x") && cadena.substring(4,5).equalsIgnoreCase("o")){
            cont1++; 
        }else if (cadena.equals("&&&&&")){
            System.out.println("Fin del proceso");
            flag=true;
  
        }
        }while (flag== false);
        cont2++;
        
          System.out.println("correctas: "+ cont1);  
           System.out.println("Incorrectas: "+ cont2);  
       
}
}
