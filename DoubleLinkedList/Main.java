import java.util.Scanner;

class Main{

    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        DoubleLinkedList<Integer> dll = new DoubleLinkedList<>();
        int op;

        do {
            System.out.println("\nMenu:");
            System.out.println("[1] -> Adicionar elemento [primeira posição da lista].");
            System.out.println("[2] -> Adicionar elemento [última posição da lista].");
            System.out.println("[3] -> Adicionar elemento [por índice].");
            System.out.println("[4] -> Remover elemento [primeira posição da lista].");
            System.out.println("[5] -> Remover elemento [última posição da lista].");
            System.out.println("[6] -> Remover elemento [por índice]");
            System.out.println("[7] -> Mostrar lista na tela.");
            System.out.println("[0] -> Sair");
            System.out.print("Escolha uma opção: ");
            op = sc.nextInt();


            switch(op){

                int elemento;

                case 1:
                System.out.println("Digite o elemento a ser adicionado: ");
                elemento = sc.nextInt();
                dll.addFirst(elemento);
                System.out.println("\nElemento adicionado\n");
                break;

                case 2:
                System.out.println("Digite o index do elemento a ser removido: ");
                elemento = sc.nextInt();
                dll.addLast(elemento);
                System.out.println("\nElemento adicionado\n");
                break;

                case 3:
                dll.removeFirst();
                System.out.println("\nElemento removido\n");
                break;

                case 4:
                dll.removeLast();
                System.out.println("\nElemento removido\n");
                break;

                case 5:
                dll.showList();
                break;

                case 6:
                System.out.println("Informe o index que deseja inserir o elemento.");
                int index = sc.nextInt();
                System.out.println("Informe o elemento que deseja inserir.");
                elemento = sc.nextInt();
                dll.addByIndex(index, elemento);
                break;

                default:
                System.out.println("Opção inválida. Tente novamente");
            }

        }while(op!=0);

        sc.close();
    }
}