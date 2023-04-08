
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
public class Ej6_Guia5 {

   static Scanner leer = new Scanner(System.in);
   
    public static void main(String[] args) {
        int tam,sumaI,sumaJ,sumaK,sumaL;
        tam=3;
        //crear la matriz
        int matriz[][] = new int[tam][tam];
        
        //Rellenar la matriz
        System.out.print("Rellene la matriz con numeros del 1 al 9");
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
              matriz[i][j] = leer.nextInt();
            }
 
        }
        //Mostrar Matriz Cargada
        
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                System.out.print("["+matriz[i][j]+ "]" );
            }
            System.out.println("");
    }
        sumaI=sumaFila(matriz,0);
        sumaJ=sumaCol(matriz,0);
        sumaK=sumaDiag1(matriz);
        sumaL=sumaDiag2(matriz);
        
        System.out.println(sumaFila(matriz,0));
        System.out.println(sumaCol(matriz, 0));
        System.out.println(sumaDiag1(matriz));
        System.out.println(sumaDiag2(matriz));
        
        
      if(sumaI==sumaJ && sumaK==sumaL){
          System.out.println("es magico");
      }else
            System.out.println("no es magico");
    }
  public static int sumaFila(int matriz[][],int fila){
      int sumaF;
      sumaF=0;
     
          for (int j = 0; j < 3; j++) {
            sumaF=sumaF+matriz[fila][j]; 
            
          }
          System.out.println("la suma de la fila es: "+ sumaF);
      
           
     return sumaF;
  
}  
  public static int sumaCol(int matriz[][], int col){
      int sumac=0;
     
           for (int i = 0; i < 3; i++) {
             sumac=sumac+matriz[i][col]; 
              
          }
      
      
      System.out.println("la suma es: "+ sumac);
      return sumac; 
  
}  
  public static int sumaDiag1(int matriz[][]){
      int sumad1=0;
     
           for (int i = 0; i < 3; i++) {
           sumad1=sumad1+matriz[i][i]; 
              
          }
      System.out.println("la suma es: "+ sumad1);
      return sumad1; 
  
}  
  public static int sumaDiag2(int matriz[][]){
      int sumad2=0;
     
           for (int i = 0; i < 3; i++) {
               for (int j = 0; j < 3; j++) {
                  if(i+j == matriz.length-1){
                    sumad2 = sumad2+matriz[i][j];
                }
               }
           
              
          }
      System.out.println("la suma es: "+ sumad2);
      return sumad2; 
  
}  
}
