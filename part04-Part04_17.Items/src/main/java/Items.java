
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {
        // implement here your program that uses the class Item
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();               
        
        while (true){
            System.out.println("Name: ");
            String input =scanner.nextLine();
            if(input.isEmpty()){
                break;
            }
            items.add(new Item(input));
        }
        for(Item nombres:items){
            System.out.println(nombres);
        }
        //name not given to "new" item but parameter is taken as the "reference
        System.out.println(items.get(1));

    }
}
