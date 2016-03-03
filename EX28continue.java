package excript;

public class EX28continue {
	public static void main(String[] args) {
	
		System.out.println("A soma do numero de   0 a 100.");
		for (int i =0; i <= 100; i++){
       
		if(i%7==0)
	/*
	o exemplo dessa função é que quando "i" é chamdo para ser impreso 
	vai imprimir de 2 a 2 casas(EX:0, 2, 4, 6...) apartir de 0 e a sim vai obter os PARES,
	
	e se foçe 1 no lugar de 0 EX:(i%2==1) obterimos os IMPARES(EX:1, 3, 5, 7...).
	
	e se substituise o 2 por 3 EX:(i%3==0) obteriamos os divisiveis pro 3(EX:3, 6, 9, 12).
		*/	
		System.out.println(i);
		
		else
			continue;//continua a execução e segue o looping (Já volta para o for).
			
		int a = 0, soma = 0;
		while(a<i){
			a++;
			soma+=a;
		}
		System.out.println("A soma de todos os numeros é : "+ soma);
		System.out.println("Doidão da sacola");
		}
	}
}
