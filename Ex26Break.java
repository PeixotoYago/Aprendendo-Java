package excript;

public class Ex26Break {
	public static void main (String[]args){
		labelForI:
		for(int i = 1; i<5; i++){
			
	    for(int j = 1; j<5; j++){
	    	System.out.println("O valor de i: "+i+" e j tem o valor de: "+j);
	    	
	    	if(i==4 && j==4)
	    	break labelForI;
	    }
	}
}
}