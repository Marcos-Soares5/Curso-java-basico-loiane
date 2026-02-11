package aula17.loopsfor.exercicios;

import java.util.Scanner;

public class ex10 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe o valor mínimo do intervalo: ");
        int min = s.nextInt();

        System.out.println("Informe o valor maximo do intervalo: ");
        int max = s.nextInt();

        System.out.print("Intervalo: ");
        for (int i = min + 1; i < max; i++){
            System.out.print(i + ", ");
        }

    }
}
