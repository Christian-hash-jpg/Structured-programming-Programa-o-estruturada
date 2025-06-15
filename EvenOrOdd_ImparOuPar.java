/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner; // Biblioteca do Scanner
public class Main
{
	public static void main(String[] args) {
	    Scanner Read = new Scanner(System.in); // Declara scanner
		System.out.println("Digite seu número / Enter your number: "); // Imprime na tela 
		int Number = Read.nextInt(); // Recebe o número
		if (Number %2 == 0) {
		    System.out.println("Seu número é par."); // Se o número dividido por dois for igual a zero então é par.
		}
		else {
		    System.out.println("Seu número é ímpar."); // Se não, é impar.
		}
	}
}
