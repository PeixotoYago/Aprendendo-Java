



//operadores logicos o exemplo é clasificar pessoas por idade

package excript;

import java.util.Scanner;

public class Ex12operadoreslogicos1 {
	
	public static void main(String[] args){
	
	final int idjovem, ididoso;
	idjovem = 21;
	ididoso = 60;
		
		System.out.println("Digite uma idade:");
	Scanner in = new Scanner(System.in);
	
	int idade = in.nextInt();
	
	if( idade <= idjovem){
		System.out.println("Você é um jovem!");
	}else{
		if( idade >= ididoso){
			System.out.println("Você é um idoso!");
		}else{
			if ((idade > idjovem)&&(idade < ididoso)){
				System.out.println("Você é uma pessoa de meia idade!");
			}
		}
	}
	
	}	
	


}
