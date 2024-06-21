import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("\n\nInsira o tamanho da pilha para começar: ");
        int tamanho = sc.nextInt();
        Stack s = new Stack(tamanho);
        int op;

        do {
            System.out.println("\n[1] -> Adicionar elemento.");
            System.out.println("[2] -> Remover elemento.");
            System.out.println("[3] -> Retornar elemento do topo.");
            System.out.println("[4] -> Ver se a pilha está vazia.");
            System.out.println("[5] -> Ver se a pilha está cheia.");
            System.out.println("[6] -> Ver tamanho da pilha.");
            System.out.println("[7] -> Visualizar pilha.");
            System.out.println("[0] -> Sair.");
            System.out.print("Escolha uma opção: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Digite o valor do elemento: ");
                    int elemento = sc.nextInt();
                    s.push(elemento);
                    System.out.println("\n**Elemento adicionado**");
                    break;

                case 2:
                    s.pop();
                    System.out.println("\n**Elemento removido**");
                    break;

                case 3:
                    System.out.println("\nElemento: " + s.top());
                    break;

                case 4:
                    if (s.isEmpty()) {
                        System.out.println("\n**A pilha está vazia.");
                    } else {
                        System.out.println("\n**A pilha não está vazia.");
                    }
                    break;

                case 5:
                    if (s.isFull()) {
                        System.out.println("\n**A pilha está cheia.");
                    } else {
                        System.out.println("\n**A pilha não está cheia.");
                    }
                    break;

                case 6:
                    System.out.println("\n**Número de elementos: " + s.size());
                    break;

                case 7:
                    System.out.println("\n");
                    s.showStack();
                    break;

                default:
                    System.out.println("**\nOpção inválida. Tente novamente.");

            }
        } while (op != 0);

        sc.close();
    }
}