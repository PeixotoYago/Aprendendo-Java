/*4. Crie uma classe que instancie um objeto FolhaPagamento. Este objeto deverá conter
os atributos: nomeFunc, Funcao, salFunc, aumento. O método com argumento
ReceberValores(), recebe cada valor do argumento. Um método simples calcula o novo
salário para três funcionários conforme tabela de reajuste e em seguida retorna o valor
para o método main() da classe principal. O método main() da classe principal deverá
atribuir os valores necessários aos atributos, invocar o método e em seguida imprime
todos os dados dos funcionários inclusive o novo salário. Tabela: salário até 600,00 –
aum: 20%; salário > 600,00 a 1.500,00 – aum: 15%; salário > 1.500,00 – aum:5%.*/

package Exercicios_2;

public class FolhaPagamento {
	String nomeFunc;
	double funcao, salFunc, aumento;

public void ReceberValores(String nome, double sal){
	nomeFunc = nome;
	salFunc = sal;
}

public double CalcularNovoSalario(){
	if (salFunc <= 600){
		aumento = 0.20;
	}
	if (salFunc >= 600 && salFunc <= 1500){
		aumento = 0.10;
	}
	if (salFunc > 1500){
		aumento = 0.05;
	}
	funcao = salFunc + (salFunc * aumento);
	return funcao;
}
}
