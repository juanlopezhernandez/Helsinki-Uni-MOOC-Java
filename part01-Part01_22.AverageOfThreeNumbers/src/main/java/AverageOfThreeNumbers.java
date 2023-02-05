
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number: ");
        double firstNumber = Double.valueOf(scanner.nextLine());
        System.out.println("Give the second number: ");
        double secondNumber = Double.valueOf(scanner.nextLine());
        System.out.println("Give the third number: ");
        double thirdNumber = Double.valueOf(scanner.nextLine());
        System.out.println("The average is " + ((firstNumber+ secondNumber + thirdNumber)/3));
    }
}
