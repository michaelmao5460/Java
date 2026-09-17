import java.util.Scanner;

public class SuperheroQuiz {
    public static void main(String[] args) {
        Scanner test = new Scanner(System.in);


        System.out.println("Can Superman fly? (Y/N): ");
        String superman = test.nextLine();

        if (superman.equalsIgnoreCase("Y")) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect. Superman can fly.");
        }

        System.out.println("Can Batman fly? (Y/N): ");
        String batman = test.nextLine();

        if (batman.equalsIgnoreCase("N")) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect. Batman cannot fly.");
        }
        
    }
}
