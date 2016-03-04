/*1. Crie uma classe que instancie um objeto Funcionário. Este objeto deverá conter os
atributos: nome, função, salarioAtual. O método simples CalcularSalario() sem retorno
de valor, calcula um aumento de 20% para dois funcionários. O método main() da
classe principal deverá atribuir os valores necessários aos atributos, invocar o método e
em seguida imprimir todos os dados dos funcionários inclusive o novo salário.*/

package Exercicios_2;

public class CalcularSalario {

	public static void main (String[] args){
		
		Funcionario dados = new Funcionario();
		Funcionario dados2 = new Funcionario();
		
		dados.nome = "João";
		dados2.nome = "Pereira";
		
		dados.salarioAtual = 2300.00;
		dados2.salarioAtual = 9000.00;
		
		dados.CalcularSalario();
		dados2.CalcularSalario();
		
		System.out.println("Nome: " +dados.nome);
		System.out.println("Salário Atual: " +dados.salarioAtual);
		System.out.println("Novo Salário: " +dados.funcao);
		
		System.out.println("\nNome: " +dados2.nome);
		System.out.println("Salário Atual: " +dados2.salarioAtual);
		System.out.println("Novo Salário: " +dados2.funcao);
		
	}
}
