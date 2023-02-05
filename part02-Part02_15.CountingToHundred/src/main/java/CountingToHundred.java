
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int end = 100;
        int userInput = Integer.valueOf(scanner.nextLine());
        for (int i = userInput; i <= end;i++){
            System.out.println(i);
        }
        
    }
}
