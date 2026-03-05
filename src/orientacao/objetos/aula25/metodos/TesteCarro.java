package orientacao.objetos.aula25.metodos;

import java.util.Scanner;

public class TesteCarro {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        orientacao.objetos.aula25.metodos.Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        van.exibirAutonomia();
    }
}

