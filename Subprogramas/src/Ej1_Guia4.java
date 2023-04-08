
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
public class Ej1_Guia4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float num1,num2;
                int opcion;
        System.out.println("Ingrese 2 numeros");
        num1=leer.nextInt();
        num2=leer.nextInt();
        boolean flag=false;
        do {
        System.out.println("Menu");
        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Multiplicar");
        System.out.println("4.Dividir");
        
        opcion= leer.nextInt();
        switch (opcion){
            
            case 1:
                System.out.println("La Suma es: " + suma(num1,num2));
                break;
            case 2:
                System.out.println("La Resta es: " + resta(num1,num2));
                break;
            case 3:
                System.out.println("La Multiplicacion es: "+ multi(num1,num2));
                break;
            case 4:
                System.out.println("La Division es: "+ div(num1,num2));
                break;
        default:
                System.out.println("Opcion Incorrecta");
                 
                    flag = true;
                    
        }           
       
        }while(flag==false);
    }
    public static float suma(float num1,float num2){
        float suma;
        suma=num1+num2;
        return suma;
    }
    public static float resta(float num1,float num2){
        float resta;
        resta=num1-num2;
        return resta;
    }
    public static float multi(float num1,float num2){
        float multi;
        multi=num1*num2;
        return multi;
    }
    public static float div(float num1,float num2){
        float div;
        div=num1/num2;
        return div;
    }
}
