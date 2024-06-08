import java.util.Scanner;
import java.util.Locale;
import java.util.InputMismatchException;
import java.text.DecimalFormat;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double saldo = 0;
        boolean continuar = true;

        DecimalFormat df = new DecimalFormat("#0.0");

        while (continuar) {

            try{
                System.out.println("""
                Escolha a seguir a opção desejada:
                1 - Depositar
                2 - Sacar
                3 - Consultar Saldo
                0 - Encerrar
                """);

                int opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("Digite o valor a ser depositado: ");
                        double valorDeposito = scanner.nextDouble();
                        if (valorDeposito > 0){
                            saldo += valorDeposito;
                            System.out.println("Saldo atual: " + df.format(saldo));
                        } else {
                            System.out.println("Entrada inválida.");
                        }
                        break;
                    case 2:
                        System.out.println("Digite o valor a ser sacado: ");
                        double valorSaque = scanner.nextDouble();
                        if(valorSaque <= 0){
                            System.out.println("Entrada inválida.");
                        } else if (saldo < valorSaque) {
                            System.out.println("Saldo insuficiente");
                        } else {
                            saldo -= valorSaque;
                            System.out.println("Saldo atual: " + df.format(saldo));
                        }
                        break;
                    case 3:
                        System.out.println("Saldo atual: " + df.format(saldo));
                        break;
                    case 0:
                        System.out.println("Programa encerrado.");
                        continuar = false;
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            }catch(InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número válido.");
                scanner.next();
            }
        }
        scanner.close();
    }
}
