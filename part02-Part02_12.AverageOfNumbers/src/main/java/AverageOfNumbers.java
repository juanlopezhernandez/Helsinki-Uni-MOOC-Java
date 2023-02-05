
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double sumOfNumbers = 0;
        double totalNumbers = 0;
        
        while (true) {
            System.out.println("Give a number: ");
            double input = Double.valueOf(scanner.nextLine());
            if (input == 0) {
                break;
            } 
            if(input != 0) {
                totalNumbers = totalNumbers + 1;
                sumOfNumbers = sumOfNumbers + input;
            }
        }
        double average = (sumOfNumbers/totalNumbers);
        System.out.println("Average of the numbers: " + average);
    }
}
