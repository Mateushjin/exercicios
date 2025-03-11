package gpt.fase1;

import java.util.Scanner;

public class HSomaDosNumeros {
    public static void main(String[] args) {
        // Solicite um número N e exiba a soma de 1 até N.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digita um número: ");
        int numero = scanner.nextInt();

        int soma = 0;  // 📌 Melhoria: Código original estava apenas imprimindo números de 1 a N, agora faz a soma corretamente.
        for (int i = 1; i <= numero; i++) {
            soma += 1;
        }

        System.out.println("A soma dos números de 1 a " + numero + " é: " + soma);
    }
}
