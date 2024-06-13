import java.text.MessageFormat;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO:Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int numeroDaConta = 0;
        String numeroDaAgencia = "000-0";
        String nomeDoCliente = "";
        Double saldo = 0.0;
      
        //TODO:Exibir as mensagens para o nosso usuário
        //TODO:Obter pela scanner os valores digitados no terminal
        System.out.println("Por favor, digite o numero da conta !");
        numeroDaConta = scanner.nextInt();

        System.out.println("Por favor, digite o numero da Agência !");
        numeroDaAgencia = scanner.next();

        scanner.nextLine();
        
        System.out.println("Por favor, digite seu nome completo !");
        nomeDoCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo !");
        saldo = scanner.nextDouble();
        
        scanner.close();
        String mensagemDeBoasVindas = MessageFormat.format("Olá {0}, obrigado por criar uma conta em nosso banco, sua agência é {1}, conta {2} e seu saldo {3} já está disponivel para saque.", nomeDoCliente, numeroDaAgencia, numeroDaConta, saldo);
        //TODO:Exibir a mensagem conta criada
        System.out.println(mensagemDeBoasVindas);


    }
}
