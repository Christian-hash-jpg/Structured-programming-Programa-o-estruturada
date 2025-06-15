
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in); // Declara Scanner.
		System.out.println("Tabuada / Multiplication Table \nD.igite seu número: / Enter your number: ");
		int Number = read.nextInt(); // Lê o número do usuário 

		for (int i = 0; i <= 10; i++) { // Laço que permite a tabuada, enquanto a variável i for menor que 10 ele executa as ações abaixo.
		 int Result = Number * i; // Define resultado a cada repetição como o número vezes a variavel i, que aumenta de valor a cada repetição.
			System.out.println(Number + " * " + i + " = " + Result); // Imprime na tela o resultado
		} 

		read.close(); // Fecha o scanner.
	}
}
