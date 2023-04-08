
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
public class Ej_Teorico2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1,num2;
        System.out.println("Ingrese 2 numeros");
        num1=leer.nextInt();
        num2=leer.nextInt();
        EsMultiplo(num1,num2);
  
    }
  public static void EsMultiplo(int num1,int num2){
        if(num1%num2==0){
            System.out.println("El "+num1+ " es multiplo de "+ num2);
        }else
            System.out.println("El "+num1+ " no es multiplo de "+ num2);
    }  
}
