package aula19.arrays.exercicios;

import java.util.Scanner;

public class ex16 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        int tamanho = 10;

        int[] vetorA = {1, 1, 1, 1, 1, 1, 15, 15, 19, 18};

        int soma = 0;
        int somaMaiorQuinze = 0;
        int quantiQuinze = 0;
        int quantiMaiorQuinze = 0;

        for(int i=0; i < vetorA.length; i++){
            if ( vetorA[i] < 15){
                soma += vetorA[i];
            } else if (vetorA[i] == 15){
                quantiQuinze += 1;
            } else if (vetorA[i] > 15) {
                quantiMaiorQuinze += 1;
                somaMaiorQuinze += vetorA[i];
            }
        }

        System.out.println("A soma de elementos armazenados neste vetor que são inferiores a 15 é: " + soma);
        System.out.println("A quantidade de elementos armazenados no vetor que são iguais a 15 é: " + quantiQuinze);
        System.out.println("A média dos elementos armazenados no vetor que são superiores a 15 é: " + ((double)somaMaiorQuinze/quantiMaiorQuinze));
    }
}

