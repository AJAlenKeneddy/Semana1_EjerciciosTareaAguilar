
package com.mycompany.semana1_ejerciciostareaaguilar.Ejercicios;

import java.util.Scanner;

public class Ejercicio1_Aguilar {

    
    public static void main(String[] args) {
        
        Scanner Lector = new Scanner(System.in);
        double n1,n2,n3;
        System.out.println("Ingrese el primer numero...");
        n1=Lector.nextDouble();
        n1=n1/2;
        
        System.out.println("Ingrese el segundo numero...");
        n2=Lector.nextDouble();
        n2=n2/2;
        
        System.out.println("Ingrese el tercer numero...");
        n3=Lector.nextDouble();
        n3=n3/2;
        
        System.out.println("Las mitades de los numeros que ingresaste son: "+ n1+ ", "+ n2+ ", "+n3+ " respectivamente." );
        
    }
    
}
