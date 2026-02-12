package aula19.arrays.exercicios;

import java.util.Scanner;

public class ex05 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int tamanho = 10;

        int[] vetorA = new int[tamanho];
        int[] vetorB = new int[tamanho];

        for (int i = 0; i < vetorA.length; i++){
            vetorA[i] = (i+1);
        }

        for (int i = 0; i < vetorA.length; i++){
            vetorB[i] = vetorA[i] * i;
        }

        System.out.println("Valor do vetor A" );
        for (int i=0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + ", ");
        }
        System.out.println(" ");

        System.out.println("Valor do vetor B" );
        for (int i=0; i < vetorB.length; i++){
            System.out.print(vetorB[i] + ", ");
        }
    }
}

