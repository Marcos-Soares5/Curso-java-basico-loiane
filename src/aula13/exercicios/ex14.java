package aula13.exercicios;

import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double peso = 0;
        double valorMulta = 0;
        double excesso = 0;

        System.out.println("Informe o peso dos peixes pescados no dia: kg");
        peso = s.nextDouble();

        excesso = peso - 50;

        if (excesso > 0){
            valorMulta = excesso * 4;
            System.out.printf("Houve %.2fkg de excesso de peixe, multa é de R$%.2f",excesso, valorMulta);
        } else {
            System.out.println("Não houve excesso de peixe, não haverá multa.");
        }


    }
}

