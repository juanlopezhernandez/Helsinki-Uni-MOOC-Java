
import java.util.Scanner;

public class Message {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message:");
        // write program here
        /*"message" is the name of a variable of the type String, "message"
        is then assigned the value "scanner.nextLine()" which stores 
        what the user typed and assigns it the variable "message"*/
        String message = scanner.nextLine();
        //"message" which is the saved user input is then printed
        System.out.println(message);
    }
}
