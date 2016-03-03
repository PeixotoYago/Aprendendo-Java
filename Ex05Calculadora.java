package excript;

import java.util.Scanner;

public class Ex05Calculadora {
	public static void main(String[] args){
		
	Scanner in = new Scanner(System.in);
	
	double num1, num2, soma, subtracao, multiplicacao, divisao;
	
	    //ao dividir alguns numeros inteiros pode vir a dar valores fracionados  
	    // e usando Double podemos usar valores fracionados na calculadora
	
	System.out.println("Insira o primeiro numero:");
	num1 = in.nextDouble();
	
	System.out.println("Insira o Segundo numero:");
	num2 = in.nextDouble();
	
	soma = num1 + num2;
	subtracao = num1 - num2;
	multiplicacao = num1 * num2;
	divisao = num1 / num2;
	
	System.out.println("O resultado da soma é: "+soma);
	System.out.println("O resultado da subtração é: "+subtracao);
	System.out.println("O resultado da multiplicação é: "+multiplicacao);
	System.out.println("O resultado da divisão é: "+divisao);
		
	}
	
	
}
