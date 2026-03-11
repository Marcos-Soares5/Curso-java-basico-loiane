package orientacao.objetos.aula29.Construtores;

import java.util.Scanner;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    void exibirAutonomia(){

        System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + "km");

    }

    double calcularCombustivel(double km){

        double qtdCombustivel = km/consumoCombustivel;

        return qtdCombustivel;
    }

    Carro(){ }

    Carro (String marca_, String modelo_){
        marca = marca_;
        modelo = modelo_;

    }

}

