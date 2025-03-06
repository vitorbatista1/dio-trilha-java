import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();


        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a agência: ");
        String agenciaConta = scanner.nextLine();

        float saldo = 1000000f;


        scanner.close();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agencia e " + agenciaConta + ", conta " + numeroConta + " e seu saldo " + saldo + " ja esta disponivel para saque.");
    }
}
