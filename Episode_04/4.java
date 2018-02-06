import java.util.Scanner;

public class Java8 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        //Get Strings
        System.out.println("Please enter your name:");
        System.out.println(scanner.next());

        //Get Int
        System.out.println("Please enter your age:");
        System.out.println(scanner.nextInt());

        //Get Doubles
        System.out.println("Please enter your health:");
        System.out.println(scanner.nextDouble());
    }
}