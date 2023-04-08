/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libroapp.TipoDeLibro;

import java.util.Scanner;

/**
 *
 * @author Pulga
 */
public class Libro {

    private String ISBN;
    private String Titulo;
    private String Autor;
    private int Paginas;
  Scanner leer = new Scanner(System.in);  
    //Constructor Vacio
    public Libro(){
        
    }
//Co//Constructor con parametros

    public Libro(String ISBN, String Titulo, String Autor, int Paginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Paginas = Paginas;
    }
    //Metodo Cargar Libro
    public void cargarLibro(){
        System.out.println("Ingrese el ISBN:");
        this.ISBN=leer.next();
        System.out.println("Ingrese el Titulo:");
        this.Titulo=leer.next();
        System.out.println("Ingrese el Autor:");
        this.Autor=leer.next();
        System.out.println("Ingrese La Cantidad de Paginas:");
        this.Paginas=leer.nextInt();
    }
    //Metodo Mostrar Libro
     public void mostrarLibro(){
         System.out.println("ISBN: "+ ISBN+ " Titulo: "+Titulo+" Autor: "+Autor+" Paginas: "+Paginas); 
     }
    //GET

    public String getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public int getPaginas() {
        return Paginas;
    }
    // SET

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setPaginas(int Paginas) {
        this.Paginas = Paginas;
    }

    
    
}
