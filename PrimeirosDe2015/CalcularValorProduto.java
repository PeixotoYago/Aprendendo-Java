/*2. Crie uma classe que instancie um objeto CarrinhoDeCompra. Este objeto deverá
conter os atributos: itemCodigo, itemNome, itemMarca, itemQuantidade, valorProduto,
totalDaCompra. Um método CalcularCompra() sem retorno de valor dentro da classe
CarrinhoDeCompra, calcula o valor da compra. A segunda classe estância um objeto
CalcularValorProduto, e contém como atributo: frete, valorTotalPagar. Um método
CalcularValorTotal() sem retornar valor, calcula o total da compra na classe
CalcularValorProduto. O método main() da classe principal deverá atribuir os valores
aos atributos das duas classes e imprimir todos os dados do produto.*/

package Exercicios_2;

public class CalcularValorProduto {
	double frete, ValorTotalPagar;

public void CalcularValorTotal(double valor){
	ValorTotalPagar = frete + valor;
}
	public static void main(String []args){
		
		CarrinhoDeCompra item = new CarrinhoDeCompra();
		CalcularValorProduto valor = new CalcularValorProduto();
		
		item.itemCodigo = 789434143;
		item.itemNome = "TV";
		item.itemMarca = "Samsung";
		item.itemQuantidade = 6;
		item.valorProduto = 1999.00;
		
		valor.frete = 254.50;
		
		item.CalcularCompra(item.itemQuantidade, item.valorProduto);
		valor.CalcularValorTotal(item.valorDaCompra);
		
		System.out.println("Código: " +item.itemCodigo);
		System.out.println("Nome: " +item.itemNome);
		System.out.println("Marca: " +item.itemMarca);
		System.out.println("Quantidade: " +item.itemQuantidade);
		System.out.println("Valor Produto: " +item.valorProduto);
		System.out.println ("\nValor da compra: " +item.valorDaCompra);
		
		System.out.println("Valor do Frete: " +valor.frete);
		System.out.println("\nValor total a Pagar: " +valor.ValorTotalPagar);
	}
	}
