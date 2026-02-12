package aula19.arrays.exercicios;

import java.util.Scanner;

public class ex11 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int tamanho = 10;

        int[] vetorA = new int[tamanho];

        for (int i=0; i < vetorA.length; i++){
            vetorA[i] = (i+1);
        }

        System.out.println("Valores do vetor A que são pares e seus indices: ");
        for (int i = 0; i < vetorA.length; i++){
            if (vetorA[i] % 2 == 0){
                System.out.println("Índice " + i + " valor: " + vetorA[i]);
            }
        }
    }
}

