package excript;


import java.util.Scanner;

public class Ex08depuração1 {
	
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		
		double nota1, nota2, nota3, nota4;
		
		System.out.println("Digite a sua 1º nota:");
		nota1 = in.nextDouble();
		
		System.out.println("Digite a sua 2º nota:");
		nota2 = in.nextDouble();
		
		System.out.println("Digite a sua 3º nota:");
		nota3 = in.nextDouble();
		
		System.out.println("Digite a sua 4º nota:");
		nota4 = in.nextDouble();
	
		double soma = nota1+nota2+nota3+nota4;
		soma = soma / 4;
		
		System.out.println("A sua media é: "+soma);
		
		if(soma >= 6){
			System.out.println("Você esta aprovado(a).");
	}
		else {
		
			System.out.println("Você está reprovado(a).");
			
		}
		}
	}
	

