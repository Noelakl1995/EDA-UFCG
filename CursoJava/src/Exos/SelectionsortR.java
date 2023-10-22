package Exos;

import java.util.Arrays;
import java.util.Scanner;



public class SelectionsortR {
	public static void SelectionSort(int[] v, int leftIndex, int rightIndex) {
		if(v.length <= 1 || leftIndex >= rightIndex)  {
			return;
		}
		int menor = leftIndex;
		for(int j = leftIndex + 1; j <= rightIndex;j++) {
			if(v[j] < v[menor]) {
				menor = j;
			}
				
		}
		swap(v, leftIndex, menor);
		leftIndex += 1;
		System.out.println(Arrays.toString(v));
	
	SelectionSort(v, leftIndex, rightIndex);
				
			
			
			
				
			
			
			
			
		}
		
	
	
	public static void swap(int[] v, int i, int j) {
		int aux = v[i];
		v[i] = v[j];
		v[j] = aux;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] sequencia = sc.nextLine().split(" ");
		int[] numeros = new int[sequencia.length];
		
		for(int i = 0; i < sequencia.length; i++) {
			numeros[i] = Integer.parseInt(sequencia[i]);
			
		}
		
		SelectionSort(numeros, 0, numeros.length - 1);
		
		
		
	}

}
