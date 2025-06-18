import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       
       double MediumNumber = 0;

        Scanner read = new Scanner(System.in);

        // Recebe a quantidade total de números
        
        System.out.println("Quantidade de números: / Number of numbers: ");
        double NumberOfNumbers = read.nextDouble();
        
        // Laço for que permite a conta 
        for (int i = 0; i <= NumberOfNumbers; i++) {
            System.out.println("Digite seu número: / Enter your number: ");
            double Number = read.nextDouble();
            MediumNumber += Number;
        }
        
        // Variavel declarada com oom o valor da média.
        MediumNumber = MediumNumber / NumberOfNumbers;
    System.out.println("A média dos números é / The average of numbers is: " + MediumNumber);

        read.close();
    }
}