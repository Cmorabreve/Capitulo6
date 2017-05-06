/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promedio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Cristian
 */
public class Promedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeros[] = new int [10];
        int suma = 0, i;
        float prom = 0;
        BufferedReader In = new BufferedReader (new InputStreamReader(System.in));
        try{
            for (i = 0;  i< 10; i++) {
                System.out.println("Ingrese un número en la posición: "+ (i+1));
                numeros[i] = Integer.parseInt(In.readLine());
                suma = suma + numeros[i];
            }
            prom = (float) suma / 10;
            System.out.println("El promedio es: "+ prom);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
}
