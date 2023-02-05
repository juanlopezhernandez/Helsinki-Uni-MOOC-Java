
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        divisibleByThreeInRange (2,10);
       // System.out.println(6%3);
    }
    public static void divisibleByThreeInRange(int beginning, int end){
        //int i = beginning;
        //int k = end;        
        for(int i= beginning; i<=end; i++){
            if (i%3==0){
                //an empty print statement prints out a space or creates a break
                System.out.println();
                System.out.println(i);
            }    
        // HINT:
        // You can find out if a number is even or odd easily using the modulo operator %
        // Try the following commands to see what they print
        /* System.out.println( 1%2 ); 
        
        System.out.println( 2%2 );
         System.out.println( 3%2 );
         System.out.println( 4%2 );
         System.out.println( 5%2 );
         System.out.println( 6%2 );
         System.out.println( 7%2 );
         int luku = 8;
         System.out.println( luku%2 );
        // So, by taking the modulo of a number and two you can find out if it is even or odd !*/
        }
    
    }
}
