package Caixaeletronico;
import java.util.Scanner;

public class Eletronicocaixa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = 1000;
        int operacao = 0;

        while (operacao != 4) {

            System.out.println("\n===== CAIXA ELETRÔNICO =====");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Sair");

            System.out.print("Selecione sua operação: ");
            operacao = scanner.nextInt();

            while (operacao < 1 || operacao > 4) {
                System.out.println("Opção inválida!");
                System.out.print("Selecione sua operação: ");
                operacao = scanner.nextInt();
            }
        

            switch (operacao) {

                case 1:
                    System.out.println("Seu Saldo é: " + saldo);
                    break;
                case 2:
                    System.out.print("Digite o valor do seu depósito: ");
                    double deposito = scanner.nextDouble();

                    if (deposito <= 0) {
                        System.out.println("Valor de depósito invalido!");
                    }
                    else {
                        saldo = saldo + deposito;
                        System.out.println("Seu saldo atual é de: " + saldo);
                    }
                    break;
                case 3:
                    System.out.print("Digite o valor do seu saque: ");
                    double saque = scanner.nextDouble();

                    if (saque <= 0) {
                        System.out.println("Valor de saque inválido!");
                    }
                    else if (saque > saldo) {
                        System.out.println("Saldo indisponivel!");
                    }
                    else {
                        saldo = saldo - saque;
                        System.out.println("Seu saldo atual é de: " + saldo);
                    }
                    break;
                case 4:
                    System.out.println("Obrigado por utilizar o caixa eletrônico!");
                    break;
        
                default:
                    break;
            }
        }
        scanner.close();
    }
}

