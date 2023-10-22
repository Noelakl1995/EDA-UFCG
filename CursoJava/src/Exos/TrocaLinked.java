package Exos;

import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class TrocaLinked {
    Node head;
    Node tail;

    public TrocaLinked() {
        this.head = null;
        this.tail = null;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void swapNeighbors(int index) {
        Node current = head;
        int currentIndex = 0;

        while (current != null && currentIndex < index) {
            current = current.next;
            currentIndex++;
        }

        // Verifica se o índice é válido
        if (current == null || current.next == null) {
            System.out.println("Índice inválido.");
            return;
        }

        Node node1 = current;
        Node node2 = current.next;

        // Troca os nós vizinhos
        Node prevNode1 = node1.prev;
        Node nextNode2 = node2.next;

        if (prevNode1 != null) {
            prevNode1.next = node2;
        } else {
            head = node2;
        }

        if (nextNode2 != null) {
            nextNode2.prev = node1;
        } else {
            tail = node1;
        }

        node1.next = nextNode2;
        node2.prev = prevNode1;
        node2.next = node1;
        node1.prev = node2;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TrocaLinked list = new TrocaLinked();

        // Lê os elementos da lista
        String[] elements = scanner.nextLine().split(" ");
        for (String element : elements) {
            int data = Integer.parseInt(element);
            list.addLast(data);
        }

        // Lê o índice para a troca
        int index = scanner.nextInt();

        // Troca os nós vizinhos no índice especificado
        list.swapNeighbors(index);

        // Imprime a lista após a troca
        list.printList();

        scanner.close();
    }
}
