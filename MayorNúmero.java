/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayornúmero;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class MayorNúmero {

    final int N = 10;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numeros = new int[N];
        int i;
        int max;
        Scanner intro = new Scanner(System.in);
        
        //Primero ingresamos los números
        for (i = 0; i < N; i++) {
            System.out.println("Ingrese un número para la celda n°"+i+": ");
            numeros[i] = intro.nextInt();
        }
        
        //Despues buscamos el mayor
        max = numeros[0];
        for (i = 0; i < N; i++) {
            if(max < numeros[i]){
                //Actualizamos max con el mayor encontrado ahora
                max = numeros[i];
            }
        }
        System.out.println("El mayor de los números es: "+max);
    }
    
}
