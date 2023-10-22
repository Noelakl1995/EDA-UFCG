package Exos;

import java.util.Arrays;
import java.util.Scanner;

public class Counting {
	public static int[] CountingSort(int[] array, int k) {
		int[] C = new int[k];
		for(int i = 0; i < array.length; i++) {
			C[array[i] - 1] += 1;
			
		}
		System.out.println(C);
		
		
		for(int i = 1; i < C.length; i++) {
			C[i] += C[i-1];
			System.out.println(array[i]);
		}
		
		int [] B = new int[array.length];
		
		for(int i = array.length - 1; i >= 0; i--) {
			B[C[array[i] - 1] - 1] = array[i];
			C[array[i] - 1] -= 1;
		}
		
		return B;
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] lista = sc.nextLine().split(" ");
		int k = sc.nextInt();
		int[] numero = new int[lista.length];
		
		for(int i = 0; i < lista.length;i++) {
			numero[i] = Integer.parseInt(lista[i]);
		}
		
		CountingSort(numero, k);
		
	}

}
