/*3. Crie uma classe que instancie um objeto GastoDeEnergiaEletrica. Este objeto dever�
conter os atributos: NumConta, valorKw, quantidadeConsumida. Um m�todo simples
CalcularConta() com retorno de valor, calcular o total da conta a pagar conforme
crit�rio abaixo, e retorna em seguida o valor para o m�todo main() da classe principal.
O m�todo main() da classe principal dever� atribuir os valores necess�rios aos
atributos, invocar o m�todo CalcularConta() e em seguida imprimir, NumConta,
valorKw, quantidadeConsumida e total da conta. Crit�rio: quantidadeConsumida <
100 Kw, valorKw = 0,85; quantidadeConsumida > 100 Kw, valorKw = 0,99.*/

package Exercicios_2;

public class CalcularEnergia {

	public static void main (String []args){
		
		GastoDeEnergiaEletrica valor = new GastoDeEnergiaEletrica();
		
		valor.numConta = 159653;
		valor.quantidadeConsumida = 120;
		
		valor.CalcularConta();
		
		System.out.println("N�mero da Conta: " +valor.numConta);
		System.out.println("Valor KW: "+valor.valorKw);
		System.out.println("Quantidade Consumida: "+valor.quantidadeConsumida);
		System.out.println("\nTotal da Conta: "+valor.totalDaConta);
		
	}
}
