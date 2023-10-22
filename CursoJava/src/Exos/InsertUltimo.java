package Exos;

import java.util.Arrays;
import java.util.Scanner;

public class InsertUltimo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] sequencia = sc.nextLine().split(" ");
		
		
			String aux = "";
			int n = sequencia.length;
			int ultimo = Integer.parseInt(sequencia[n-1]);
			int i = n - 2;
			while(i > 0 && Integer.parseInt(sequencia[i]) > ultimo) {
				aux = (sequencia[i + 1]);
				sequencia[i+1] = sequencia[i];
				sequencia[i] = aux;
				i--;
				
			}
			
		
		System.out.println(Arrays.toString(sequencia));
		
	}
		


}
