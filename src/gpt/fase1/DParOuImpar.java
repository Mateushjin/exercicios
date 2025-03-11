package gpt.fase1;

import java.util.Scanner;

public class DParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digita um número: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0 ){
            System.out.println("O número que você digitou é PAR");
        }else {
            System.out.println("O núero que você digitou é IMPAR");
        }
    }
}
