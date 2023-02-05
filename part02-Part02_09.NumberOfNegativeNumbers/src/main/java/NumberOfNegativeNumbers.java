
import java.util.Scanner;

public class NumberOfNegativeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int negativeNumber= 0;
        while (true) {
            System.out.println("Give a number:");
            int inputNumber = Integer.valueOf(scanner.nextLine());
            if (inputNumber == 0) {
                break;
            }
            if (inputNumber < 0) {
                negativeNumber = negativeNumber + 1;
            }
        }
        System.out.println("Number of negative numbers: " + negativeNumber);
    }
}
