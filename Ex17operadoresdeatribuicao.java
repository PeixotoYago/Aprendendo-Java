package excript;

public class Ex17operadoresdeatribuição {
	public static void main(String[] args){
		
		/*
		 x += 1 (é igual) x = x + 1;
         x -= 1 (é igual) x = x - 1;
         x *= 1 (é igual) x = x * 1;
         x /= 1 (é igual) x = x / 1;
         x %= 1 (é igual) x = x % 1;
		 */
		
		int x,y;
	    x = 12;
		y = 4 ;
		
	System.out.println( x += y );// apartir deste ponto x passa a ter o valor de 16...
		
	x = 12;
	System.out.println( x -= y);
	
	System.out.println("-------------------------------------");
	
	x = 12;
	System.out.println(x *= y);
	
	x = 12;
	System.out.println(x /= y);
	
	
	System.out.println("-------------------------------------");
	
	x = 15;
	System.out.println(x %=y);
	
	}
}
