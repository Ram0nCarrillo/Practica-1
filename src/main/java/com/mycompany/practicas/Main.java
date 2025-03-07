/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.practicas;

public class Main {

    public static void main(String[] args) {
        int[] a = {0, 5, 7, 2, 3, 1, 4, 8, 6, 9}; 
        int x = 10;
    
    System.out.println("Ordenamiento de Burbuja:");
        Ordenamiento.mostrar(Ordenamiento.burbuja(a));
    System.out.println("---------------------------------------------------");
    System.out.println("Ordenamiento de Insercion:");
        Ordenamiento.mostrar(Ordenamiento.insercion(a));
    System.out.println("---------------------------------------------------");
    System.out.println("Ordenamiento de Seleccion:");
        Ordenamiento.mostrar(Ordenamiento.seleccion(a));
    System.out.println("---------------------------------------------------");
    System.out.println("Busqueda Binaria:");
        System.out.println("Resultado: " + Busqueda.binaria(a, x));
    System.out.println("---------------------------------------------------");
    System.out.println("Busqueda Lineal:");
        System.out.println("Resultado: " + Busqueda.lineal(a, x));   
    }
}
