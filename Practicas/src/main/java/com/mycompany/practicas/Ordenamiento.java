/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practicas;

public class Ordenamiento {

    /**
     * Método de ordenamiento por burbuja.
     * Compara y intercambia elementos adyacentes hasta ordenar el arreglo.
     * 
     * Expresión algebraica: O(n2) en el peor de los casos, donde 'n' es el tamaño del arreglo.
     * Complejidad Temporal: O(n2).
     * 
     * @param a Arreglo de enteros a ordenar.
     * @return Arreglo ordenado.
     */
    public static int[] burbuja(int[] a) {
        for (int i = 0; i < a.length; i++) {  // Comparación de 'i' veces
            for (int j = 0; j < a.length - 1; j++) {  // Comparación y posible intercambio de elementos
                if (a[j] > a[j + 1]) {
                    int aux = a[j];  // Intercambio de elementos
                    a[j] = a[j + 1];
                    a[j + 1] = aux;
                }
            }
        }
        return a;
    }

    /**
     * Método de ordenamiento por inserción.
     * Inserta cada elemento en su posición correcta dentro de la parte ordenada del arreglo.
     * 
     * Expresión algebraica: O(n2) en el peor de los casos, donde 'n' es el tamaño del arreglo.
     * Complejidad Temporal: O(n2).
     * 
     * @param a Arreglo de enteros a ordenar.
     * @return Arreglo ordenado.
     */
    public static int[] insercion(int[] a) {
        for (int i = 1; i < a.length; i++) {  // Comparación e inserción de cada elemento
            int key = a[i];  // Elemento clave para inserción
            int j = i - 1;
            while (j >= 0 && a[j] > key) {  // Comparación para mover elementos mayores a la derecha
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;  // Inserción del elemento clave en la posición correcta
        }
        return a;
    }

    /**
     * Método de ordenamiento por selección.
     * Busca el elemento mínimo en el arreglo y lo intercambia con la posición correspondiente.
     * 
     * Expresión algebraica: O(n2) en el peor de los casos, donde 'n' es el tamaño del arreglo.
     * Complejidad Temporal: O(n2).
     * 
     * @param a Arreglo de enteros a ordenar.
     * @return Arreglo ordenado.
     */
    public static int[] seleccion(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {  // Selección del mínimo en cada paso
            int min = i;
            for (int j = i + 1; j < a.length; j++)  // Comparación para encontrar el mínimo
                if (a[j] < a[min]) min = j;  // Actualización del índice mínimo
            int aux = a[min];  // Intercambio del mínimo con la posición correcta
            a[min] = a[i];
            a[i] = aux;
        }
        return a;
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
        for (int i : a) {  // Iteración sobre el arreglo
            System.out.println(i);  // Imprimir cada elemento
        }
    }
}
