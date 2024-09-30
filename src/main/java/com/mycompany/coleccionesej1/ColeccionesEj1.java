/*
 * 
 */

package com.mycompany.coleccionesej1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
/**
 *  Escribir un programa que sea capaz de crear un array de 1.000 elementos de números aleatorios
 *  y retorne la posición y valor del número más alto y más bajo.
 * 
 */
public class ColeccionesEj1 {

    public static void main(String[] args) {
        // ArrayList de 1,000 elementos de números aleatorios
        ArrayList<Integer> numeros = new ArrayList<>(1000);
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            numeros.add(random.nextInt(10000)); 
        }

        // Encontrar el número más alto y su posición
        int maxValor = Collections.max(numeros);
        int maxPosicion = numeros.indexOf(maxValor);

        // Encontrar el número más bajo y su posición
        int minValor = Collections.min(numeros);
        int minPosicion = numeros.indexOf(minValor);

        // Imprimir los resultados
        System.out.println("Número más alto: " + maxValor + " en la posición " + maxPosicion);
        System.out.println("Número más bajo: " + minValor + " en la posición " + minPosicion);
    }

}
