import java.util.Scanner;
public class SecretClub{
    public static void main(String[] args) {
        Scanner test = new Scanner(System.in);

        System.out.println("Enter your name:  ");
        String name = test.nextLine();
        
        System.out.println("Enter your age:  ");
        int age = test.nextInt();

        if (age >= 12) {
            System.out.println("Welcome to the Secret Club, " + name + "!");
        } else {
            System.out.println("Access Denied!");

        }

    }
}