package aula13.exercicios;

import java.util.Scanner;

public class ex13 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe a sua altura em metros: ");
        float altura = s.nextFloat();
        System.out.println("Qual é o seu sexo? HOMENS = 1 e MULHERES = 2");
        int sexo = s.nextInt();
        System.out.println("Qual é o seu peso atual? Kg");
        double pesoAtual = s.nextDouble();

        int pesoIdeal = 0;

        if (sexo == 1){
            pesoIdeal = (int)(72.7 * altura) - 58;
        }
            else if (sexo == 2){
                pesoIdeal = (int) ((62.1 * altura) - 44.7);
            }



        System.out.printf("O seu peso ideal é: %dkg %n", pesoIdeal);
        if (pesoAtual > pesoIdeal){
            System.out.println("Você esta acima do peso ideal!");
        } else if (pesoAtual < pesoIdeal) {
            System.out.println("Você esta abaixo do peso ideal!");
        } else if (pesoAtual == pesoIdeal) {
            System.out.println("Você esta dentro do peso ideal!");
        }
    }
}

