package orientacao.objetos.aula25.metodos;

import java.util.Scanner;

public class Carro {

    //atributos
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;
    //bloco de codigo
    void exibirAutonomia(){
        System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel);
    }
}
