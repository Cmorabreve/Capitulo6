/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenarmenormayor;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class OrdenarMenorMayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numeros = new int[10];
        int i;
        int j;
        int aux;
        Scanner intro = new Scanner(System.in);
        
        //Primero ingresamos los números
        for (i = 0; i < 10; i++) {
            System.out.println("Ingrese un número para la celda n° "+(i+1)+": ");
            numeros[i] = intro.nextInt();
        }
         //después ordenamos los números
        for (i = 2; i <= 10; i++) {
            for (j = 0; j < 10-i; j++) {
                if(numeros[j] > numeros[j+1]){
                //Intercambiamos las variables
                aux = numeros[j];
                numeros[j] = numeros[j+1];
                numeros[j+1] = aux;
                }
            }
        }
        //Finalmente mostramos los números ordenados
        for (i = 0; i < 10; i++) {
            System.out.println("Números ["+i+"] ="+numeros[i]);
        }
    }
    
}
