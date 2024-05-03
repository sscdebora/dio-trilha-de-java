import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Entre com o numero da conta: ");
        int numeroAgencia = scanner.nextInt();
        

        System.out.println("Entre com o numero da agÊncia: ");
        String numeroConta = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Entre com o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Entre com o saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá, " + nomeCliente + "Sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();






    }
}