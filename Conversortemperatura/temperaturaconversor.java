package Conversortemperatura;

import java.util.Scanner;

public class temperaturaconversor {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          int opcao = menu(scanner);

          System.out.print("Digite a temperatura: ");
          double temperatura = scanner.nextDouble();

          double resultado = 0;
          String mensagem = "";

          switch (opcao) {
               case 1:
                    resultado = celsiusParaFahrenheit(temperatura);
                    mensagem = "Sua Temperatura convertida é de " + resultado + "° Fahrenheit.";
                    break;
               case 2:
                    resultado = fahrenheitParacelsius(temperatura);
                    mensagem = "Sua Temperatura convertida é de " + resultado + "° Celsius.";
                    break;
          }

          System.out.println(mensagem);
     }

     static int menu(Scanner scanner){
          int opcao = 0;

          System.out.println("1- Celsius Para Fahrenheit");
          System.out.println("2- Fahrenheit Para Celsius");
          System.out.print("Selecione uma opção: ");
          opcao = scanner.nextInt();

          while (opcao < 1 || opcao >2) {
               System.out.println("Opcao inválida!");
               System.out.print("Selecione uma opção: ");
               opcao = scanner.nextInt();
          }

          return opcao;
     }

     static double celsiusParaFahrenheit(double celsius){
          return ((celsius * 9)/5 ) + 32;
     }

     static double fahrenheitParacelsius(double fahrenheit){
          return ((fahrenheit - 32)*5 )/9;
     }
}
