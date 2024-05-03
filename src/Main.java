import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);

        Float saldoInicial = 600.00F;
        System.out.println("Por favor, digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Agora digite o número da agência: ");
        String agencia = sc.nextLine();
        System.out.println("Por fim, informe seu número de conta: ");
        int numero = sc.nextInt();

        ContaTerminal conta = new ContaTerminal(numero, agencia, nome, saldoInicial);
        System.out.println(conta.toString());
    }
}