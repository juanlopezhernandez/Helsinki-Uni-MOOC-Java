
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int first = 0;
        int second = 5;
                


        while (true) {
            System.out.println("First: " + first + "/100");            
            System.out.println("Second: " + second + "/100");
            //takes in the user input that would take the user input
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }            
            //input split into 2 parts, a string and a int, separated by a space " "
            String[] parts = input.split(" ");
            //parts at [0], is assigned to a string, and parts at [1] to an integer         
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
                        
            if (command.equals("add")){
                if((amount + first)<=100){
                    first += amount;   
                } else {
                    first = 100;
                }
            }
                


        }
        

        
    }

}
