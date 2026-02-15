package aula19.arrays.exercicios;

import java.util.Scanner;

public class ex17 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] idade = new int[3];
        int cont = 0;

        for (int i = 0; i < idade.length; i++){
            do {
                System.out.println("Informa a idade da pessoa " + (i + 1) + ":");
                idade[i] = s.nextInt();
            } while (idade[i] < 1 || idade[i] > 150);
        }

        for(int i = 0; i < idade.length; i++){
            if (idade[i] > 35){
                cont += 1;
            }
        }

        System.out.println("Quantidade de pessoas com a idade maior que 35 anos: " + cont);
    }
}
