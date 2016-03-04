/*4. Crie uma classe que instancie um objeto FolhaPagamento. Este objeto deverá conter
os atributos: nomeFunc, Funcao, salFunc, aumento. O método com argumento
ReceberValores(), recebe cada valor do argumento. Um método simples calcula o novo
salário para três funcionários conforme tabela de reajuste e em seguida retorna o valor
para o método main() da classe principal. O método main() da classe principal deverá
atribuir os valores necessários aos atributos, invocar o método e em seguida imprime
todos os dados dos funcionários inclusive o novo salário. Tabela: salário até 600,00 –
aum: 20%; salário > 600,00 a 1.500,00 – aum: 15%; salário > 1.500,00 – aum:5%.*/

package Exercicios_2;

public class CalcularAumentoSalario {

	public static void main (String[] args){
		
		FolhaPagamento dados = new FolhaPagamento();
		FolhaPagamento dados2 = new FolhaPagamento();
		FolhaPagamento dados3 = new FolhaPagamento();
		
		dados.ReceberValores("João", 599);
		dados2.ReceberValores("Felipe", 1500);
		dados3.ReceberValores("José", 1700);
		
		dados.CalcularNovoSalario();
		dados2.CalcularNovoSalario();
		dados3.CalcularNovoSalario();
		
		System.out.println("Nome: " +dados.nomeFunc);
		System.out.println("Salário Atual: " +dados.salFunc);
		System.out.println("Novo Salário: " +dados.funcao);
		
		System.out.println("\nNome: " +dados2.nomeFunc);
		System.out.println("Salário Atual: " +dados2.salFunc);
		System.out.println("Novo Salário: " +dados2.funcao);

		System.out.println("\nNome: " +dados3.nomeFunc);
		System.out.println("Salário Atual: " +dados3.salFunc);
		System.out.println("Novo Salário: " +dados3.funcao);
		
	}
}
