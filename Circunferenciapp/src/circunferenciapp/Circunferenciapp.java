/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circunferenciapp;

import circunferenciapp.figurasGeometricas.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Pulga
 */
public class Circunferenciapp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Circunferencia c1=new Circunferencia();
        c1.crearCircunferencia();
        c1.mostrar();
    }
    
}
