//uma maneira de interpretar os .prox é:

//aux.prox = node

//*o proximo do aux *sera* o node*

public class ListaEncadeada {

    private class Node {

        public int valor;
        public Node prox;

        public Node(int valor) {
            this.valor = valor;
            this.prox = null;
        }
    }

    private Node head;
    private Node tail;
    private int count;

    public ListaEncadeada() {
        this.head = null;
        this.tail = null;
        this.count = 0;
    }

    public void add(int valor) {

        Node node = new Node(valor);

        if (isEmpty()) {
            head = node;
            tail = node;
        }

        tail.prox = node; // o proximo do tail (tail.prox) sera o novo node //está atribuindo o novo nó
                          // (node) ao próximo nó do atual último nó da lista (tail).
        tail = node;
        count++;

        // ***********************
        // OUTRA IMPLEMENTAÇÃO
        /*
         * Node aux = head;
         * while(aux.prox != null){
         * aux = aux.prox;
         * }
         * aux.prox = novo;
         * 
         * count++;
         */
        // ***********************
    }

    public void add(int index, int valor) {

        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Posicao inválida na lista");
        }

        Node node = new Node(valor);

        if (index != 0) {
            index--;
            Node aux = head;
            while (index > 0) {
                aux = aux.prox;
                index--;
            }
            node.prox = aux.prox;
            aux.prox = node;
        } else {
            node.prox = head;
            head = node;
        }
    }

    public void remove(int index) {

        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Posicao inválida na lista");
        }
        Node aux = head;
        if (index > 0) {
            index--;
            while (index > 0) {
                aux = aux.prox;
                index--;
            }

            Node die = aux.prox;
            aux.prox = die.prox;
            die.prox = null;

            count--;

        }
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
            aux = aux.prox;
        }
        return false;

        // ***********************
        // OUTRA IMPLEMENTAÇÃO
        /*
         * if(head.valor == valor){
         * return true;
         * }
         * Node aux = head;
         * while(aux.prox!=null){
         * aux = aux.prox;
         * if(aux.valor == valor){
         * return true;
         * }
         * }
         * return false;
         */
        // ***********************
    }

    public int size() {
        return count;
    }

    public void print() {

        Node aux = head;
        int pos = 0;

        while (aux != null) {
            System.out.println("Posição: " + pos + " Valor: " + aux.valor + "\n");
            aux = aux.prox;
            pos++;
        }
    }

    // Exercicios

    public int soma() {

        Node aux = head;
        int soma = 0;

        while (aux != null) {
            soma += aux.valor;
            aux = aux.prox;

        }
        return soma;
    }

    public int media() {

        Node aux = head;

        int contador = 0;

        while (aux != null) {
            contador++;
            aux = aux.prox;
        }

        return soma() / contador;
    }

    public int maiorElemento() {

        int maior = head.valor;
        Node aux = head.prox;

        while (aux != null) {
            if (aux.valor > maior) {
                maior = aux.valor;
            }
            aux = aux.prox;
        }

        return maior;
    }

    /*
     * Implemente uma função para verificar se uma lista está ordenada. A função
     * retorna 1 se
     * estiver em ordem crescente, -1 se estiver em ordem decrescente e 0 se não
     * estiver
     * ordenado.
     */

    public int estaOrdenado() {

        Node aux = head;

        while (aux.prox != null) {

            if (aux.valor > aux.prox.valor) {
                return -1;
            } else if (aux.valor < aux.prox.valor) {
                return 1;
            }
            aux = aux.prox;
        }

        return 0;
    }

}