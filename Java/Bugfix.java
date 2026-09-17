import java.util.Scanner; 

public class Bugfix { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        
        System.out.println("Enter temperature:"); 
        int temp = scanner.nextInt(); 
        
        if (temp > 30) { 
            System.out.println("It is hot outside"); 
        } 
        
    } 
} 
