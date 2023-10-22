package Exos;

import java.util.Scanner;

public class MultiplicacaoSequencia {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		
		String[] sequencia = scanner.nextLine().split(" ");
		
		String resultado = "";
		
		for(int i = 0; i < sequencia.length; i++) {
			
			resultado += Integer.toString((Integer.parseInt(sequencia[i])*n)) + " ";
					
		}
		
		
		System.out.println(resultado.trim());
        
        		
    }
	
}



