import java.util.Scanner;

class Main{

    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        Pilha p = new Pilha();
        int op;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar elemento (push)");
            System.out.println("2. Remover elemento (pop)");
            System.out.println("3. Ver elemento do topo (top)");
            System.out.println("4. Verificar se a pilha está vazia (isEmpty)");
            System.out.println("5. Verificar se a pilha está cheia (isFull)");
            System.out.println("6. Imprimir toda pilha (printPilha)");
            System.out.println("7. Mostrar tamanho da pilha (size)");
            System.out.println("8. Sair");
            System.out.print("Escolha uma opção: ");
            op = sc.nextInt();


            switch(op){

                case 1:
                System.out.println("Digite o elemento a ser adicionado: ");
                int elemento = sc.nextInt();
                p.push(elemento);
                System.out.println("Elemento adicionado");
                break;

                case 2:
                p.pop();
                System.out.println("Elemento removido");
                break;

                case 3:
                System.out.println("Elemento do topo: " + p.top());
                break;

                case 4:
                System.out.println("A pilha está vazia: " + p.isEmpty());
                break;

                case 5:
                System.out.println("A pilha está cheia: " + p.isFull());
                break;

                case 6:
                System.out.println("Pilha: ");
                p.printPilha();
                break;

                case 7:
                System.out.println("Tamanho da pilha: " + p.size());
                break;

                case 8:
                System.out.println("Porgrama encerrado.");
                break;

                default:
                System.out.println("Opção inválida. Tente novamente");
            }

        }while(op!=8);

        sc.close();
    }
}