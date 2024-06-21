class Queue {

    public int elementos[];
    public int ultimo;
    public int tam;

    public Queue(int tam){
        this.tam = tam;
        elementos = new int[tam];
        ultimo = -1;
    }

    public void enqueue(int element) {
        if (isFull()) {
            throw new RuntimeException("Não é possível adicionar, fila cheia");
        }

        ultimo++;
        elementos[ultimo] = element;
    }

    public void dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Não é possível remover, fila vazia.");
        }

        for (int i = 0; i < ultimo; i++) {
            elementos[i] = elementos[i + 1];
        }
        ultimo--;
    }

    public int size() {

        return ultimo;
    }

    public boolean isFull() {

        return (ultimo == elementos.length-1);
     }

    public boolean isEmpty() {

        return (ultimo == -1);
    }

    public void showQueue() {

        int pos = 0;
        for (int i = 0; i <= ultimo; i++) {
            System.out.println("índice: " + pos + " -- Valor: " + elementos[i]);
            pos++;
        }

    }

}