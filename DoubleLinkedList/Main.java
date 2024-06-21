import java.util.Scanner;

class Main{

    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        DoubleLinkedList dll = new DoubleLinkedList();
        int op;

        do {
            System.out.println("\nMenu:");
            System.out.println("[1] -> Adicionar elemento [primeira posição da lista].");
            System.out.println("[2] -> Adicionar elemento [última posição da lista].");
            System.out.println("[3] -> Adicionar elemento [por índice].");
            System.out.println("[4] -> Remover elemento [primeira posição da lista].");
            System.out.println("[5] -> Remover elemento [última posição da lista].");
            System.out.println("[6] -> Remover elemento [por índice]");
            System.out.println("[7] -> Tamanho da lista.");
            System.out.println("[8] -> Ver se a lista está vazia.");
            System.out.println("[9] -> Mostrar lista na tela.");
            System.out.println("[0] -> Sair");
            System.out.print("Escolha uma opção: ");
            op = sc.nextInt();


            switch(op){


                case 1:
                System.out.print("Digite o elemento a ser adicionado [início]: ");
                int elemento = sc.nextInt();
                dll.addFirst(elemento);
                System.out.println("\n**Elemento adicionado**");
                break;

                case 2:
                System.out.print("Digite o elemento a ser adicionado [final]: ");
                elemento = sc.nextInt();
                dll.addLast(elemento);
                System.out.println("\n**Elemento adicionado**");
                break;

                case 3:
                System.out.print("Digite o índice que deseja inserir o elemento: ");
                int index = sc.nextInt();
                System.out.print("Digite o elemento a ser adicionado: ");
                elemento = sc.nextInt();
                dll.addByIndex(index, elemento);
                break;

                case 4:
                dll.removeFirst();
                System.out.println("\n**Elemento removido**");
                break;

                case 5:
                dll.removeLast();
                System.out.println("\n**Elemento removido**");
                break;

                case 6:
                System.out.print("Digite o índice que deseja remover o elemento: ");
                index = sc.nextInt();
                dll.removeByIndex(index);                
                break;

                case 7:
                System.out.println("Número de elementos:" + dll.size());
                break;

                case 8:
                if(dll.isEmpty()){System.out.println("\n**A lista está vazia**");}
                else {
                    System.out.println("\n**A lista não está vazia**");
                }
                break;
                
                case 9:
                dll.showList();
                break;

                default:
                System.out.println("Opção inválida. Tente novamente.");
            }

        }while(op!=0);

        sc.close();
    }
}