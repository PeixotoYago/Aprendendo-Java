package excript;

import java.util.Scanner;

public class Ex06_if_else {
	
	public static void main(String[] args){
		
		int num;
		
			System.out.println("digite um numero:");
			
			Scanner in = new Scanner(System.in);
			
			num = in.nextInt();
			
//          if(num==10){
			
//          System.out.println("numero correto.");
//          }
//          else{

//          System.out.println("numero errado.");
//          }
		String valor = (num <= 10) ? "Numero correto." : "Numero errado.";
		System.out.println(valor);
	}
}
