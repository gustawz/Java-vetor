/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetoratv4;

import java.util.Scanner;

/**
 *
 * @author gustavowz
 */
public class Vetoratv4 {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        double[] notas = new double[5];
        double soma = 0;

        // Entrada de notas
        System.out.println("Digite 5 notas:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];
        }

        // Cálculo da média
        double media = soma / notas.length;
        int acima = 0, abaixo = 0, naMedia = 0;

        // Contagem de alunos
        for (double nota : notas) {
            if (nota > media) {
                acima++;
            } else if (nota < media) {
                abaixo++;
            } else {
                naMedia++;
            }
        }

        // Exibição dos resultados
        System.out.println("Média das notas: " + media);
        System.out.println("Acima da média: " + acima);
        System.out.println("Abaixo da média: " + abaixo);
        System.out.println("Na média: " + naMedia);

        scanner.close();
    }
}