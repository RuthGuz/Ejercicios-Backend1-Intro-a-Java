
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
public class Ej5_Guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int limite, num, suma;
        suma=0;
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingese un valor limite POSITIVO");
        limite= leer.nextInt();
        do {
            System.out.println("Ingrese un numero positivo distinto de cero");
            num= leer.nextInt();
            suma=suma+num;
            
        } while (suma<=limite);
        System.out.println("La suma exedio el limite");
    }
    
}
