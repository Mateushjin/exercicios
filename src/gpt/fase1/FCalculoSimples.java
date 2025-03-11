package gpt.fase1;

import java.util.Scanner;

public class FCalculoSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digita o primeiro número: ");
        double n1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double n2 = scanner.nextDouble();

        System.out.println("Escolhe qual tipo de calculo quer fazer: ");
        System.out.println("1. Adição ( + )");
        System.out.println("2. Subtração ( - )");
        System.out.println("3. Multiplicação ( * )");
        System.out.println("4. Divisão ( / )");
        int escolha = scanner.nextInt();

        switch (escolha){
            case  1 -> System.out.println(n1 + n2);
            case  2 -> System.out.println(n1 - n2);
            case  3 -> System.out.println(n1 * n2);
            case  4 -> System.out.println(n1 / n2);
            default -> System.out.println("Opção Inválida");
        }
    }
}
