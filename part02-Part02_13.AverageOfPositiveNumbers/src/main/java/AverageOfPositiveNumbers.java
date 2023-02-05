
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double positive = 0;
        double totalNumbers = 0;
        while(true) {
            System.out.println("Input Numbers: ");
            double input = Double.valueOf(scanner.nextLine());
            if (input == 0) {
                break;
            } 
            if ( input >= 0) {
                positive = positive + input;
                totalNumbers = totalNumbers + 1;
            }
        }
        double average = positive/totalNumbers;
        if (positive == 0) {
            System.out.println("Cannot calculate the average");
        } else {        
            System.out.println(average); 
        }
    }
}
