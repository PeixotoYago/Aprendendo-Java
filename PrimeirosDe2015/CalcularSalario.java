/*1. Crie uma classe que instancie um objeto Funcion�rio. Este objeto dever� conter os
atributos: nome, fun��o, salarioAtual. O m�todo simples CalcularSalario() sem retorno
de valor, calcula um aumento de 20% para dois funcion�rios. O m�todo main() da
classe principal dever� atribuir os valores necess�rios aos atributos, invocar o m�todo e
em seguida imprimir todos os dados dos funcion�rios inclusive o novo sal�rio.*/

package Exercicios_2;

public class CalcularSalario {

	public static void main (String[] args){
		
		Funcionario dados = new Funcionario();
		Funcionario dados2 = new Funcionario();
		
		dados.nome = "Jo�o";
		dados2.nome = "Pereira";
		
		dados.salarioAtual = 2300.00;
		dados2.salarioAtual = 9000.00;
		
		dados.CalcularSalario();
		dados2.CalcularSalario();
		
		System.out.println("Nome: " +dados.nome);
		System.out.println("Sal�rio Atual: " +dados.salarioAtual);
		System.out.println("Novo Sal�rio: " +dados.funcao);
		
		System.out.println("\nNome: " +dados2.nome);
		System.out.println("Sal�rio Atual: " +dados2.salarioAtual);
		System.out.println("Novo Sal�rio: " +dados2.funcao);
		
	}
}
