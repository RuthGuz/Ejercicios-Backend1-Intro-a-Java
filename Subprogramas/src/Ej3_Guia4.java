
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
public class Ej3_Guia4 {

    static Scanner leer = new Scanner(System.in);
    
    public static void main(String[] args) {
    System.out.println("Ingrese la cantidad de Euros a convertir:");
    float euros=leer.nextFloat();
        System.out.println("Ingrese el tipo de cambio a convertir: Yenes: Y,Dolares: D, Libras: L");
        String op=leer.next();
        Convertidor(euros,op);
        
    }
   public static void Convertidor(float euros,String op){
       switch(op.toLowerCase()){
           case "l":
               System.out.println("La cantidad de Libras serian: "+ (euros* 0.86));
               break;
           case "d":
               System.out.println("La cantidad de Dolares serian: "+ (euros* 1.28611));
               break;
           case "y":
               System.out.println("La cantidad de Yenes serian: "+ (euros* 129.852));
               break;
           default:
                   System.out.println("Opcion no valida");
                       
       }
       
       
       



       
   } 
}
