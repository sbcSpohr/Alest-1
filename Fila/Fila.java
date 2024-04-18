class Fila {

public int elementos[];
public int ultimo;


public Fila(){

    elementos = new int[10];
    ultimo = -1;
}

public void adicionar(int element){
    if(isFull()){
        throw new RuntimeException("Não é possível adicionar, fila cheia");
    }

    ultimo++;
    elementos[ultimo] = element;
    
}

public void remover(){
    if(isEmpty()){
    throw new RuntimeException("Não é possível remover, fila vazia.");
    }

    for(int i = 0; i <= ultimo; i++){
        elementos[i] = elementos[i+1];
    }
    ultimo--;
}

public boolean isFull(){

    return(ultimo == elementos.length);

}

public boolean isEmpty(){

    return(ultimo == -1);

}

public void printFila(){

    for(int i = 0; i <= ultimo; i++){
        System.out.println(elementos[i]);
    }

}


}