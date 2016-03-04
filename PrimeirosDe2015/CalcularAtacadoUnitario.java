/*5. Crie uma classe que instancie um objeto VendaAtacado. Este objeto deverá conter os
atributos: codigoItem, DescriçãoItem, valorCusto. O método construtor com argumento
ReceberDados(), recebe cada valor do argumento. Um método simples
CalcularNoAtacado(), calcula o valor de venda no “Atacado”, com 30% de lucro. Outro
método simples CalcularVendaUnitario(), calcula o valor de venda “Unitário”, com 60%
de lucro. O método main() da classe principal deverá atribuir os valores necessários
aos atributos, invocar os métodos e em seguida imprime os dados principais do produto
e o valor de venda dos dois tipos.8*/

package Exercicios_2;

public class CalcularAtacadoUnitario {

	public static void main(String []args){
		
		VendaAtacado valor = new VendaAtacado();
		VendaAtacado valor2 = new VendaAtacado();
		
		valor.ReceberDados(7892323, "Camiseta", 70);
		valor2.ReceberDados(7892664, "Calça", 70);
		
		valor.CalcularNoAtacado();
		valor2.CalcularVendaUnitario();
		
		System.out.println("Código: "+valor.codigoItem);
		System.out.println("Descrição: "+valor.descricaoItem);
		System.out.println("Valor de venda: "+valor.valorCusto);
		
		System.out.println("\nCódigo: "+valor2.codigoItem);
		System.out.println("Descrição: "+valor2.descricaoItem);
		System.out.println("Valor de venda: "+valor2.valorCusto);
	}
}
