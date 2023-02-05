
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("What number do you want the square root of? ");
        int number = Integer.valueOf(scanner.nextLine());
        int squared = (number * number);
        System.out.println("The square root of " + number + " is: " + squared );

    }
}
