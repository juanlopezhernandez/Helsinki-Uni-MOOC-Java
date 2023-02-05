
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        
       
        int sum = 0;
        int userInputNum = 0;
        int even = 0;
        int odd = 0;
           
        System.out.println("Give numbers:");
        while (true){
            int userNum = Integer.valueOf(scanner.nextLine());  
            if (userNum== -1){
                break;
            }
            if (userNum != -1){
                sum += userNum;
                userInputNum++;
            } 
            int modulo = (userNum % 2);
            if (modulo == 0){
                even++;
            } else {
                odd++;
            }
        }
        double average= (1.0 * sum/userInputNum); 
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + userInputNum);
        System.out.println("Average: " + average);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

        //System.out.println("Average: " + (1.0 * sum/userInputNum));
    }
}
