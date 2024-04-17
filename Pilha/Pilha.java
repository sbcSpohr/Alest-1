public class Pilha {

int elementos[];
int topo;

public Pilha(){

    elementos = new int[10];
    topo = -1;
}

    public void push(int element){
        if(isFull()){
            throw new RuntimeException("Não é possível adicionar, pilha cheia.");
        }
        topo++;
        elementos[topo] = element;

    }

    public void pop(){
        if(topo == -1){
             throw new RuntimeException("Lista vazia, não é possível remover");
        }
        
        topo--;

    }

    public boolean isEmpty(){

        if(topo == -1){
            return true;
        }
        return false;
    }

    public boolean isFull(){

        if(topo == 9){
            return true;
        }
        return false;
    }

    public int top(){
        if(isEmpty()){
            throw new RuntimeException("Não há elementos para mostrar, pilha vazia.");
        }

        return elementos[topo];
    }

    public void printPilha(){

        for(int i = 0; i <= topo; i++){
            System.out.print(elementos[i]+ "\n");
        }
    }


}