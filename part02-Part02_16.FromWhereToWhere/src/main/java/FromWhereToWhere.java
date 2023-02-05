
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //set up the start which is one
        //int beginning = 0;
        //ask and take user number into variable input
        System.out.println("Where to?");        
        int input = Integer.valueOf(scanner.next());
        System.out.println("Where from?");
        int beginning = Integer.valueOf(scanner.next());
        for (int i=beginning; i <= input; i++){
            System.out.println(i);
        }   
    }
}
