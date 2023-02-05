
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        //while (true) {
            //int input = Integer.valueOf(scanner.nextLine());
            //if (input == -1) {
             //   break;
            //}

            list.add(3); //0
            list.add(7); //1
            list.add(10); //2
            list.add(1); //3
        //}
        //set int big to the first number in the list array
        int big = list.get(0);
        //      i=0; if 0 is less than the size of the list (4)
        // int 0 and list size make the program run from the first number to the last
        for(int i = 0; i < list.size(); i++) {
        //int number = list position i (0) or first number
        int number = list.get(i);
        //if big (first number) is less than number(first number)
            if (big < number) {
             // then big = number;   
            big = number;
            }
        }
        
        System.out.println(big);
        // implement finding the greatest number in the list here
    }
}
