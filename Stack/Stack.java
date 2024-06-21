class Stack {

    int elementos[];
    int topo;
    int tam;

    public Stack(int tam) {
        this.tam = tam;
        elementos = new int[tam];
        topo = -1;
    }

    public void push(int element) {
        if (isFull()) {
            throw new RuntimeException("Não é possível adicionar, pilha cheia.");
        }
        topo++;
        elementos[topo] = element;
    }

    public int pop() {
        if (topo == -1) {
            throw new RuntimeException("Não é possível remover. Pilha vazia.");
        }
        topo--;
        return topo;
    }

    public int top() {
        if (isEmpty()) {
            throw new RuntimeException("Não há elementos para mostrar, pilha vazia.");
        }

        return elementos[topo];
    }

    public boolean isEmpty() {
        return (topo == -1);
    }

    public boolean isFull() {
       return(topo == tam-1);
    }

    public int size() {
        return (topo + 1);
    }

    public void showStack() {
        int pos = topo;
        for (int i = topo; i >= 0; i--) {
            System.out.print("Índice: " + pos + " -- Valor " + elementos[i] + "\n");
            pos--;
        }
    }
}