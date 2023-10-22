package Exos;

import java.util.Scanner;

public class VetorCircular {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] sequencia = sc.nextLine().split(" ");
		
		boolean out = false;
		
		for(int i = 0; i < sequencia.length; i++) {
			for(int j = i + 1; j < sequencia.length; j++) {
				if(sequencia[i].equals((sequencia)[j])) {
					out = true;
				}
				
			}
	    }
		
        System.out.println(out);
		
	  }

	
			
	

		
		
				
		
		

	
	
}
	


