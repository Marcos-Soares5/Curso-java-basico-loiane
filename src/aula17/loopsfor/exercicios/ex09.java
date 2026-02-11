package aula17.loopsfor.exercicios;

import java.util.Scanner;

public class ex09 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        for (int i = 1; i <= 50; i++ ){
            if (i % 2 == 1){
                System.out.println(i);
            }
        }
    }
}
