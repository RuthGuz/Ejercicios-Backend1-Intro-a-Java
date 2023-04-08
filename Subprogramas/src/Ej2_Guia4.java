
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
public class Ej2_Guia4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        String op;
        boolean flag=false;
        
        do{
            MostrarPersona();
            System.out.println("Quiere mostrar otra persona? SI/NO");
            op=leer.next();
           if(op.equalsIgnoreCase("no")){
               System.out.println("Gracias por usar el programa");
               flag=true;
           }
               
               
        }while(flag==false);
        
           
       
    }
       public static void MostrarPersona(){
       Scanner leer = new Scanner(System.in);
       String nombre;int edad;
       boolean flag=false;
       
       do{
       System.out.println("Ingrese el nombre de una persona");
       nombre=leer.next();
       System.out.println("Ingrese la edad de la persona ingresada");
       edad=leer.nextInt();
       if(edad>=18){
           System.out.println(nombre+ " tiene: "+ edad+ " años por lo tanto es mayor de edad");
       }else
               System.out.println(nombre+ " tiene: "+ edad+ " años por lo tanto es menor de edad");
               
       }while(flag==true);
    }
   
       }
       
    

