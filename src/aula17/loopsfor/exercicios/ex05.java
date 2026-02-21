package aula17.loopsfor.exercicios;

import java.util.Scanner;

public class ex05 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String continuar = " ";

        do {
            System.out.println("Informe a quantidade de habitantes do pais A:");
            double paisA = s.nextDouble();

            while (paisA < 0) {
                System.out.println("Informe a quantidade de habitantes do pais A:");
                paisA = s.nextDouble();
            }

            System.out.println("Você quer continuar? S-sim N-Não");
            continuar = s.next();

            System.out.println("Informe a taxa de crescimento do pais A ");
            double taxaCrescimentoA = s.nextDouble();

            while (taxaCrescimentoA < 1) {
                System.out.println("Informe a taxa de crescimento do pais A ");
                taxaCrescimentoA = s.nextDouble();
            }

            System.out.println("Informe a quantidade de habitantes do pais B:");
            double paisB = s.nextDouble();

            while (paisB < 1) {
                System.out.println("Informe a quantidade de habitantes do pais B:");
                paisB = s.nextDouble();
            }

            System.out.println("Informe a taxa de crescimento do pais B ");
            double taxaCrescimentoB = s.nextDouble();

            while (taxaCrescimentoB < 1) {
                System.out.println("Informe a taxa de crescimento do pais B ");
                taxaCrescimentoB = s.nextDouble();
            }

            double crescimentoAnualA = 0;
            double crescimentoAnualB = 0;

            int anos = 0;

            while (paisA < paisB) {
                anos += 1;
                crescimentoAnualA = (paisA / 100) * taxaCrescimentoA;
                crescimentoAnualB = (paisB / 100) * taxaCrescimentoB;
                paisA = paisA + crescimentoAnualA;
                paisB = paisB + crescimentoAnualB;
            }

            System.out.println("Levará " + anos + " anos para o Pais A ultrapassar o numero de habitantes do Pais B");
            System.out.println("Você quer continuar? S-sim N-Não");
            continuar = s.next();

        } while (continuar.equalsIgnoreCase("S"));
    }
}
