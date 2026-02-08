package Aula10_Introducao_a_variaveis;

public class Variaveis {

    public static void main(String[] args) {

        int idade = 20;
        String nome = "Marcos";
        String nomeDoMeuCachorro = "mimi";
        String ano2014 = "2014";

        //Aceito, mas não utilizado.
        int _idade;
        int $idade;

        //Não é convenção java
        String nome_do_meu_cachorro;
        String NomeDoMeuCachorro;
        String nomeDoMeucachorro;

        idade = 25;

        System.out.println("Idade:" + idade);
        System.out.println("Nome:" + nome);

        //má pratica
        int a = 10;
        String b = "Marquinho";
        //Sempre nomear a variável com o seu significado



    }
}

