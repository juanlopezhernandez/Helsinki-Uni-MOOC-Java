
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        while (true) {            
            String input = scanner.nextLine();           
            if (input.isEmpty()){
                break;
            }
                        
            String[] split = input.split(",");
            
       if (Integer.valueOf(split[1]) > age){
                age = Integer.valueOf(split[1]);
            }             
        }       
        System.out.println(age);
    }
}
/*        else {
                age += Integer.valueOf(split[3]);
   }
 // age = Integer.valueOf(split[1]);


*/