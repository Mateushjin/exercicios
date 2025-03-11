package gpt.fase1;

import java.util.Scanner;

public class BImc {
    public static void main(String[] args) {
        // Fórmula: IMC = peso / (altura * altura)

        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual é o seu peso(kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Qual a sua altura(m): ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("Seu IMC é: " + imc);
    }
}
