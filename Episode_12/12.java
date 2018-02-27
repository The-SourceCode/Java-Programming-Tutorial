import java.util.ArrayList;

public class Java8 {
    private static int counter = 0;

    public static void main(String[] args) {

        ArrayList<String> animals = new ArrayList<>();
        animals.add("cat");
        animals.add("dog");
        animals.add("lion");
        animals.add("seal");

        animals.forEach(animal -> {
            System.out.println(animal);
            System.out.println(counter);
            counter++;
        });
    }

}