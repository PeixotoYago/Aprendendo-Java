package excript;

import java.util.Random;

public class Ex23numerosaleatorios {
	public static void main(String[] args){
		
		Random num = new Random ();//obter dados aleatorios
	
		for(int i = 0; i<=5; i++) //nesse exemplo define quantas vezes avera a execução
		
		System.out.println(num.nextInt(6)+1); //aleatorios inteiros 
		//nesse exemplo vai sortear numeros até 6 que começa apartir do 1.
		
		
		//System.out.println(num.nextDouble()*25); //aleatorios fracionados
			
			//System.out.println(num.nextBoolean()); //aleatorios true e false
	}
}
