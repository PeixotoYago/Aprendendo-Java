/*1. Crie uma classe que instancie um objeto Funcion�rio. Este objeto dever� conter os
atributos: nome, fun��o, salarioAtual. O m�todo simples CalcularSalario() sem retorno
de valor, calcula um aumento de 20% para dois funcion�rios. O m�todo main() da
classe principal dever� atribuir os valores necess�rios aos atributos, invocar o m�todo e
em seguida imprimir todos os dados dos funcion�rios inclusive o novo sal�rio.*/

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
