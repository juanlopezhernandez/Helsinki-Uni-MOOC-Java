
import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // "scanner" is called and created above.
        //first print message to user   
        System.out.println("What's your name?");
        //scanner.nextLine(); is used to save the user input to the the 
        //String variable "message"
        String message = scanner.nextLine();
        //then print out the string literal "hi " with string variable (message)
        //by using the plus (+ operator) to join them together. 
        System.out.println("Hi " + message);
    
    }
}
