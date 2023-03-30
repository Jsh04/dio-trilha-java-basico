import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);

        System.out.println("Por favor, digite o numero da conta: ");
        int numeroConta = sc.nextInt();

        System.out.println("Por favor, digite o numero da agência: ");
        String numeroAgencia = sc.next();

        System.out.println("Digite seu nome: ");
        String nomeUsuario = sc.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenomeUsuario = sc.next();

        System.out.println("Por favor, digite seu saldo: ");
        double saldoUsuario = sc.nextDouble();

        System.out.println(String.format(
                "Olá %s %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque",
                nomeUsuario, sobrenomeUsuario, numeroAgencia, numeroConta, saldoUsuario));
        sc.close();
    }
}
