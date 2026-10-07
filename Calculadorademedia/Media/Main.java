import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nota 1: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Nota 2: ");
        double nota2 = scanner.nextDouble();
        System.out.print("Nota 3: ");
        double nota3 = scanner.nextDouble();
        System.out.print("Nota 4: ");
        double nota4 = scanner.nextDouble();
        System.out.print("Nota 5: ");
        double nota5 = scanner.nextDouble();
        double media = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;
        if (media >= 6) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        } 

        System.out.println("Média: " + media);

        scanner.close();
    }
}