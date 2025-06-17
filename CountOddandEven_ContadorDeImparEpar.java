import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int even = 0;  // Contador de números pares
        int odd = 0;   // Contador de números ímpares

        Scanner read = new Scanner(System.in);

        // Recebe a quantidade total de números
        System.out.println("Quantos números você deseja digitar? / How many numbers do you want to enter?");
        int totalNumbers = read.nextInt();

        // Laço que se repete para cada número digitado
        for (int i = 1; i <= totalNumbers; i++) {
            System.out.print("Digite o número - " + i + " / Enter number - " + i + ": ");
            int number = read.nextInt();

            if (number % 2 == 0) {
                even++; // Se for par
            } else {
                odd++;  // Se for ímpar
            }
        }

        // Mostra o resultado
        System.out.println("Números pares / Even numbers: " + even);
        System.out.println("Números ímpares / Odd numbers: " + odd);

        read.close(); 
    }
}
