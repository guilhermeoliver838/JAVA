package SistemaDesconto;

import java.util.Scanner;

public class descontosistema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();

        int opcao = menu(scanner);

        double resultado = resultadoDesconto(opcao, preco);

        String mensagem = mensagemResultado(preco, resultado, opcao);

        System.out.println(mensagem);

     }

     static int menu(Scanner scanner){

        int opcao = 0;

        System.out.println("1- 10% de desconto");
        System.out.println("2- 20% de desconto");
        System.out.println("3- Sem desconto");

        System.out.print("Escolha um opção: ");
        opcao = scanner.nextInt();

        while (opcao < 1 || opcao > 3) {
            System.out.println("Opção Indisponível");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
        }

        return opcao;
     }

     static double descontoDez(double dezDesconto) {
        return dezDesconto - (dezDesconto * 0.1);
     }

     static double descontoVinte(double vintedesconto) {
        return vintedesconto - (vintedesconto * 0.2);
     }

     static double descontoSem(double semdesconto) {
        return semdesconto;
     }

     static double resultadoDesconto(int opcao, double preco) {

        double resultado = 0;

        switch (opcao) {
            case 1:
                resultado = descontoDez(preco);
                break;
            case 2:
                resultado = descontoVinte(preco);
                break;
            case 3:
                resultado = descontoSem(preco);
                break;
        }

        return resultado;
     }
    
    static String mensagemResultado (double preco, double resultadoDesconto, int opcao) {
        switch (opcao) {
            case 1:
                return "Preço Original: " + preco +
                        "\nDesconto: 10%" +
                        "\nPreço Final: " + resultadoDesconto;
            case 2:
                return "Preço Original: " + preco +
                        "\nDesconto: 20%" +
                        "\nPreço Final: " + resultadoDesconto;
            case 3:
                return "Preço Original: " + preco +
                        "\nDesconto: Sem Desconto" +
                        "\nPreço Final: " + resultadoDesconto;
            default: 
                return "Opção inválida!";
        }

    }
}
