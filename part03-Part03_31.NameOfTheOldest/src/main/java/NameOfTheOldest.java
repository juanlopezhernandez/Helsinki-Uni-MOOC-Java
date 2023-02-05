
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        String name = "";
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()){
                break;
            }
            String[] split = input.split(",");
            if (Integer.valueOf(split[1]) > age){
                age = (Integer.valueOf(split[1]));
               name = split[0];
            }
            
        }
        System.out.println(name);

    }
}
