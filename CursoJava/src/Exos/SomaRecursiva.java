package Exos;

public class SomaRecursiva {
    private Node head;
    private Node tail;

    public SomaRecursiva() {
        this.head = null;
        this.tail = null;
    }

    public int soma() {
        return recursivesoma(this.tail);
    }

    private int recursivesoma(Node current) {
        if (current == null) {
            return 0;
        }
        return current.value + recursivesoma(current.prev);
    }

    public void addToHead(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addToTail(int value) {
        Node newNode = new Node(value);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }

    public static void main(String[] args) {
        SomaRecursiva lista = new SomaRecursiva();
        lista.addToHead(1);
        lista.addToHead(2);
        lista.addToHead(3);
        lista.addToTail(4);
        lista.addToTail(5);

        int sum = lista.soma();
        System.out.println("A soma dos elementos da lista é: " + sum);
    }

    private class Node {
        int value;
        Node prev;
        Node next;

        public Node(int value) {
            this.value = value;
            this.prev = null;
            this.next = null;
        }
    }
}

