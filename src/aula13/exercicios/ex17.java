package aula13.exercicios;

import java.util.Scanner;

public class ex17 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Qual é o tamanho da área a ser pintada em metros quadrados? ");
        double areaDePintura = s.nextDouble(); //54

        double quantiLatas = ((areaDePintura / 6) / 18);
        //arredondamento para cima
        if (quantiLatas % 1 > 0){
            double resto = (quantiLatas % 1);
            quantiLatas = quantiLatas + 1 - resto;
        }
        double precoLatas = quantiLatas * 80;

        System.out.printf("Você precisa de %.0f latas de tinta para pintar a área, o preço total é de R$%.2f", quantiLatas, precoLatas);


    }
}

