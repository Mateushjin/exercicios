package gpt.fase1;

import java.util.Scanner;

public class IJogoDeAdivinhacao {
    public static void main(String[] args) {
        // ✅ Gere um número aleatório entre 1 e 100 e peça ao usuário para adivinhar.
        // ✅ Informe se o número digitado é maior ou menor até acertar.

        int num;
        int guess;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Me passa um número de 1 a 100: ");
        num = scanner.nextInt();

        while (num > 100 || num < 1) {
            System.out.print("Número Inválido, Por Favor Digita Um Número Entre 1 a 100: ");
            num = scanner.nextInt();
        }

        while (num != 0) {
            System.out.println("----------------------------");
            System.out.print("Me passa um número: ");
            guess = scanner.nextInt();

            if (guess > 100 || guess < 1){
                System.out.println("Número Inválido, Por Favor Digita Um Número Entre 1 a 100");
            } else if (guess > num) {
                System.out.println("Muito Alto, Tente Novamente");
            } else if (guess < num) {
                System.out.println("Muito Baixo, Tente Novamente");
            } else {
                System.out.println("Parabéns Você Acertou, O Número secreto é " + num);
                break;
            }
        }
    }
}


