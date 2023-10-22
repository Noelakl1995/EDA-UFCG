package Exos;

import java.util.Scanner;
import java.util.Stack;

public class PilhaInvertida {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tamanho = sc.nextInt();
		Stack <Integer> stack = new Stack<>();
		
		for(int i = 0; i < tamanho;i++) {
			int value = sc.nextInt();
			stack.push(value);
		}
		
        int indice_passado = sc.nextInt();
		
        Inverte(stack, indice_passado);
        
        System.out.println("-");
        
        while(!stack.isEmpty()) {
        	System.out.println(" "+ stack.pop());
        }
		
	}
	
	
	public static void Inverte(Stack <Integer> stack, int indice) {
		Stack <Integer> auxstack = new Stack<>();
		for(int i = 0; i <= indice; i++) {
			auxstack.push(stack.pop());
		}
		
		Stack <Integer> reversestack = new Stack<>();
		while (!auxstack.isEmpty()) {
            reversestack.push(auxstack.pop());
        }

       
        while (!reversestack.isEmpty()) {
            stack.push(reversestack.pop());
        }
    
}






	}

