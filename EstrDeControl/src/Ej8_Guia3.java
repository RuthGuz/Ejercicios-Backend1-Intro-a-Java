
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
public class Ej8_Guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int i ,j, ele;
        System.out.println("Ingrese la cantidad de elementos");
        ele= leer.nextInt();
        for(i=0;i<ele;i++){
            for(j=0;j<ele;j++){
                if(i==0 || i==ele-1 || j==0 || j==ele-1){
                    System.out.print(" * ");
       
                }else{
                    System.out.print("   ");
                }
                      
    }
        
     System.out.println();   
} 
}
}    