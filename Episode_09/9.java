import java.util.Scanner;

public class Java8 {
    public static void main(String[] args) {
        calculator();
    }

    private static void calculator() {
        System.out.println("Welcome to your basic calculator.");
        System.out.println("Please input your first number to get started.");
        Scanner scanner = new Scanner(System.in);

        double num1, num2, answer = 0;

        num1 = scanner.nextDouble();

        System.out.println("Please enter a math operator. (*, -, +, /, or %)");
        String operator = scanner.next();
        if (operator.equalsIgnoreCase("+")
                || operator.equalsIgnoreCase("-")
                || operator.equalsIgnoreCase("/")
                || operator.equalsIgnoreCase("*")
                || operator.equalsIgnoreCase("%")) {

            System.out.println("You have chosen to " + operator + " your numbers.");
            System.out.println("Please enter your second number.");
            num2 = scanner.nextDouble();

            if(operator.equalsIgnoreCase("+")){
                answer = num1 + num2;
            }else if(operator.equalsIgnoreCase("-")){
                answer = num1 - num2;
            }else if(operator.equalsIgnoreCase("/")){
                answer = num1 / num2;
            }else if(operator.equalsIgnoreCase("*")){
                answer = num1 * num2;
            }else if(operator.equalsIgnoreCase("%")){
                answer = num1 % num2;
            }

            System.out.print("Your answer is: " + answer);

        } else {
            System.out.println("ERROR: Please enter a valid operator.");
            System.out.println("ERROR: Starting Program over.\n");
            calculator();
        }
    }
}