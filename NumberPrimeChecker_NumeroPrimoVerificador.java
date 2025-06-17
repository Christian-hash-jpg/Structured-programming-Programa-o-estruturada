/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Digite um número inteiro / Enter an integer number: ");
        int number = read.nextInt(); // Recebe do usuários o número 

        boolean isPrime = true; // Inicia variável com valor padrão

        if (number <= 1) {
            isPrime = false; // Condição, todo número menor que um ou um não é primo 
        } else {
            // Verifica se o número é divisível por algum valor além de 1 e ele mesmo
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("O número é primo / The number is prime.");
        } else {
            System.out.println("O número não é primo / The number is not prime.");
        }

        read.close();
    }
}

