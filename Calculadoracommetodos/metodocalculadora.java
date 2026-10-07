package Calculadoracommetodos;

import java.util.Scanner;

public class metodocalculadora {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          System.out.print("Primeiro número: ");
          double numero1 = scanner.nextDouble();

          int opcao = menu(scanner);

          System.out.print("Segundo número: ");
          double numero2 = scanner.nextDouble();

          double resultado = 0;

          switch (opcao) {
               
               case 1:
                    resultado = somar(numero1, numero2);
                    break;
               
               case 2:
                    resultado = subtrair(numero1, numero2);
                    break;

               case 3:
                    resultado = multiplicar(numero1, numero2);
                    break;

               case 4:
                    resultado = dividir(numero1, numero2, scanner);
                    break;

          }

          System.out.println("Resultado: " + resultado);

          scanner.close();
     }

     static int menu (Scanner scanner) {

          int opcao = 0;

            System.out.println("\n===== CALCULADORA =====");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");

            System.out.print("Selecione sua operação: ");
            opcao = scanner.nextInt();

            while (opcao < 1 || opcao > 4) {
                System.out.println("Opção inválida!");
                System.out.print("Selecione sua operação: ");
                opcao = scanner.nextInt();
            }

          return opcao;

     }

     static double somar (double numero1, double numero2) {
          return numero1 + numero2;
     }

     static double subtrair (double numero1, double numero2) {
          return numero1 - numero2;
     }

     static double multiplicar (double numero1, double numero2) {
          return  numero1 * numero2;
     }

     static double dividir (double numero1, double numero2, Scanner scanner) {
          while (numero2 == 0) {
               System.out.println("Não é possível dividir por Zero!");
               System.out.print("Digite outro número: ");
               numero2 = scanner.nextDouble();
          }

          return numero1 / numero2;
     }
}
