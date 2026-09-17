import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        if ("racecar".charAt(0) == "racecar".charAt(6)) {
            if ("racecar".charAt(1) == "racecar".charAt(5)) {
                if ("racecar".charAt(2) == "racecar".charAt(4)) {
                    System.out.println("Palindrome");
                } else {
                    System.out.println("Not a palindrome");
                }
            } else {
                System.out.println("Not a palindrome");
            }
        } else {
            System.out.println("Not a palindrome");
        }
    }
}


/*
        Scanner password = new Scanner(System.in);
        System.out.println("Enter your password:  ");
        String passwordInput = password.nextLine();
        System.out.println("Enter your username: ");
        String usernameInput = password.nextLine();

        if (passwordInput.length() <8) {
            System.out.println("Not valid");
        } else {
            if (usernameInput.length() <8) {
                System.out.println("Not valid");
            } else {
                System.out.println("Valid");
*/

/*
        String name = "Michael";
        String name_upper = name.toUpperCase();
        String name2 = "MICHAEL";
        if (name.equalsIgnoreCase(name2)) {
            System.out.println("Same");
            System.out.println(name_upper);
        } else {
            System.out.println("Different");
        }
        System.out.println(name.length());
        System.out.println(name.contains("hae"));
        System.out.println(name.charAt(3));
*/