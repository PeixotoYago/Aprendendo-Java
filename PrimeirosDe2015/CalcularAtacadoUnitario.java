/*5. Crie uma classe que instancie um objeto VendaAtacado. Este objeto dever� conter os
atributos: codigoItem, Descri��oItem, valorCusto. O m�todo construtor com argumento
ReceberDados(), recebe cada valor do argumento. Um m�todo simples
CalcularNoAtacado(), calcula o valor de venda no �Atacado�, com 30% de lucro. Outro
m�todo simples CalcularVendaUnitario(), calcula o valor de venda �Unit�rio�, com 60%
de lucro. O m�todo main() da classe principal dever� atribuir os valores necess�rios
aos atributos, invocar os m�todos e em seguida imprime os dados principais do produto
e o valor de venda dos dois tipos.8*/

package Exercicios_2;

public class CalcularAtacadoUnitario {

	public static void main(String []args){
		
		VendaAtacado valor = new VendaAtacado();
		VendaAtacado valor2 = new VendaAtacado();
		
		valor.ReceberDados(7892323, "Camiseta", 70);
		valor2.ReceberDados(7892664, "Cal�a", 70);
		
		valor.CalcularNoAtacado();
		valor2.CalcularVendaUnitario();
		
		System.out.println("C�digo: "+valor.codigoItem);
		System.out.println("Descri��o: "+valor.descricaoItem);
		System.out.println("Valor de venda: "+valor.valorCusto);
		
		System.out.println("\nC�digo: "+valor2.codigoItem);
		System.out.println("Descri��o: "+valor2.descricaoItem);
		System.out.println("Valor de venda: "+valor2.valorCusto);
	}
}
