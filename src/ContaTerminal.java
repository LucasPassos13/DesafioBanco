import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        ContaBanco conta1 = new ContaBanco();

        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor, digite número da conta;");
        conta1.numero = entrada.nextInt();

        System.out.println("Por favor, digite número da agencia;");
        conta1.agencia = entrada.next();

        System.out.println("Por favor, digite o nome do titular da conta");
        conta1.nomeCliente = entrada.next();

        System.out.println("Por favor, digite o valor do saldo");
        conta1.saldo = entrada.nextDouble();

        System.out.println("Olá " + conta1.nomeCliente + ", obrigado por criar uma conta em nosso banco," +
                " sua agência é "+ conta1.agencia + ", conta " + conta1.numero +
                " e seu saldo " + conta1.saldo + " já está disponível para saque.");

    }
}