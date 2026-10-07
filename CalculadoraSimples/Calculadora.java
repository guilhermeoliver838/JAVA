import java.util.Scanner;

public class Calculadora {
     public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
        
          System.out.print("Insira um número: ");
          double numero = scanner.nextDouble();

          System.out.println("1- Soma");
          System.out.println("2- Subtração");
          System.out.println("3- Divisão");
          System.out.println("4- Multiplicação");

          System.out.print("Escolha uma operação: ");
          int opcao = scanner.nextInt();

          while (opcao < 1 || opcao > 4) {
                    System.out.println("Opção invalida!");
                    System.out.print("Escolha uma operação: ");
                    opcao = scanner.nextInt();
          }

          System.out.print("Insira o segundo número: ");
          double numero2 = scanner.nextDouble();

          switch (opcao) {
               case 1:
                    double resultado = (numero + numero2);
                    System.out.println("Resultado: " + resultado);
                    break;
               case 2:
                    double resultado2 = (numero - numero2);
                    System.out.println("Resultado: " + resultado2);
                    break;

               case 3:
                    while (true) {
                         if (numero2 == 0) {
                              System.out.println("Não é permitido divisão por zero!");
                              System.out.print("Insira outro número: ");
                              numero2 = scanner.nextDouble();
                         }
                         else {
                              break;
                         }    
                    
                    }
                    double resultado3 = (numero / numero2);
                         System.out.println("Resultado: " + resultado3);
                    break;

               case 4:
                    double resultado4 = (numero * numero2);
                    System.out.println("Resultado: " + resultado4);
                    break;
               default:
                    System.out.println("Opção invalida!");
                    break;
          }
          scanner.close();
     }
}
