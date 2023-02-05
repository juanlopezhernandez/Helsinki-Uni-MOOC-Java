
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalSum = 0;
        
        System.out.println("Last number?");
        int lastNumber = Integer.valueOf(scanner.next());
        for (int i = 0; i <=lastNumber; i++ ) {
            totalSum += i;
        }
        System.out.println(totalSum);

    }
}
