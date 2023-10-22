package Exos;

import java.util.NoSuchElementException;
import java.util.Scanner;

import org.w3c.dom.Node;

public class LinkedTrim<T> {
	private Node head;
	private Node tail;
	private int size;
	
	private static class Node <T>{
		T data;
		Node <T> next;
		Node <T> prev;
		Node(T data){
			this.data = data;
		}
	}
	
	public boolean isEmpty() {
		return this.head == null;
	}
	
	
	public  void addLast(int num) {
		Node<T> newNode = new Node(num);
		if(this.isEmpty()) {
			this.head = newNode;
			this.tail = newNode;
		}else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
		
		size += 1;
		
		
	}
	
	
	public T removeLast() {
		if(this.isEmpty()) {
			throw new NoSuchElementException();
		}
		
		T data = (T) this.head.data;
		
		if (this.head.next == null) {
			this.head = null;
			this.tail = null;
		}
		else {
			this.tail = this.tail.prev;
			this.tail.next = null;
		}
		size --;
		return data ;
			
	}
	
	
	public T removeFirst() {
		if(this.isEmpty()) {
			throw new NoSuchElementException();
		}
		
		T data = (T) this.head.data;
		
		if(this.head.next == null) {
			this.head = null;
			this.tail = null;
		
		}
		else {
			this.head = this.head.next;
			this.head.prev = null;
		}
		
		size --;
		return data;
		
	}
	
	public String ToString() {
		StringBuilder result = new StringBuilder();
	    result.append("");
	    Node<T> elemento = head;
	    
	    while (elemento != null) {
	        result.append(elemento.data);
	        elemento = elemento.next;
	        if (elemento != null) {
	            result.append(" ");
	        }
	    }
	    
	    result.append("");
	    return result.toString();

		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedTrim<Integer> lista = new LinkedTrim<>();
		
		String[] numeros = sc.nextLine().split(" ");	
		
		
		int qdeExtremos = Integer.parseInt(sc.nextLine());
		int[] listas = new int[numeros.length];
		
		for(int i = 0; i < numeros.length;i++) {
			listas[i] = Integer.parseInt(numeros[i]);
			lista.addLast(listas[i]);
		}
		
		for(int i = 0; i < qdeExtremos; i++) {
			if(!lista.isEmpty()) {
				lista.removeFirst();
				if(!lista.isEmpty()) {
					lista.removeLast();
				}
			}
		}
		
		
	    if (lista.isEmpty()) {
	    	System.out.println("vazia");
	    } else {
	        System.out.println(lista.ToString());
	    }
	        
		
	
	
	}
	
	
	
}
	
	
	
	
	


