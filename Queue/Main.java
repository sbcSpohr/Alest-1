import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("\nInsira o tamanho da fila: ");
        int tamanho = sc.nextInt();

        Queue q = new Queue(tamanho);
        int op;

        do {

            System.out.println("\n[1] -> Adicionar elemento. ");
            System.out.println("[2] -> Remover elemento.");
            System.out.println("[3] -> Verificar se a fila está vazia. ");
            System.out.println("[4] -> Verificar se a fila está cheia. ");
            System.out.println("[5] -> Visualizar fila. ");
            System.out.println("[0] -> Encerrar programa.");
            System.out.print("Escolha uma opção: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Digite o elemento a ser adicionado: ");
                    int elemento = sc.nextInt();
                    q.enqueue(elemento);
                    System.out.println("\n**Elemento adicionado**\n");
                    break;

                case 2:
                    q.dequeue();
                    System.out.println("\n**Elemento removido**\n");
                    break;

                case 3:
                    if (q.isEmpty()) {
                        System.out.println("\n**A fila está vazia.");
                    } else {
                        System.out.println("\n**A fila não está vazia.");
                    }
                    break;

                case 4:
                    if (q.isFull()) {
                        System.out.println("\n**A fila está cheia.");
                    } else {
                        System.out.println("\n**A fila não está cheia.");
                    }
                    break;

                case 5:
                    System.out.println("\n");
                    q.showQueue();
                    break;

                default:
                    System.out.println("\n**Opção inválida. Tente novamente.");
                    break;
            }
        } while (op != 0);

        sc.close();
    }
}
