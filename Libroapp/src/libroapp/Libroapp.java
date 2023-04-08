/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libroapp;

import java.util.Scanner;
import libroapp.TipoDeLibro.Libro;

/**
 *
 * @author Pulga
 */
public class Libroapp {

    public static void main(String[] args) {
        

        Libro li1 = new Libro();
        li1.cargarLibro();
        li1.mostrarLibro();
       
    }

}
