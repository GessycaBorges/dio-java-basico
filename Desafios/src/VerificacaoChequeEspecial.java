import java.util.Scanner;

public class VerificacaoChequeEspecial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu saldo: ");
        double saldo = scanner.nextDouble();
        System.out.println("Digite o valor que deseja sacar: ");
        double saque = scanner.nextDouble();

        double limiteChequeEspecial = 500;

        if (saque <= saldo) {
            System.out.println("Transacao realizada com sucesso.");
        } else {
            double valorDisponivel = saldo + limiteChequeEspecial;
            if (saque <= valorDisponivel){
                System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
            } else {
                System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
            }
        }

        scanner.close();
    }
}