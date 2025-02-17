import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       //TODO: Conhecer e importar a classe scenner

       Scanner scanner= new Scanner(System.in).useLocale(Locale.US);

       System.out.println("Por favor, digite seu nome!");
       String nome_cliente = scanner.nextLine();

       System.out.println("Por favor, digite o número da agencia!");
       String agencia = scanner.next();

       System.out.println("Por favor, digite o numero da conta!");
       int numero_conta = scanner.nextInt();

       System.out.println("Por favor, digite o saldo");
       float saldo = scanner.nextFloat();

       //Exibir as mensagem para o nosso usuário
       System.out.println("Olá ,"+ nome_cliente);
       System.out.println("Sua agencia é:"+ agencia);
       System.out.println("Sua conta é:"+ numero_conta);
       System.out.println("Seu saldo é:" + saldo);

       
       //Obter pela scanner os valores digitados no terminal
       System.out.println("Olá, " + nome_cliente + ", obrigada por criar uma conta em nosso banco, sua agência é " + agencia + ", conta: " + numero_conta + " e seu saldo é " + saldo);
       
       
       scanner.close();
       //Exibir a mensagem da conta criada

       
    }
}
