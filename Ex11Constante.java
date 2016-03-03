


//uso de constates o exemplo é calcular a velocidade do som.

package excript;

import java.util.Scanner;

public class Ex11Constante {
	
	public static void main(String[] args){
	
	final double vsom = 340.28;// m/s
	
	System.out.println("Digite o tempo em Segundos: ");
	Scanner in = new Scanner (System.in);
	
	int tempo = in.nextInt();
	
	System.out.println("A distancia em metros seria de " +
	tempo * vsom +
 			" metros percorridos.");
	
	System.out.println("A distancia em KM seria de " +
			 (tempo * vsom) / 1000 +
			 " km percorridos");
	}	

}
