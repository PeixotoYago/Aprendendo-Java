/*3. Crie uma classe que instancie um objeto GastoDeEnergiaEletrica. Este objeto deverá
conter os atributos: NumConta, valorKw, quantidadeConsumida. Um método simples
CalcularConta() com retorno de valor, calcular o total da conta a pagar conforme
critério abaixo, e retorna em seguida o valor para o método main() da classe principal.
O método main() da classe principal deverá atribuir os valores necessários aos
atributos, invocar o método CalcularConta() e em seguida imprimir, NumConta,
valorKw, quantidadeConsumida e total da conta. Critério: quantidadeConsumida <
100 Kw, valorKw = 0,85; quantidadeConsumida > 100 Kw, valorKw = 0,99.*/

package Exercicios_2;

public class GastoDeEnergiaEletrica {
	int numConta;
	double valorKw, quantidadeConsumida, totalDaConta;

public double CalcularConta(){
	if (quantidadeConsumida < 100){
		valorKw = 0.85;
	}
	if (quantidadeConsumida >= 100){
		valorKw = 0.99;
	}
	totalDaConta = quantidadeConsumida * valorKw;
	return totalDaConta;
}
}
