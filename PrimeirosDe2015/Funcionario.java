/*1. Crie uma classe que instancie um objeto Funcionário. Este objeto deverá conter os
atributos: nome, função, salarioAtual. O método simples CalcularSalario() sem retorno
de valor, calcula um aumento de 20% para dois funcionários. O método main() da
classe principal deverá atribuir os valores necessários aos atributos, invocar o método e
em seguida imprimir todos os dados dos funcionários inclusive o novo salário.*/

package Exercicios_2;

public class Funcionario 
{

String nome;
double funcao, salarioAtual;

public void CalcularSalario()
{
	funcao = (salarioAtual + ((salarioAtual * 20) /100));
}
}
