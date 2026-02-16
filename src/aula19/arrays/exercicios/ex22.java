package aula19.arrays.exercicios;

import java.util.Scanner;

public class ex22 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] vetorA = new int[10];
        int contZero = 0;
        int contUm = 0;

        for (int i = 0; i < vetorA.length; i++){
            vetorA[i] = (int)Math.round(Math.random() * 1);
            if (vetorA[i] == 0){
                contZero += 1;
            } else if (vetorA[i] == 1){
                contUm += 1;
            }
        }

        System.out.println("Vetor A: ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorA[i] + ", ");
        }
        System.out.println();

        double porcZero = ((double) contZero / 10) * 100;
        double porcUm = ((double) contUm / 10) * 100;

        System.out.println("Percentage de 0: " + porcZero);
        System.out.println("Percentage de 1: " + porcUm);
    }
}
