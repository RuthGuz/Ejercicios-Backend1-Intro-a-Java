/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacionapp;

import java.util.Scanner;

/**
 *
 * @author Pulga
 */
public class Operacion {

    private int num1;
    private int num2;

    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Operacion() {
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public void crearOperacion() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros enteros ");
        this.num1 = leer.nextInt();
        this.num2 = leer.nextInt();
    }

    public void sumar() {
        int suma = num1 + num2;
        System.out.println("la suma es: "+ suma);

    }

    public void restar() {
        int resta =  num1 - num2;
        System.out.println("la resta es: "+ resta);
    }

    public void multiplicar() {
        int multi = 1;
        if (num1 == 0 || num2 == 0) {
            System.out.println("Error multiplicacion por cero es 0");
        } else {
            multi = num1 * num2;
            System.out.println("la multiplicacion es: "+ multi);
        }
        
    }
    
    public void dividir() {
        int div=0;
        if (num1>num2) {
           
        }if(num1!=0 && num2!=0){
            div = num1 / num2;
            
        } else {
            System.out.println("Error no esta contemplada la div en 0");
            
        }
            System.out.println("la division es: "+ div);
    }

}
