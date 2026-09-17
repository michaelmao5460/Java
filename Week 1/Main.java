import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        
        Scanner testinput = new Scanner(System.in);

        /* 
        System.out.println("What's your name:  ");
        String name = testinput.next();

        System.out.println("What's your age:  ");
        int age = testinput.nextInt();

        System.out.println("What's your favorite book:  ");
        String favoriteBook = testinput.next();
        
        System.out.println("What's your weight:  ");
        double weight = testinput.nextDouble();
        
        
        System.out.println(name + " is " + age + " years old, weighs " + weight + " lbs and their favorite book is " + favoriteBook + ".");
        */

        System.out.println("Enter a number:  ");
        int number = testinput.nextInt();
    

        if (number >0){
            System.out.println("The number is positive.");
        }else{
            if (number < 0 ){
            System.out.println("The number is negative.");
            }else{
                System.out.println("The number is zero.");
            }
        }
    }
}