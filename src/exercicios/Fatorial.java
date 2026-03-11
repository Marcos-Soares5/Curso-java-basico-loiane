package exercicios;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        long fatorial = 1;

        for (int i = 2; i <= n; i++){
            fatorial = fatorial * i;
        }

        System.out.println(fatorial);

    }

}

