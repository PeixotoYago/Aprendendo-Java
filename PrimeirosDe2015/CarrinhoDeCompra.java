/*2. Crie uma classe que instancie um objeto CarrinhoDeCompra. Este objeto dever�
conter os atributos: itemCodigo, itemNome, itemMarca, itemQuantidade, valorProduto,
totalDaCompra. Um m�todo CalcularCompra() sem retorno de valor dentro da classe
CarrinhoDeCompra, calcula o valor da compra. A segunda classe est�ncia um objeto
CalcularValorProduto, e cont�m como atributo: frete, valorTotalPagar. Um m�todo
CalcularValorTotal() sem retornar valor, calcula o total da compra na classe
CalcularValorProduto. O m�todo main() da classe principal dever� atribuir os valores
aos atributos das duas classes e imprimir todos os dados do produto.*/

package Exercicios_2;

public class CarrinhoDeCompra {
	int itemCodigo, itemQuantidade;
	String itemNome, itemMarca;
	public double valorProduto, valorDaCompra;
	
public void CalcularCompra(int a1, double a2){
	itemQuantidade = a1; valorProduto = a2;
	valorDaCompra = itemQuantidade * valorProduto; 
}
}
