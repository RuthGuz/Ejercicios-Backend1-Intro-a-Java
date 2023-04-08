
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
public class Ej_Teorico1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String caracter;
        String cadena = "";
        do {
            System.out.println("Ingrese un caracter para generar una frase");
            caracter = leer.nextLine();
            cadena = cadena.concat(caracter);
        } while (!caracter.equals("."));
        System.out.println("La frase armada es " + cadena);
        System.out.println("La Frase codificada es " + Codificador(cadena));
    }

    public static String Codificador(String frase) {
        String letra;
        String newFrase = "";
        for (int i = 0; i < frase.length(); i++) {
            letra = frase.substring(i, i + 1);
            switch (letra) {
                case "a":
                    letra = "@";
                    break;
                case "e":
                    letra = "#";
                    break;
                case "i":
                    letra = "$";
                    break;
                case "o":
                    letra = "%";
                    break;
                case "u":
                    letra = "*";
                    break;
                default:
                    break;
            }
            newFrase = newFrase.concat(letra);
        }
        return newFrase;
    }

}

