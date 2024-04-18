import java.util.Scanner;
public class Main {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Fila f = new Fila();
        int op;

        do{

            System.out.println("1. Adicionar elemento. ");
            System.out.println("2. Remover elemento.");
            System.out.println("3. Verificar se a fila está vazia. ");
            System.out.println("4. Verificar se a fila está cheia. ");
            System.out.println("5. Imprimir toda a fila. ");
            System.out.println("6. Encerrar programa.");
            op = sc.nextInt();

            switch (op) {
                case 1:
                System.out.println("Digite o elemento a ser adicionado: ");
                int elemento = sc.nextInt();
                f.adicionar(elemento);   
                System.out.println("Elemento adicionado."); 
                break;

                case 2:
                f.remover();
                System.out.println("Elemento removido.");
                break;

                case 3:
                System.out.println("A fila está vazia: " + f.isEmpty());
                break;

                case 4:
                System.out.println("A fila está cheia: " + f.isFull());
                break;

                case 5:
                System.out.println("Fila: ");
                f.printFila();
                break;

                default:
                System.out.println("Opção inválida. Tente novamente.");
                break;
            }
        } while(op != 6);
        
            sc.close();
    }
}
