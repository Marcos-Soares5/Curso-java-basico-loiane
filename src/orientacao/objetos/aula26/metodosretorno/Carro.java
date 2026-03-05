package orientacao.objetos.aula26.metodosretorno;

import java.util.Scanner;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;
    //bloco de codigo
    void exibirAutonomia(){
        System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel);
    }

    double obterAutonomia(){

        System.out.println("Método obterAutonomia foi chamado");

        return capCombustivel * consumoCombustivel;
    }
}
