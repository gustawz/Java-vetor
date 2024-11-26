/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetoratv2;

import java.util.Scanner;


  
/**
 *
 * @author gustavowz
 */
public class Vetoratv2 {

   





    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[10];

        // Entrada de nomes
        System.out.println("Digite 10 nomes: ");
        for (int i = 0; i < 10; i++) {
            nomes[i] = scanner.nextLine();
              
        }

        // Busca de um nome
        System.out.print("Digite o nome a ser buscado: ");
        String nomeBuscado = scanner.nextLine();

        // Verifica se o nome está presente e exibe a posição
        int posicao = -1;
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equalsIgnoreCase(nomeBuscado)) {
                posicao = i;
                break;
            }
        }

        // Resultado
        if (posicao != -1) {
            System.out.println("Nome encontrado na posição: " + posicao);
        } else {
            System.out.println("Nome não encontrado.");
        }

        scanner.close();
    }
}