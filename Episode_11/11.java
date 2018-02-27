public class Java8Main {

    public static void main(String args[]) {
        int progress = 1;

        while (progress < 100) {
            System.out.println("Loading... " + progress + "%");
            progress += 1;
            if (progress == 100) {
                System.out.println("Finished loading: 100%");
                break;
            }
        }
    }

}
