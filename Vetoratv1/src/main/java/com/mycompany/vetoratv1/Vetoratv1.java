/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vetoratv1;

import java.util.Scanner;

/**
 *
 * @author gustavowz
 */
public class Vetoratv1 {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in); 
        int[] vetor = new int [10]; // definindo um vetor com o nome "vetor" com 10 espaços dentro deles, o vetor se inicia em 0, no caso, 0 é o primeiro lugar dele
        int soma=0;
        double media;
        
        
        System.out.println("Digite 10 numeros "); // soliciatando ao usuario
        
        for(int i=0 ; i < 10; i++){ // enquanto o valor de i for menor que 10, recebe 1
             System.out.print("numero: " + (i) + ": "); // mostra o numero dentro da varaiavel 
              vetor[i] = scanner.nextInt(); // cada vetor ira receber um numero, exemplo: o vetor 0 que é o primeiro vetor, ira receber o primeiro numero digitado, o vator 1 que é o segundo valor, ira receber o segundo numero, e assim sera sempre
              
              soma += vetor[i];// somando, para mudar de vetor 0 para vetor 1 e depois de 1 para 2, assim sucessivamente 
        }
        media = soma/10.0; 
         System.out.println("Soma: " + soma);// resultado da soma dos 10  numeros
          System.out.println("Media: " + media);//,media de todos os resultados somados divididos por 10(quantidade colocada no vetor)
    }
}
