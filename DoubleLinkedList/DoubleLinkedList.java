class DoubleLinkedList {

    private class Node {

        int valor;
        Node next;
        Node prev;

        public Node(int valor) {
            this.valor = valor;
            next = null;
            prev = null;
        }
    }

    Node head;
    Node tail;
    int count;

    public DoubleLinkedList() {
        head = null;
        tail = null;
        count = 0;
    }

    public void addFirst(int e) {

        Node node = new Node(e);

        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
            /*
             * head.prev = node;
             * node.next = head;
             * head = node;
             */
        }
        count++;
    }

    public void addLast(int e) {

        Node node = new Node(e);

        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.prev = tail;
            tail.next = node;
            tail = node;
            /*
             * tail.next = node;
             * node.prev = tail;
             * tail = node
             */
        }
        count++;
    }

    public void addByIndex(int index, int e) {

        if (index < 0 || index >= count) {
            throw new IllegalArgumentException(
                    "índice inválido. O índice não pode ser < 0 e não pode ser >= ao tamanho da lista.");
        }

        Node node = new Node(e);

        if (index == 0) {
            if (head == null) {
                head = node;
                tail = node;
            } else {
                node.next = head;
                head.prev = node;
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
            node.prev = aux;
            aux.next.prev = node;
            aux.next = node;
        }
        count++;
    }

    public int removeFirst() {

        int data = head.valor;

        if (count == 0) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        count--;
        return data;
    }

    public int removeLast() {

        int data = tail.valor;

        if (count == 0) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }

        count--;
        return data;
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
            die.next.prev = aux;
            die.next = null;
            die.prev = null;
        }
        count--;
    }

    public int size() {

        return count;
    }

    public boolean isEmpty(){

        return(count == 0);
    }
    
    public void showList() {

        Node aux = head;
        int pos = 0;
        while (aux != null) {
            System.out.println("Índice: " + pos + " -- Valor: " + aux.valor + "\n");
            aux = aux.next;
            pos++;
        }
    }
}
