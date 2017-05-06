/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscadornúmero;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class BuscadorNúmero {
    final int N = 10;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numeros = new int[N];
        int i;
        int esta = 0;/* esta = 0 significa que supondremos que el número que desea buscar el usuario no está en el arreglo */
        int numBuscar;
        Scanner intro = new Scanner(System.in);
        
        //Primero ingresamos los números
        for (i = 0; i < N; i++) {
            System.out.println("Ingrese un número para la celda n°"+i+": ");
            numeros[i] = intro.nextInt();
        }
        //después el usuario ingresa el número que desea buscar
        System.out.println("Ingrese el número que desea buscar: ");
        numBuscar = intro.nextInt();
        
        //después buscamos el número ingresado en el arreglo
        for (i = 0; i < N; i++) {
            if(numBuscar == numeros[i]){
                //cambiamos la variable esta a 1, que significa verdadero
                esta = 1;
                break;
            }
        }
        if(esta == 0){ //si mantuvo el valor cero quiere decir que el número no está
            System.out.println("El"+numBuscar+"NO está en el arreglo");
        }else{
            System.out.println("El"+numBuscar+"SI está en el arreglo");
        }
    }
    
}
