package excript;

public class EX16Precedenciadeoperadores {
	public static void main(String[] args){
	
		int a, b, c;
		a = 20;
		b = 10;
		c = 5;
		
	    
	    System.out.println(a + b - c);// a execução ocore da esquerda para a direita
	    
	    System.out.println(a + b * c);// o sinal de * tem prioridade sobre + e -
	    
	  System.out.println ((a + b)* c);// e necessario () em uma operação caso queira que ela seja executada primeiro
	
	  System.out.println(a / b * c );//o sinal de / tem prioridade sobre os outros
	  
	  System.out.println(a * b - c);// o sinal de * tem prioridade sobre + e -
	}
	}

