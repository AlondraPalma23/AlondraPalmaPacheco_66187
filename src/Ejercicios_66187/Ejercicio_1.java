package Ejercicios_66187;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * @author Alondra Palma
 */
public class Ejercicio_1 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("--------[1.-mayor numero de ambos]--------");
        System.out.println("Ingresa 2 numeros");
        
        Scanner miConsola = new Scanner (System.in);
        int numero1 = miConsola.nextInt();
        int numero2 = miConsola.nextInt();
        
        if (numero1 > numero2 ) {
            System.out.println( numero1 + " es mayor " );
        }else{
            System.out.println( numero2 + " es mayor " );
        }
    }
  
}
