class DoubleLinkedList<T> {

    private class Node {

        T valor;
        Node next;
        Node prev;

        public Node(T valor) {
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

    public void addFirst(T e) {

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

    public void addLast(T e) {

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

    public void addByIndex(int index, T e) {

        if (index < 0 || index >= count) {
            throw new IllegalArgumentException(
                    "índice inválido. O índice não pode ser menor que zero e não pode ser maior ou igual ao tamanho da lista.");
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

    public T removeFirst() {

        T data = head.valor;

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

    public T removeLast() {

        T data = tail.valor;

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

    public int size() {

        return count;
    }

    public T removeByIndex(int index) {

        if (index < 0 || index >= count) {
            throw new IllegalArgumentException(
                    "índice inválido. O índice não pode ser menor que zero e não pode ser maior ou igual ao tamanho da lista.");
        }

        return null;
    }

    public void showList() {

        Node aux = head;
        while (aux != null) {
            System.out.println("Valor: " + aux.valor + "\n");
            aux = aux.next;
        }
    }
}
