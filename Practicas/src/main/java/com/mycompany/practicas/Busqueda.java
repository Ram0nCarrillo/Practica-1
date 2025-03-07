/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.practicas;

/**
 *
 * @author ramon
 */
public class Busqueda {

    /**
     * Búsqueda lineal en un arreglo.
     * Recorre el arreglo secuencialmente hasta encontrar el elemento buscado.
     * 
     * Expresión algebraica: O(n) en el peor de los casos, donde 'n' es el tamaño del arreglo.
     * Complejidad Temporal: O(n).
     * 
     * @param a Arreglo de enteros donde se buscará.
     * @param x Elemento a buscar.
     * @return Índice del elemento si se encuentra, -1 en caso contrario.
     */
    public static int lineal(int[] a, int x) {
        for (int i = 0; i < a.length; i++)  // Comparación y posible asignación en cada iteración
            if (a[i] == x) return i;  // Comparación que puede terminar en una devolución
        return -1;  // Comparación y devolución si no se encuentra
    }

    /**
     * Búsqueda binaria en un arreglo ordenado.
     * Divide el arreglo en mitades para buscar el elemento de manera eficiente.
     * 
     * Expresión algebraica: O(log n) en el peor de los casos, donde 'n' es el tamaño del arreglo.
     * Complejidad Temporal: O(log n).
     * 
     * @param a Arreglo de enteros ordenado donde se buscará.
     * @param x Elemento a buscar.
     * @return Índice del elemento si se encuentra, -1 en caso contrario.
     */
    public static int binaria(int[] a, int x) {
        int ini = 0, fin = a.length - 1;
        while (ini <= fin) {  // Comparación y posible reasignación en cada iteración
            int mid = (ini + fin) / 2;  // Cálculo del índice medio
            if (a[mid] == x) return mid;  // Comparación que puede terminar en una devolución
            if (a[mid] < x) ini = mid + 1;  // Comparación y reasignación si el valor de la mitad es menor
            else fin = mid - 1;  // Comparación y reasignación si el valor de la mitad es mayor
        }
        return -1;  // Devolución si no se encuentra el valor
    }

    /**
     * Método para mostrar los elementos de un arreglo en la consola.
     * 
     * Expresión algebraica: O(n), donde 'n' es el tamaño del arreglo.
     * Complejidad Temporal: O(n).
     * 
     * @param a Arreglo de enteros a mostrar.
     */
    public static void mostrar(int[] a) {
        for (int i : a) {  // Iteración a través del arreglo
            System.out.println(i);  // Imprimir cada elemento
        }
    }
}
