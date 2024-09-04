import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da sua conta:");
        String numeroConta = scanner.nextLine();

        System.out.println("Por favor, digite o nome do titúlar da conta:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta:");
        double saldoConta = scanner.nextDouble();

        System.out.println("Olá "+nomeCliente+" obrigado por criar uma conta no nosso banco, sua agência é "+agencia+", conta "+numeroConta+" e seu saldo "+saldoConta+" já está disponível para saque.");

        scanner.close();

    }
}
