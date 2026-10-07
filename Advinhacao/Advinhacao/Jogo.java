import java.util.Random;
import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1; // Gera um número entre 1 e 100
        int tentativas = 0;
        boolean acertou = false;

        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar o número secreto entre 1 e 100.");

        while (!acertou) {
            System.out.print("Digite seu palpite: ");
            int palpite = scanner.nextInt();
            tentativas++;

            if (palpite < numeroSecreto) {
                System.out.println("O número secreto é maior. Tente novamente.");
            } else if (palpite > numeroSecreto) {
                System.out.println("O número secreto é menor. Tente novamente.");
            } else {
                acertou = true;
                System.out.println("Parabéns! Você acertou o número secreto em " + tentativas + " tentativas.");
            }
        }

        scanner.close();
    }
}