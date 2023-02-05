
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalSum = 0; 
        
        System.out.println("First number?");
        int start = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Last number?");
        int last = Integer.valueOf(scanner.nextLine());
        
        for (int i = start; i<=last; i++){
            totalSum += i;
        }
        System.out.println("The sum is: "+ totalSum);
    }
}
