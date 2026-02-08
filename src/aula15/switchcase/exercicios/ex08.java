package aula15.switchcase.exercicios;

import java.util.Scanner;

public class ex08 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("informe o valor do produto 1: ");
        double produto1 = s.nextInt();
        System.out.println("informe o valor do produto 2: ");
        double produto2 = s.nextInt();
        System.out.println("informe o valor do produto 3: ");
        double produto3 = s.nextInt();

        if (produto1 < produto2 && produto1 < produto3){
            System.out.println("O produto 1 é o mais barato");
        } else if (produto2 < produto3 && produto2 < produto1){
            System.out.println("O produto 2 é o mais barato");
        } else if (produto3 < produto2 && produto3 < produto1){
            System.out.println("O produto 3 é o mais barato");
        }
    }
}

