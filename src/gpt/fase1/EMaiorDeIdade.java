package gpt.fase1;

import java.util.Scanner;

public class EMaiorDeIdade {
    public static void main(String[] args) {
            // ✅ Solicite a idade do usuário e informe se ele é maior ou menor de idade.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digita sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 18){
            System.out.println("Você é maior de idade");
        }else {
            System.out.println("Você é menor de idade");
        }

    }
}
