import java.util.Scanner; // Importa biblioteca do scanner no java. / Imports the Scanner class from the java.util package

public class Main {
    public static void main(String[] args) {
        int Result = 0; // Define valor padrão. /  Sets default value.
        Scanner read = new Scanner(System.in); // Declara Scanner.
        System.out.println("Calculadora / Calculator: "); // Imprime na tela. / Prints on the screen.
        System.out.println("Digite seu número / Enter your number: ");
        int number = read.nextInt(); // Pede e recebe um número para a conta.
        System.out.println("Digite seu segundo número: / Enter your second number:");
        int SecondNumber = read.nextInt(); // O mesmo processo do anterior. / Same process as before.
        read.nextLine(); // Lê quebra de linha pendente./  Reads the pending newline.
        System.out.println("Digite seu operador matemático / Enter a mathematical operator: ");  
        String mathematicalOperator = read.nextLine(); // Recebe operador matemático. / Reads the mathematical operator
        
        boolean valid = true; // Define como valor padrão. // Sets as the default value.
        
        // Switch que permite ler diversos operadores matemáticos. // Switch statement to process various mathematical operators.
        switch (mathematicalOperator) { // Chama comando switch e váriavel a ser analisada. // Invokes the switch statement with the variable to evaluate.
            case "+":
                Result = number + SecondNumber;
                break; // Em caso de operador de adição, o resultado é definido como o primeiro número mais o segundo número. // In case of addition operator, the result is set to the first number plus the second number.
            case "-":
                Result = number - SecondNumber;
                break; // Mesmo processo. / Same process.
            case "*": // Mesmo processo / Same process 
                Result = number * SecondNumber;
                break; // Mesmo processo. / Same process
            case "/": 
                if (SecondNumber != 0) {
                    Result = number / SecondNumber; // Mesmo processo, porém trata uma excessão, se o número for diferente de zero; / Same process, but handles an exception if the number is not zero.
                } else {
                    System.out.println("Erro: divisão por zero / Error: division by zero.");
                    valid = false; 
                }
                break; // Se o segundo número for zero, define como inválido e encerra. //  If the second number is zero, set as invalid and exit.
            default:
                System.out.println("Operador inválido / Invalid operator.");
                valid = false; // Se o operador não for nenhum usado acima, define como falso. // If the operator doesn't match any of the above, mark as invalid.
        }

        if (valid = true) {
            System.out.println("Resultado / Result: " + Result); 
        } // Se passou por todas as condições e foi aprovado, imprime resultado na tela. // If all conditions are met and approved, display the result on the screen.

        read.close(); // Fechando Scanner / Close Scanner.
        }
        
        }

        
