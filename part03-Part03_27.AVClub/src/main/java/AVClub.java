
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
     
        while (true){
        String input = scanner.nextLine();
        if (input.isEmpty()){
            break;
        }
        String[] splitWords = input.split(" ");
        
        for (String p : splitWords){
        if (p.contains("av")){
            System.out.println(p);
        }
        }
        }
    }
}
