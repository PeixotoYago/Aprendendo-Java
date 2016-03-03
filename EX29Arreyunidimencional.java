package excript;

public class EX29Arreyunidimencional {

public static void main(String[]args) {
	
	int[] array1;//declaração do nosso array
	array1 = new int[10];//cria e reserva o espaço para nosso array
	
	for (int i = 0; i <= 9; i++) {
		
		System.out.printf("%5d%5d\n", i, array1[i]);
	}	
	}
}
