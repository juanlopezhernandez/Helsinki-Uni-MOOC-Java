
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = 0;
        System.out.println("Choose a number that will be counted from 0.");
        int userInput = Integer.valueOf(scanner.nextLine());
        for (int i = start; i <= userInput; i++) {
            System.out.println(i);
           
        
        }
        System.out.println("The above number is the number you first inputted");
    }
}
