package projetoIncremental;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        CartaoDeCredito c = new CartaoDeCredito(123456, "Gabriel", "06898279548");

        c.setLimite(100);
        Scanner sc = new Scanner(System.in);

        int opcao = 1;

        do {
            System.out.println("1 - Consultar Limite");
            System.out.println("2 - Consultar Fatura");
            System.out.println("3 - Realizar compra");
            System.out.println("0 - Sair");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Limite atual: " + c.consultarLimite());
                    break;
                case 2:
                    System.out.println("Total da fatura: " + c.consultarTotalFatura());
                    break;
                case 3:
                    System.out.println("Digite o valor da compra:");
                    double valor = sc.nextDouble();
                    c.realizarCompra(valor, true);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        } while (opcao != 0);

        sc.close(); // Fechando o Scanner
    }
}
