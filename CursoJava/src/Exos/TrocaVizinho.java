package Exos;

import java.util.Arrays;
import java.util.Scanner;

public class TrocaVizinho {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] sequencia = sc.nextLine().split(" ");
		
		String aux = "";
		
		for(int i = 0; i < sequencia.length; i+=2) {
			if(i == sequencia.length - 1) {
				break;
			}
			
			aux = sequencia[i];
			sequencia[i] = sequencia[i+1];
			sequencia[i+1] = aux;
			
		}
		
		
		System.out.println(Arrays.toString(sequencia));

	}

}
