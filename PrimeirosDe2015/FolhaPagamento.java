/*4. Crie uma classe que instancie um objeto FolhaPagamento. Este objeto dever� conter
os atributos: nomeFunc, Funcao, salFunc, aumento. O m�todo com argumento
ReceberValores(), recebe cada valor do argumento. Um m�todo simples calcula o novo
sal�rio para tr�s funcion�rios conforme tabela de reajuste e em seguida retorna o valor
para o m�todo main() da classe principal. O m�todo main() da classe principal dever�
atribuir os valores necess�rios aos atributos, invocar o m�todo e em seguida imprime
todos os dados dos funcion�rios inclusive o novo sal�rio. Tabela: sal�rio at� 600,00 �
aum: 20%; sal�rio > 600,00 a 1.500,00 � aum: 15%; sal�rio > 1.500,00 � aum:5%.*/

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
