package Exos;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSort {
	
	public static int Partition(int[] v, int left, int right) {
		int pivot = v[left];
		int i = left;
		for(int j = left + 1; j <= right;j++) {
			if (v[j] <= pivot) {
				i+= 1;
				swap(v, i, j);
			}
			
			
			
		}
		swap(v, left, i);
		
		return i;
		
		
		
		
	}
	
	
	public static void swap(int[] v, int i, int j) {
		int aux = v[i];
		v[i] = v[j];
		v[j] = aux;
	}
	
	
	public static void QuickSortP(int[] v, int left, int right) {
		if(left < right) {
			int index_pivot = Partition(v, left, right);
			String num = "";
			for(int i = 0; i < v.length; i++) {
				num += Integer.toString(v[i]) + " ";
				
			}
			System.out.println(num.trim());
			
			QuickSortP(v, left, index_pivot - 1);
			QuickSortP(v, index_pivot + 1, right);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] lista = sc.nextLine().split(" ");
		
		int[] numeros = new int[lista.length];
		for(int i = 0; i < lista.length; i++) {
			numeros[i] = Integer.parseInt(lista[i]);
		}
		
		QuickSortP(numeros, 0, numeros.length - 1);
		
		
	}

	 

}
