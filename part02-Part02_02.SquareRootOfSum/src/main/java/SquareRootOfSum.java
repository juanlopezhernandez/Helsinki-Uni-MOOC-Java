
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give 2 numbers:");
        int number1 = Integer.valueOf(scanner.nextLine());
        int number2 = Integer.valueOf(scanner.nextLine());
        int sum = (number1 + number2);
        double sqrt = Math.sqrt(sum);
        
        System.out.println("The addition of the 2 numbers is " + sum + ".\n"
            + "The square root of the 2 number is: " + sqrt + "." );
         

    }
}
