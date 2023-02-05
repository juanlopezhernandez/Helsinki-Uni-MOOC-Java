
import java.util.Scanner;

public class BooleanInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // write your program here
        System.out.println("Write something:");
        boolean value = Boolean.valueOf(scanner.nextLine());
        System.out.println("True or false? " + value);
        
        /*if(value == false){
            System.out.println("Write \"true\" or this will never stop!");
            value = Boolean.valueOf(scanner.nextLine());
        }else{
            System.out.println("Good job you wrote " + value);
        }*/
    }
}
