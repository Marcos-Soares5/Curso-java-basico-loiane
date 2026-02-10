package aula17.loopsfor.exercicios;

import java.util.Scanner;

public class ex04 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double paisA = 80000;
        double paisB = 200000;

        double taxaCrescimentoA = 3.0;
        double taxaCrescimentoB = 1.5;

        double crescimentoAnualA = 0;
        double crescimentoAnualB = 0;

        int anos = 0;

        while (paisA < paisB){
            anos += 1;
            crescimentoAnualA = (paisA / 100) * taxaCrescimentoA;
            crescimentoAnualB = (paisB / 100) * taxaCrescimentoB;
            paisA = paisA + crescimentoAnualA;
            paisB = paisB + crescimentoAnualB;
            System.out.println("habitantes do pais A: " + paisA);
            System.out.println("habitantes do pais B: " + paisB);
            System.out.println("Anos: " + anos);
        }
    }
}
