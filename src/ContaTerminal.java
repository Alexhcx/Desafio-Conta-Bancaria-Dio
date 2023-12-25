import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, digite o número da conta: ");
        int conta = sc.nextInt();
        sc.nextLine();

        System.out.println("Agora, digite o número da agencia: ");
        String agencia = sc.nextLine();

        System.out.println("Digite seu nome: ");
        String nomeCliente = sc.nextLine().toUpperCase();

        System.out.println("Saldo: ");
        double saldo = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponivel para saque.\n", nomeCliente, agencia, conta, saldo);

        sc.close();
    }
}
