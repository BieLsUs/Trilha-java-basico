
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Valores para serem inseridos pelo usuário, para a criação da conta Bancária;
        System.out.println("Por favor, insira seu primeiro nome ");
        String nome = scanner.next();

        System.out.println("Agora, insira seu segundo nome ");
        String sobrenome = scanner.next();

        System.out.println("Agora insira o número de quatro dígitos da agência ");
        int numero = scanner.nextInt();

        // Sistema de decisão para imprimir a Agência e saldo através do numero inserido do usuário;
        if ( numero > 1024) {

            String agencia = "107-5";
            Double saldo = 344.87;
            String nomeCompleto = nome + " " + sobrenome;


            System.out.println("Olá " + nomeCompleto + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
            

        }
        if (numero < 1025) {
            
            String agencia = "065-2";
            Double saldo = 252.43;
            String nomeCompleto = nome + " " + sobrenome;

            System.out.println("Olá " + nomeCompleto + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        }
        
    }
}
