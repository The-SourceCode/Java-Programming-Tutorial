public class Java8 {

    public static void main(String[] args) {
        switch (returnAnimal()) {
            case "cat":
                System.out.println(returnAnimal() + " are sneaky!");
                break;
            case "elephant":
                System.out.println(returnAnimal() + " are large!");
                break;
            case "dog":
                System.out.println(returnAnimal() + " are mans best friend!");
                break;
            default:
                System.out.println(returnAnimal() + " is not in our cases.");
        }
    }


    private static String returnAnimal() {

        return "otter";
    }

}