/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pulga
 */
public class Ej4_Guia5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int tam;
        tam=4;
        int matriz[][] = new int[tam][tam];
        int matrizTransp[][] = new int[tam][tam];
        int matrizAnti[][] = new int[tam][tam];
        int matrizComp[][] = new int[tam][tam];
        //rellenar la matriz
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
              matriz[i][j] = (int) (Math.random() *10)-1;
            }
 
        }
        //Muestro la Matriz
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println("");
        }
        System.out.println("_____________________");
        // Llenar Trnspuesta
        
        for (int j = 0; j < tam; j++) {
            for (int i = 0; i < tam; i++) {
             matrizTransp[j][i] =matriz[i][j];
            }
        }
        //mostrar transpuesta
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                System.out.print(matrizTransp[i][j]+ " ");
            }
            System.out.println("");
    }
        System.out.println("______________________");
        // Llenar Anti
        
        for (int j = 0; j < tam; j++) {
            for (int i = 0; i < tam; i++) {
             matrizAnti[j][i] =(matrizTransp[j][i])*(-1);
            }
        }
    //mostrar Anti
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                System.out.print(matrizAnti[i][j]+ " ");
            }
            System.out.println("");
    }
        System.out.println("_____________________________");
    // comprobar si es Anti
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                
                        matrizComp[i][j]=matriz[i][j]+ matrizAnti[i][j];
                    
                
            }
        }
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                System.out.print(matrizComp[i][j]+ " ");
            }
            System.out.println("");
    }
        
}
}
