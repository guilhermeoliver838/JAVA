package mediacommetodos;

import java.util.Scanner;

public class metodomedia {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          System.out.print("Nome do Aluno: ");
          String aluno = scanner.next();

          double nota1 = lerNota(scanner, "Primeira nota: ");

          double nota2 = lerNota(scanner, "Segunda nota: ");

          double nota3 = lerNota(scanner, "Terceira nota: ");

          int opcao = menu (scanner);

          double mediaAluno = media(nota1, nota2, nota3);

          String situacao = verificarSituacao(mediaAluno);

          resultado(aluno, mediaAluno, situacao);

          scanner.close();
     }

     static double lerNota(Scanner scanner, String mensagem) {

          double nota;

          while (true) {

               System.out.print(mensagem);
               nota = scanner.nextDouble();

               if (nota >= 0 && nota <= 10) {
               break;
               }

               System.out.println("Nota inválida! Digite uma nota entre 0 e 10.");
          }

          return nota;
     }

     static int menu (Scanner scanner) {

          int opcao = 0;

          System.out.println("1- Exibir Resultado");

          System.out.print("Selecione a opção: ");
          opcao = scanner.nextInt();

          while (opcao != 1) {
               System.out.println("Opção inválida!");
               System.out.print("Selecione a opção: ");
               opcao = scanner.nextInt();
          }

          return opcao;
     }

     static double media (double nota1, double nota2, double nota3) {
          double media = (nota1 + nota2 + nota3)/3;
          return (media);
     }

     static String verificarSituacao (double media) {

          if (media >= 7) {
               return "Aprovado";
          }
          else if(media >=5){
               return "Recuperação";
          }
          else {
               return "Reprovado";
          }
     }

     static void resultado (String aluno, double mediaAluno, String situacao)
     {
          System.out.println(aluno);
          System.out.println(mediaAluno);
          System.out.println(situacao);
     }
}
