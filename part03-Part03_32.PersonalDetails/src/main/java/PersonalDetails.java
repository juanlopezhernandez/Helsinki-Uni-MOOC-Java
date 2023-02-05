
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        String name = "";
        int ave = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()){
               break;
            } 
            String[] split = input.split(",");
            sum += Integer.valueOf(split[1]);
            ave++;
            
            if (name.length() < split[0].length()){
                name = split[0];
            }
        }
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + 1.0 * sum/ave);
    }
}
/*

sarahi sucks! <3
            

*/