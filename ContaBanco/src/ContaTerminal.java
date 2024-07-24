import java.util.Scanner;

public class ContaTerminal {

    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        //Solicitar e ler o numero da conta
        System.out.println("Por favor, digite o número da conta !");
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); //quebra de linha

        //solicitar e ler agencia
        System.out.println("Por favor, digite o número da Agencia !");
        String agencia = scanner.nextLine();
        
        //solicitar e ler nome do cliente
        System.out.println("Por favor, digite seu nome !");
        String nome = scanner.nextLine();

        //solicitar e ler saldo
        System.out.println("Por favor, digite seu saldo !");
        double saldo = scanner.nextDouble();

        //Exibir a menssagem
        System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numeroConta+
                            " e seu saldo "+saldo+" já está disponível para saque");

        

        scanner.close();
    }
}
