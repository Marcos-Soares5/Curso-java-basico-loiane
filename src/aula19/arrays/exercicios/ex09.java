package aula19.arrays.exercicios;

import java.util.Scanner;

public class ex09 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int tamanho = 10;

        int[] vetorA = new int[tamanho];
        int[] vetorB = new int[tamanho];
        int[] vetorC = new int[tamanho];

        for (int i = 0; i < vetorA.length; i++){
            vetorA[i] = (i+1);
            vetorB[i] = vetorA[i];
            vetorC[i] = vetorA[i] / vetorB[i];
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
        System.out.println(" ");

        System.out.println("Valor do vetor C" );
        for (int i=0; i < vetorB.length; i++){
            System.out.print(vetorC[i] + ", ");
        }
    }
}

