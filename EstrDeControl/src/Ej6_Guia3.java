
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
public class Ej6_Guia3 {

    public static void main(String[] args) {
        
        int num1, num2, opcion1 ;
        boolean flag=false;
        
        
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingese 2 numeros");
        num1= leer.nextInt();
        num2= leer.nextInt();
        do {
        System.out.println("Menu");
        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Multiplicar");
        System.out.println("4.Dividir");
        System.out.println("5.Elija opcion:");
        opcion1= leer.nextInt();
        switch (opcion1){
            
            case 1:
                System.out.println("La Suma es: " + (num1+ num2));
                break;
            case 2:
                System.out.println("La Resta es: " + (num1-num2));
                break;
            case 3:
                System.out.println("La Multiplicacion es: "+ (num1*num2));
                break;
            case 4:
                System.out.println("La Division es: "+ (num1/num2));
                break;
            case 5:
                System.out.println("Esta seguro de salir del programa?(S/N):" );
                 if (leer.next().equalsIgnoreCase("s")){
                    flag = true;
                    break;
                    }
        }
        }while(flag==false);
        System.out.println("Gracias por usar el programa");      
    } 
}

    
            
        
  
        
        
    


