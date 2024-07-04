import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedList ll = new LinkedList();
        int op;

        do {
            System.out.println("\n[1] -> Adicionar elemento [primeira posição].");
            System.out.println("[2] -> Adicionar elemento [última posicão].");
            System.out.println("[3] -> Adicionar elemento [por índice].");
            System.out.println("[4] -> Remover elemento [primeira posição].");
            System.out.println("[5] -> Remover elemento [última posição].");
            System.out.println("[6] -> Remover elemento [por índice].");
            System.out.println("[7] -> Esvaziar a lista.");
            System.out.println("[8] -> Verificar se a lista está vazia.");
            System.out.println("[9] -> Visualizar lista.");
            System.out.println("\n******EXERCÍCIOS******:");
            System.out.println("[10] -> Encontrar maior valor da lista.");
            System.out.println("[11] -> Encontrar menor valor da lista.");
            System.out.println("[12] -> Verificar elemento do meio da lista.");
            System.out.print("Escolha uma opção: ");
            op = sc.nextInt();

            switch (op) {

                case 1:
                    System.out.print("Digite o elemento a ser adicionado: ");
                    int elemento = sc.nextInt();
                    ll.addFirst(elemento);
                    System.out.println("\n**Elemento adicionado**");
                    break;

                case 2:
                    System.out.print("Digite o elemento a ser adicionado: ");
                    elemento = sc.nextInt();
                    ll.addLast(elemento);
                    System.out.println("\n**Elemento adicionado**");
                    break;

                case 3:
                    System.out.print("Digite o índice que deseja inserir o elemento: ");
                    int index = sc.nextInt();
                    System.out.print("Digite o elemento a ser adicionado: ");
                    elemento = sc.nextInt();
                    ll.addByIndex(index, elemento);
                    System.out.println("\n**Elemento adicionado**");
                    break;

                case 4:
                    ll.removeFirst();
                    System.out.println("\n**Elemento removido**");
                    break;

                case 5:
                    ll.removeLast();
                    System.out.println("\n**Elemento removido**");
                    break;

                case 6:
                    System.out.print("Digite o índice que deseja remover o elemento: ");
                    index = sc.nextInt();
                    ll.removeByIndex(index);
                    System.out.println("\n**Elemento removido**");
                    break;

                case 7:
                    ll.clear();
                    System.out.println("\n**Lista esvaziada.");
                    break;

                case 8:
                    if (ll.isEmpty()) {
                        System.out.println("\n**A lista está vazia.");
                    } else {
                        System.out.println("\n**A lista não está vazia.");
                    }
                    break;

                case 9:
                    System.out.println("\n");
                    ll.showList();
                    break;

                case 10:
                    System.out.println("\n");
                    System.out.println("\n**Maior valor da lista: " + ll.findMaxValue());
                    break;

                case 11:
                    System.out.println("\n");
                    System.out.println("\n**Menor valor da lista: " + ll.findMinValue());
                    break;

                case 12:
                    System.out.println("\n");
                    System.out.println("\n**Elemento do meio da lista: " + ll.midNode());
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente");
            }

        } while (op != 0);

        sc.close();
    }
}