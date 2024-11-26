/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetoratv3;

import java.util.Scanner;

/**
 *
 * @author gustavowz
 */
public class Vetoratv3 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in); 
        int[] numeros = new int[15]; // criando um vator para guardar valores inteiros com 15 espaços
        int pares = 0; // contador de numeros pares
        int impares = 0; //contador de numeros impares

        // Entrada de números
        System.out.println("Digite 15 números inteiros:");
        for (int i = 0; i < 15; i++) { //vai rodar até i ser igual a 15, e a cada looping vai adicionar 1 a i
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        // Exibição dos resultados
        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);

        scanner.close();
    }
}