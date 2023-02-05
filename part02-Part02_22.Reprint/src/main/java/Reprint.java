
import java.util.Scanner;

public class Reprint {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // ask the user for how many times should the text be printed
        // then call the printText-method multiple times with a while-loop
        System.out.println("How many times?");
        int times = Integer.valueOf(scanner.nextLine());
        int i = 0;
        while (i<times) {
            printText(); 
            i++;            
        }
        for (int r = 0; r <times; r++){
            
            System.out.println(printText());
        }
    }    
    // Don't change the next line that defines the method!
    // (We aren't giving a method a parameter yet)
    public static String printText() {
        // write some code here
        
        return "In a hole in the ground there lived a method" ;
    }
}
