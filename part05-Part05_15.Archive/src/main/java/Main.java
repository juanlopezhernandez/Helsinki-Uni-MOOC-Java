
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList <Archive> itemList = new ArrayList<>();
        while(true) {
            System.out.println("Identifier? (empty will stop)");
            String number = scanner.nextLine();
            
            if (number.isEmpty()){
                break;                
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            
            if (name.isEmpty()){
                break;
            }
            
        Archive item = new Archive(number, name);
        
        if (!(itemList.contains(item))){
            itemList.add(item);
        } 
            
        }
        System.out.println("==Items==");
        for (int i = 0; i <itemList.size(); i++){
        System.out.println(itemList.get(i));
        }
    }
}
