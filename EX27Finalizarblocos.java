package excript;

public class EX27Finalizarblocos {
	public static void main (String[]args){
		
		//labelif: if(true){
		//System.out.println("label if");
		//break labelif;
		
		
		
		label1: {
		System.out.println("label 1 asdf");
		
		
		label2: {
		System.out.println("label 2 asdf");
		
		label3: {
		System.out.println("label 3 asdf");
		if(true)       //afirmei uma condição verdadeira para usr o break
		break label2;  //Apartir desse ponto interropi o execução do bloco label2
	    System.out.println("sedryftugbynhom,p");//como a instrução break foi dada detro do bloco label3 ele tambem foi interropido
	}
		System.out.println("eu não vou sair");//esta dendro do bloco label 2 que esta enterropido então não vai executar
		
		}
		System.out.println("fim");//será impresso porque esta fora do bloco label2
	}
	System.out.println("fim2");//será impresso porque esta fora do bloco label2
}
}
