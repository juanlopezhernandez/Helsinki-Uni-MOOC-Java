
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOf {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        } 
          /*  list.add(5);
            list.add(7);
            list.add(9);
            list.add(5);
            list.add(11);*/
        
        System.out.println("Search for?");
        int lookFor = Integer.valueOf(scanner.nextLine());
        
        for(int i = 0; i < list.size(); i++) {
        if (lookFor == list.get(i)) {
            System.out.println(lookFor + " is at index " + i);
        }
    }

        // implement here finding the indices of a number
    }
}
