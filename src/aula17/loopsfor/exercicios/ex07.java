package aula17.loopsfor.exercicios;

import java.util.Scanner;

public class ex07 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int maiorNum = Integer.MIN_VALUE;

        for (int i = 1; i <= 5; i++){
            System.out.println("Informe " + i + "° número: ");
            int num = s.nextInt();
            if ( num > maiorNum){
                maiorNum = num;
            }
        }
        System.out.println("O maior número informado foi: " + maiorNum);
    }
}
