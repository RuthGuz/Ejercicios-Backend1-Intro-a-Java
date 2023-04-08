
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
public class Ej3_Guia5 {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {

     
        int vAlgoritmo[] = new int[7];
        int numero = 15022;
        int contador;
        

        //carga del vector
        vAlgoritmo[0] = 10;
        vAlgoritmo[1] = 100;
        vAlgoritmo[2] = 1055;
        vAlgoritmo[3] = 1093;
        vAlgoritmo[4] = 80505;
        vAlgoritmo[5] = 1;
        vAlgoritmo[6] = 105;
        for (int i = 0; i < vAlgoritmo.length; i++) {
            contador=0;
            do {

                vAlgoritmo[i] = vAlgoritmo[i]/ 10;
                contador++;

            } while (vAlgoritmo[i] >= 1);
            System.out.println(i+" ) Digitos " + contador);
        }

    }

}
