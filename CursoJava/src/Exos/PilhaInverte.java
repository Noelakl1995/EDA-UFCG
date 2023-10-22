package Exos;

import java.util.Scanner;

public class PilhaInverte {
	
	private int capacidade;
	private int topo;
	private int [] pilha;
	
	public PilhaInverte(int capacidade) {
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
	
	
	
	public static void Inverte(PilhaInverte pilhainverte, int indice) {
		PilhaInverte auxinvert = new PilhaInverte(indice + 1);
		for(int i = 0; i <= indice; i++) {
			auxinvert.push(pilhainverte.pop());
		}
		
		PilhaInverte auxreverse = new PilhaInverte(indice + 1);
		while(!auxinvert.isEmpty()) {
			auxreverse.push(auxinvert.pop());
		}
		
		while(!auxreverse.isEmpty()) {
			pilhainverte.push(auxreverse.pop());
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tamanho = sc.nextInt();
		PilhaInverte auxiliar = new PilhaInverte(tamanho);
		
		for(int i = 0; i < tamanho; i++) {
			int value = sc.nextInt();
			auxiliar.push(value);
		}
		
		int indice_passado = sc.nextInt();
		
		Inverte(auxiliar, indice_passado);
		System.out.println("-");
		while(!auxiliar.isEmpty()) {
			System.out.println("" + auxiliar.pop());
		}
	}

}
