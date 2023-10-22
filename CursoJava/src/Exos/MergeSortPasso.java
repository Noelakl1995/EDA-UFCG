package Exos;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSortPasso {
	
	public static void Merge(int[] v, int left, int middle, int right) {
		int[] helper = new int[v.length];
		for(int i = left; i <= right; i++) {
			helper[i] = v[i];
			
		}
		
		int i = left;
		int j = middle + 1;
		int k = left;
		
		while(i <= middle && j <= right) {
			if(helper[i] <= helper[j]) {
				v[k] = helper[i];
				i++;
			}else {
				v[k] = helper[j];
				j++;
			}
			k++;
			
			
		}
		
		
		while(i <= middle) {
			v[k] = helper[i];
			i++;
			k++;
			
			
		}
		
		
		while(j <= right) {
			v[k] = helper[j];
			j++;
			k++;
			
			
		}
	
	}
	
	
	public static void MergeSort(int[] v, int left, int right) {
		if(left >= right) {
			return;
		}
		else {
			System.out.println(Arrays.toString(Arrays.copyOfRange(v, left, right + 1)));
			int middle = (left + right)/2;
			
			MergeSort(v, left, middle);
			
			System.out.println(Arrays.toString(Arrays.copyOfRange(v, left, right + 1)));
			MergeSort(v, middle + 1, right);
			
			Merge(v, left, middle, right);
			
			
		}
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] lista = sc.nextLine().split(" ");
		
		int[] numeros = new int[lista.length];
		for(int i = 0; i < lista.length; i++) {
			numeros[i] = Integer.parseInt(lista[i]);
		}
		
		MergeSort(numeros, 0, numeros.length - 1);
		
		
	}

}
