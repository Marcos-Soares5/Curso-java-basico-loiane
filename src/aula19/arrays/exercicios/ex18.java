package aula19.arrays.exercicios;

import java.util.Scanner;

public class ex18 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] idade = new int [3];
        int cont = 0;
        int menorIdade = Integer.MAX_VALUE;
        int maiorIdade = Integer.MIN_VALUE;
        int pessoaMaiorIdade = 0;
        int pessoaMenorIdade = 0;

        for (int i = 0; i < idade.length; i++){
            do {
                System.out.println("Informa a idade da pessoa " + (i + 1) + ":");
                idade[i] = s.nextInt();
            } while (idade[i] < 1 || idade[i] > 150);

            if (idade[i] < menorIdade) {
                menorIdade = idade[i];
                pessoaMenorIdade = i;
            }

            if (idade[i] > maiorIdade) {
                maiorIdade = idade[i];
                pessoaMaiorIdade = i;
            }
        }

        for(int i = 0; i < idade.length; i++){

        }

        System.out.println("Menor Idade esta no índice " + pessoaMenorIdade + " com a idade de: " + menorIdade + " anos");
        System.out.println("Maior Idade esta no índice " + pessoaMaiorIdade + " com a idade de: " + maiorIdade + " anos");
    }
}
