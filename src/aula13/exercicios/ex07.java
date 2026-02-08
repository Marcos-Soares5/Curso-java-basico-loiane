package aula13.exercicios;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ex07 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe a altura do quadrado: ");
        double altura = s.nextDouble();
        System.out.println("Informe a largura do quadrado: ");
        double largura = s.nextDouble();

        double area = altura * largura;

        System.out.printf("A área deste quadrado é %.2fM² %nO doblo desta área é %.2fM²", area, area * 2);
    }
}

