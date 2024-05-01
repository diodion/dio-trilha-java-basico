import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        try {
            System.out.println("Qual é o seu nome?");
            String nomeCliente = scanner.nextLine(); // Using nextLine() to handle spaces in names

            System.out.println("Digite o número da agência: ");
            String agencia = scanner.nextLine();

            System.out.println("Digite o número da sua conta: ");
            int numero = scanner.nextInt();

            System.out.println("Digite o seu saldo inicial:");
            double saldo = scanner.nextDouble();

            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
        } catch (Exception e) {
            System.out.println("Erro ao ler entrada!");
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
