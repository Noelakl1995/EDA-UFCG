package Exos;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionsortRecursiva {
	
		public static void InsereOrdenado(int[] array, int start) {
			int i = start;
			while(i > 0 && array[i] < array[i-1]) {
				int aux = array[i];
				array[i] = array[i-1];
				array[i-1] = aux;
				i--;
			}
		
			
				
		}
		
		public static void InsertionRecursivo(int[] array, int start) {
			if(start < array.length) {
				InsereOrdenado(array, start);
				System.out.println(Arrays.toString(array));
				InsertionRecursivo(array, start + 1);
			}
		}
		
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String[] lista = sc.nextLine().split(" ");
			int[] numeros = new int[lista.length];
			
			for(int i = 0; i < lista.length; i++) {
				numeros[i] = Integer.parseInt(lista[i]);
			}
			
			InsertionRecursivo(numeros, 1);
		}
	

    
}
