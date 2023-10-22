package Exos;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] sequencia = sc.nextLine().split(" ");
		int[] numeros = new int[sequencia.length];
		
		for(int i = 0; i < sequencia.length; i++) {
			numeros[i] = Integer.parseInt(sequencia[i]);
			
		}
		
		SelectionSort(numeros);
		
		
		
	}
	
	public static void SelectionSort(int[] v) {
		for(int i = 0; i<v.length; i++) {
			int menor = i;
			for(int j = i+1; j < v.length; j++) {
				if(v[j] < v[menor]) {
					menor = j;
				}
			}
			
			if(v[i] != v[menor]) {
				int aux = v[i];
				v[i] = v[menor];
				v[menor] = aux;
				
				System.out.println(Arrays.toString(v));
			}
			
			
			
		}
		
	}
	
	
	

}
