package excript;

public class EX30Formatandotextos_emcolunas {
public static void main(String[]args) {
	
	int[] array1;//declaração do nosso array
	array1 = new int[10];//cria e reserva o espaço para nosso array
	System.out.printf("%s%10s\n", "________","_________");
	System.out.printf("%s%10s\n", "|Indice|","|Valores|");
	System.out.printf("%s%10s\n", "|-------","--------|");
	
	for (int i = 0; i <= 9; i++) {
		
		System.out.printf("|%4d%4s%5d   |\n" , i,"|", array1[i]);
}	
	System.out.printf("%s%9s\n", "|-------|","--------|");
}
}