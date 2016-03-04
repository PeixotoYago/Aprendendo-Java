/*2. Crie uma classe que instancie um objeto CarrinhoDeCompra. Este objeto deverá
conter os atributos: itemCodigo, itemNome, itemMarca, itemQuantidade, valorProduto,
totalDaCompra. Um método CalcularCompra() sem retorno de valor dentro da classe
CarrinhoDeCompra, calcula o valor da compra. A segunda classe estância um objeto
CalcularValorProduto, e contém como atributo: frete, valorTotalPagar. Um método
CalcularValorTotal() sem retornar valor, calcula o total da compra na classe
CalcularValorProduto. O método main() da classe principal deverá atribuir os valores
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
