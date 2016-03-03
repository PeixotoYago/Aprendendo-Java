package excript;

import java.util.Scanner;

public class Ex25Operadorternario2 {
	public static void main (String[]args){
		
		Scanner in = new Scanner(System.in);
		System.out.println( "Qual o seu dia preferido da semana?");
        System.out.println("Digite 1 para Domingo e 7 para Sabado.");
        int num = in.nextInt();
        
        String dia = (num==1) ? "Domingo":
        	  		 (num==2) ? "Segunda":
        	  	     (num==3) ? "Terça":
        	  	     (num==4) ? "Quarta":
        	  	     (num==5) ? "Quinta":
            	  	 (num==6) ? "Sexta":
                	 (num==7) ? "Sabado":
                		 "Invalido";
       
        System.out.println("O seu dia preferido é "+ dia);   
		
	
	}
}
