package Exos;

import java.util.Scanner;

public class Pilhaordena {
	private int capacidade;
	private int topo;
	private int [] pilha;
	
	public Pilhaordena(int capacidade) {
		this.capacidade = capacidade;
		this.pilha = new int[capacidade];
		this.topo = -1;
		
	}
	
	public boolean isEmpty() {
		return this.topo == -1;
	}
	
	public void push(int value) {
		if(!this.isFull()) {
			this.topo += 1;
			this.pilha[topo] = value;
		}
		
	}
	
	public boolean isFull() {
		return this.topo == this.pilha.length - 1;
	}
	
	public int peek() {
		if(this.isEmpty()) {
			throw new RuntimeException();
		}
		return this.pilha[topo];
	}
	
	
	public int pop() {
		if(this.isEmpty()) {
			throw new RuntimeException();
		}
		int value = this.pilha[topo];
		this.topo --;
		return value;
	}
	
	
	
	public static void Inverte(Pilhaordena pilhainverte, int indice) {
		Pilhaordena auxinvert = new Pilhaordena(indice);
		for(int i = 0; i <= indice; i++) {
			auxinvert.push(pilhainverte.pop());
		}
		
		//Pilhaordena auxreverse = new Pilhaordena(indice + 1);
		while(!auxinvert.isEmpty()) {
			pilhainverte.push(auxinvert.pop());
		}
		
		//while(!auxreverse.isEmpty()) {
			//pilhainverte.push(auxreverse.pop());
		//}
		
	}
	
	
	public static void sortStack(Pilhaordena stack) {
        int size = stack.capacidade;
        for (int i = 0; i < size; i++) {
            int maxIndex = getMaxIndex(stack, size - i);
            Inverte(stack, maxIndex);
            Inverte(stack, size - i - 1);
        }
    }
		
		
	public static int getMaxIndex(Pilhaordena novapilha, int endIndex) {
		int max = Integer.MIN_VALUE;
		int maxIndex = -1;
		        
		for (int i = 0; i < endIndex; i++) {
			int value = novapilha.pop();
		    if (value > max) {
		    	max = value;
		        maxIndex = i;
		    }
		    novapilha.push(value);
		}
		        
		return maxIndex;
    }
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tamanho = sc.nextInt();
		Pilhaordena auxiliar = new Pilhaordena(tamanho);
		
		for(int i = 0; i < tamanho; i++) {
			int value = sc.nextInt();
			auxiliar.push(value);
		}
		
		//sortStack(auxiliar);
		
		
		System.out.println("-");
		while(!auxiliar.isEmpty()) {
			sortStack(auxiliar);
			System.out.println("" + auxiliar.pop());
		}
	}
		   
		
		






	
	
	

}
