
import java.util.Arrays;
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //this is the number that is going to be multipliyed by (x*factorialMath)
        //it has to start with a 1 instead of 0 because in multiplication,
        //multiplying by 0 is always 0
        int factorialMath = 1;
        //asking the user to input a number; its the "end" number    
        System.out.println("Give a number: ");
        int inputNumber = Integer.valueOf(scanner.nextLine());
       // int i is set to 1 because that where the calculation begins
       // i <= inputNumber because that is where the loop stops
       //i++ is adding 1 to int i every time
        for (int i = 1; i<=inputNumber; i++) {           
            factorialMath *= i;
         //int answer = factorialMath * i;
        }
        System.out.println("Factorial: " + factorialMath );

    
    }
}
