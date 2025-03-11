package gpt.fase1;

import java.util.Scanner;

public class GTabuada {
    public static void main(String[] args) {
        // ✅ Peça ao usuário um número e exiba a tabuada de 1 a 10 desse número.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digita um número: ");
        int numero = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
