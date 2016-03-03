package excript;

public class Ex18operadoresdeincremento {
	public static void main(String[] args){
		
		int x = 0;
		int y = 0;
		
		System.out.println(++ x);//Incrementa valor antes de executar a variavel
		
		
		System.out.println(y ++);//Incrementa valor na procima execução variavel
		System.out.println( y );
		
		
		System.out.println("--------------------------------------");
		
		
		x = 0;
		y = 0;
		
		System.out.println(--x);//Decrementa valor antes de executar a variavel
		
		
		System.out.println(y--);//Decrementa valor na proxima execução da variavel
		System.out.println( y );
	
		System.out.println("--------------------------------------");
	
	int u = 0;
	
	u = u + 10;//Forma tradicional
	u += 10;//forma de atribuição
	u = ++u;//forma de incremento
	
	System.out.println(u);
	
	}
}
