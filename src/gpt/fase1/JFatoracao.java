package gpt.fase1;

import java.util.Scanner;

public class JFatoracao {
    public static void main(String[] args) {
        // ✅ Escreva uma função que recebe um número N e retorna seu fatorial.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Me passa um número: ");
        int numero = scanner.nextInt();

        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }


        System.out.println(fatorial);
    }
}
