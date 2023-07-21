
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author juanlopez
 */
public class TextUI {

    private Scanner scanned;
    private SimpleDictionary objects;

    public TextUI(Scanner scan, SimpleDictionary object) {
        this.scanned = scan;
        this.objects = object;
    }
 
    public void start() {
        while (true) {
            System.out.println("Command:");
            String userWord = scanned.nextLine();

            if (end(userWord)) {
                System.out.println("Bye bye!");
                break;
            }
            if (userWord.contains("add")) {
                System.out.print("Word: ");
                String word = scanned.nextLine();
                System.out.print("Transtalion: ");
                String translation = scanned.nextLine();
                this.objects.add(word, translation);
                continue;
            }

            if (userWord.contains("search")) {
                //i think there needs to be another if statement here
                System.out.println("To be translated:");
                String x = scanned.nextLine();
                if (objects.translate(x) == null) {
                    System.out.println("Word " + x + " was not found");
                } else {
                    System.out.println("Translation: " + objects.translate(x));
                    continue;
                }
            }
            if (userWord.contains(userWord)) {
                System.out.println("Unknown command");
            }
        }
    }

    public boolean end(String palabra) {
        if (palabra.equals("end")) {
            return true;
        }
        return false;
    }

   

}
