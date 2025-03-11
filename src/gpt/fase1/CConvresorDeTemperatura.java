package gpt.fase1;

import java.util.Scanner;

public class CConvresorDeTemperatura {
    public static void main(String[] args) {
        // ✅ Peça ao usuário para digitar uma temperatura em graus Celsius e converta para Fahrenheit.
        //📌 Fórmula: F = (C * 9/5) + 32

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digita a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32;

        System.out.println("Temperature e Fahrenheit é: " + fahrenheit);
    }
}
