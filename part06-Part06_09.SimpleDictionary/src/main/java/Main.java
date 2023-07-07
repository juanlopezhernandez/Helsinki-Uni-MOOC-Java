
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Try out how the different parts of the program work together
        // here
        Scanner scanner = new Scanner(System.in);
        SimpleDictionary dictionary = new SimpleDictionary();

        TextUI ui = new TextUI(scanner, dictionary);
        ui.start();
        //System.out.print(dictionary.translate("fat"));
        
//        SimpleDictionary oxnard = new SimpleDictionary();
//
//        oxnard.add("word", "palabra");
//        oxnard.add("eat", "comer");
//
//        System.out.println(oxnard.translate("word"));
//        System.out.println(oxnard.translate("eat"));
    }
}
