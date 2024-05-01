import java.util.Scanner;

class Main{

    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        ListaEncadeada le = new ListaEncadeada();
        int op;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar elemento");
            System.out.println("2. Remover elemento");
            System.out.println("3. Verificar se a lista está vazia");
            System.out.println("4. Verificar tamanho da lista");
            System.out.println("5. Verificar posição e elementos da lista");
            System.out.println("6. Verificar a soma dos elementos da lista");
            System.out.println("7. Verificar a média dos elementos da lista");
            System.out.println("8. Verificar o maior elemento da lista");
            System.out.println("9. Verificar se a lista está crescente, decrescente ou nenhum");
            System.out.println("10. Sair");
            System.out.print("Escolha uma opção: ");
            op = sc.nextInt();


            switch(op){

                case 1:
                System.out.println("Digite o elemento a ser adicionado: ");
                int elemento = sc.nextInt();
                le.add(elemento);
                System.out.println("Elemento adicionado");
                break;

                case 2:
                System.out.println("Digite o index do elemento a ser removido: ");
                int index = sc.nextInt();
                le.remove(index);
                System.out.println("Elemento removido");
                break;

                case 3:
                System.out.println("A lista está vazia: " + le.isEmpty());
                break;

                case 4:
                System.out.println("Número de elementos na lista: " + le.size());
                break;

                case 5:
                System.out.println("Lista: "); 
                le.print();;
                break;

                case 6:
                System.out.println("Soma dos elementos da lista: " + le.soma());
                break;

                case 7:
                System.out.println("Média dos elementos da lista: " + le.media());
                break;

                case 8:
                System.out.println("Maior elemento da lista: " + le.maiorElemento());
                break;

                case 9:
                System.out.println("Ordem da lista: " + le.estaOrdenado());
                break;

                default:
                System.out.println("Opção inválida. Tente novamente");
            }

        }while(op!=10);

        sc.close();
    }
}