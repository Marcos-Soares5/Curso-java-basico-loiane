package aula19.arrays.exercicios;

import java.util.Scanner;

public class ex14 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int tamanho = 10;

        int[] vetorA = new int[tamanho];

        int soma = 0;
        int impares = 0;
        for (int i=0; i < vetorA.length; i++){
            vetorA[i] = (i+1);
            if (vetorA[i] % 2 == 1){
                soma += vetorA[i];
                impares += 1;
            }
        }

        System.out.println("A média aritmética é : " + (soma/impares));
    }
}

