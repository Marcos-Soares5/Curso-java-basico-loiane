# For Each

## O que é
É um for melhorado para ser utilizado para o output de arrays, ele tem uma sintaxe menor.

## Sintaxe
~~~Java
for ( "Declarar uma variavel do mesmo tipo do array" : "declarar o array"){
    System.out.println(variavel do tipo do array);
}

Exemplo:

int [] notas = new int [10];

for (int nota : notas){
    System.out.println(nota);
}
~~~

## Como Funciona

Basicamente há um índice dentro desse for que não temos acesso, com isso a variável "nota" recebe o valor de "notas[indice]".
Neste for ele percorre todo o índice de 0 ao último. 

~~~java
int [] notas = new int [10];

for (int i = 0; i < notas.length;i++) {
    int nota = notas[i];
    System.out.println(nota);
}
~~~

## Arrays de arrays

É a mesma sintaxe, mas muda que terá dois for each.

Exemplo: 

~~~java

double[][] notasAlunos = new double [3][4];
         // ↓ Mudança ([]) - Com ele esta acessando o primeiro array
for (double[] notasAluno : notasAlunos)

~~~