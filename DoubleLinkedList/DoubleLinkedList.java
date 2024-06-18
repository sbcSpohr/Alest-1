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

    public void showList(){

        Node aux = head;
        while(aux != null){
            System.out.println("Valor: " + aux.valor + "\n");
            aux = aux.next;
        }
    }
}
