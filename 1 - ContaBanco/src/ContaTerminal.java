import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        double saldo = 1800.74;
        Scanner info = new Scanner(System.in);
        System.out.println("Informe seu nome");
        String nome = info.nextLine();
       
        System.out.println("Informe o numero da sua agencia");
        String agencia = info.nextLine();
       
        System.out.println("Informe o numero da sua conta");
        String conta = info.nextLine();



        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+",e conta "+conta+" e seu saldo "+saldo+" já está disponível para saque");
        
        
    }
}
