/*4. Crie uma classe que instancie um objeto FolhaPagamento. Este objeto dever� conter
os atributos: nomeFunc, Funcao, salFunc, aumento. O m�todo com argumento
ReceberValores(), recebe cada valor do argumento. Um m�todo simples calcula o novo
sal�rio para tr�s funcion�rios conforme tabela de reajuste e em seguida retorna o valor
para o m�todo main() da classe principal. O m�todo main() da classe principal dever�
atribuir os valores necess�rios aos atributos, invocar o m�todo e em seguida imprime
todos os dados dos funcion�rios inclusive o novo sal�rio. Tabela: sal�rio at� 600,00 �
aum: 20%; sal�rio > 600,00 a 1.500,00 � aum: 15%; sal�rio > 1.500,00 � aum:5%.*/

package Exercicios_2;

public class CalcularAumentoSalario {

	public static void main (String[] args){
		
		FolhaPagamento dados = new FolhaPagamento();
		FolhaPagamento dados2 = new FolhaPagamento();
		FolhaPagamento dados3 = new FolhaPagamento();
		
		dados.ReceberValores("Jo�o", 599);
		dados2.ReceberValores("Felipe", 1500);
		dados3.ReceberValores("Jos�", 1700);
		
		dados.CalcularNovoSalario();
		dados2.CalcularNovoSalario();
		dados3.CalcularNovoSalario();
		
		System.out.println("Nome: " +dados.nomeFunc);
		System.out.println("Sal�rio Atual: " +dados.salFunc);
		System.out.println("Novo Sal�rio: " +dados.funcao);
		
		System.out.println("\nNome: " +dados2.nomeFunc);
		System.out.println("Sal�rio Atual: " +dados2.salFunc);
		System.out.println("Novo Sal�rio: " +dados2.funcao);

		System.out.println("\nNome: " +dados3.nomeFunc);
		System.out.println("Sal�rio Atual: " +dados3.salFunc);
		System.out.println("Novo Sal�rio: " +dados3.funcao);
		
	}
}
