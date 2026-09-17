import java.util.Scanner;

public class ChoiceStory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("You are standing in front of a mysterious castle.");
        System.out.println("There are two doors:");
        System.out.println("1. Left Door");
        System.out.println("2. Right Door");
        System.out.print("Which door do you choose? ");

        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("\nYou open the Left Door...");
            System.out.println("You find a treasure room filled with gold!");
            System.out.println("ENDING: You become rich and famous!");
        } 
        else if (choice == 2) {
            System.out.println("\nYou open the Right Door...");
            System.out.println("A dragon is sleeping inside!");
            System.out.println("The dragon wakes up and chases you away.");
            System.out.println("ENDING: You escape the castle safely!");
        } 
        else {
            System.out.println("\nYou hesitate too long.");
            System.out.println("The castle doors disappear!");
            System.out.println("ENDING: You never discover what was inside.");
        }

        scanner.close();
    }
}
