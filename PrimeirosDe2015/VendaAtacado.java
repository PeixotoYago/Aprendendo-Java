/*5. Crie uma classe que instancie um objeto VendaAtacado. Este objeto deverá conter os
atributos: codigoItem, DescriçãoItem, valorCusto. O método construtor com argumento
ReceberDados(), recebe cada valor do argumento. Um método simples
CalcularNoAtacado(), calcula o valor de venda no “Atacado”, com 30% de lucro. Outro
método simples CalcularVendaUnitario(), calcula o valor de venda “Unitário”, com 60%
de lucro. O método main() da classe principal deverá atribuir os valores necessários
aos atributos, invocar os métodos e em seguida imprime os dados principais do produto
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
