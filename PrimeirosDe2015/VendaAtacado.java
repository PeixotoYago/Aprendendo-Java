/*5. Crie uma classe que instancie um objeto VendaAtacado. Este objeto dever� conter os
atributos: codigoItem, Descri��oItem, valorCusto. O m�todo construtor com argumento
ReceberDados(), recebe cada valor do argumento. Um m�todo simples
CalcularNoAtacado(), calcula o valor de venda no �Atacado�, com 30% de lucro. Outro
m�todo simples CalcularVendaUnitario(), calcula o valor de venda �Unit�rio�, com 60%
de lucro. O m�todo main() da classe principal dever� atribuir os valores necess�rios
aos atributos, invocar os m�todos e em seguida imprime os dados principais do produto
e o valor de venda dos dois tipos.8*/

package Exercicios_2;

public class VendaAtacado {
	int codigoItem;
	String descricaoItem;
	double valorCusto;

public void ReceberDados(int cod, String desc, double cust){
	codigoItem = cod;
	descricaoItem = desc;
	valorCusto = cust;
}	
public void CalcularNoAtacado(){
	valorCusto = valorCusto + (valorCusto * 0.30);
}
public void CalcularVendaUnitario(){
	valorCusto = valorCusto + (valorCusto * 0.60);
}
}
