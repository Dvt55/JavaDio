import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        float SaldoInicial = 0;

        System.out.println("Por favor, digite o número da Agência !");
        String Agencia = sc.next();
        System.out.println("Usuario: ");
        int Numero = sc.nextInt();
        System.out.println("Nome de usuario: ");
        String NomeCliente = sc.next();
        
        System.out.print("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, " + "sua agência é " + Agencia + " conta " + Numero + " e seu saldo " + SaldoInicial + " já está disponível para saque");


    }
}
