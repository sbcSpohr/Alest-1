public class LinkedList {

    private class Node {

        public int valor;
        public Node next;

        public Node(int valor) {
            this.valor = valor;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int count;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.count = 0;
    }

    public void addFirst(int valor) {

        Node node = new Node(valor);

        if (isEmpty()) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head = node;
        }
        count++;
    }

    public void addLast(int valor) {

        Node node = new Node(valor);

        if (isEmpty()) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        count++;
    }

    public void addByIndex(int index, int element) {

        if (index < 0 || index >= count) {
            throw new IllegalArgumentException(
                    "índice inválido. O índice não pode ser < 0 e não pode ser >= ao tamanho da lista.");
        }

        Node node = new Node(element);

        if (index == 0) {
            if (head == null) {
                head = node;
                tail = node;
            } else {
                node.next = head;
                head = node;
            }
        }
        if (index != 0) {
            index--;
            Node aux = head;
            while (index > 0) {
                aux = aux.next;
                index--;
            }
            node.next = aux.next;
            aux.next = node;
        }
        count++;
    }

    public void removeFirst() {

        if (isEmpty()) {
            throw new RuntimeException("Lista vazia.");
        }

        head = head.next;
        if (head == null) {
            tail = null;
        }

        count--;
    }

    public void removeLast() {

        if (head.next == null) {
            head = null;
            tail = null;
        } else {
            Node aux = head;
            while (aux.next.next != null) {
                aux = aux.next;
            }
            aux.next = null;
            tail = aux;
        }
        count--;
    }

    public void removeByIndex(int index) {

        if (index <= 0 || index >= count) {
            throw new IllegalArgumentException(
                    "índice inválido. O índice não pode ser <= 0 e não pode ser >= ao tamanho da lista.");
        }

        if (index > 0) {
            index--;
            Node aux = head;
            while (index > 0) {
                aux = aux.next;
                index--;
            }
            Node die = aux.next;
            aux.next = die.next;
            die.next = null;
        }
        count--;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public void clear() {
        head = null;
        count = 0;
    }

    public boolean contains(int valor) {
        Node aux = head;
        while (aux != null) {
            if (aux.valor == valor) {
                return true;
            }
            aux = aux.next;
        }
        return false;
    }

    public int size() {

        return count;
    }

    public void showList() {

        Node aux = head;
        int pos = 0;

        while (aux != null) {
            System.out.println("Posição: " + pos + " Valor: " + aux.valor + "\n");
            aux = aux.next;
            pos++;
        }
    }
}