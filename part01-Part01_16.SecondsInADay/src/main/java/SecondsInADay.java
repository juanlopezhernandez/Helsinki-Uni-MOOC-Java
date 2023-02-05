
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("How many days would you like to convert to seconds?");
        int userDays = Integer.valueOf(scanner.nextLine());
        if (userDays==1){
            System.out.println("The number of seconds in " + userDays  + " day is: " + (86400 * userDays));
        } else {
        System.out.println( "The number of seconds in " + userDays  + " days is: " + (86400 * userDays) );
                }
    }
}
