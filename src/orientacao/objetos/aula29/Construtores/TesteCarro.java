package orientacao.objetos.aula29.Construtores;

import java.util.Scanner;

public class TesteCarro {

    public static void main(String[] args) {

        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

         Carro van2 = new Carro("Fiat", "Uno");

        System.out.println(van2.marca);
        System.out.println(van2.modelo);

    }

}

