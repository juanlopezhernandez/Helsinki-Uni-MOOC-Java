
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.isEmpty()){
                break;
            }
            String[] split = input.split(" ");
            int end = split.length;
            
            System.out.println(split[end-1]);
        }

    }
}
