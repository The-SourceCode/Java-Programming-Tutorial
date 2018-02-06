import java.util.Scanner;

public class Java8 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age:");
        int age = scanner.nextInt();
        System.out.println("Please enter your name:");
        String name = scanner.next();
        if (age < 18) {
            System.out.println(name + " is only " + age + ". Not old enough to enter.");
        }else{
            System.out.println(name + " is only " + age + ". Is an adult!");
        }

    }
}