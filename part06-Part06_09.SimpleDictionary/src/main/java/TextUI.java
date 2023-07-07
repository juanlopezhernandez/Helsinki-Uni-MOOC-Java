
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
            String word = scanned.nextLine();

            if (word.contains("end")) {
                System.out.println("Bye bye!");
                break;
            }
            if (word.contains("add")) {
                System.out.println("Word:");
                String i = scanned.nextLine();
                System.out.println("Transtalion:");
                String y = scanned.nextLine();
                this.objects.add(i, y);
                continue;
            }
            if (word.contains("search")) {
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
            if (word.contains(word)) {
                System.out.println("Unknown command");
            }

        }
    }
}
