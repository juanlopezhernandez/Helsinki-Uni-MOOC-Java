
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
public class UserInterface {

    private final Scanner scan;
    private final Container firstC;
    private final Container secondC;

    public UserInterface() {
        this.scan = new Scanner(System.in);
        this.firstC = new Container();
        this.secondC = new Container();
    }

    public void start() {

        while (true) {
            System.out.println("First: " + firstC);
            System.out.println("Second: " + secondC);
            //takes in the user input that would take the user input
            String input = scan.nextLine();
            //break has to be set right after t he input has been recieved to avoid
            //outOfBounds Exceptions, if the break is set after the SPLITing of input
            //it will expect a an array at [1].
            if (input.equals("quit")) {
                //System.out.println(firstC.toString());
                break;
            }
            
            //input split into 2 parts, a string and a int, separated by a space " "
            String[] parts = input.split(" ");
            
            if (parts.length < 2){
                continue;
            }            
            
            //parts at [0], is assigned to a string, and parts at [1] to an integer         
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            


            if (command.equals("add")) {
                this.firstC.add(amount);
            }

            if (command.equals("move")) {

                if (amount < 0) {
                    continue;
                }

                if (amount > firstC.contains() && ((firstC.contains() + secondC.contains()) <= 100)) {
                    // if(second)

                    secondC.add(firstC.contains());
                    //need to set firstC to 0;
                    firstC.setTo(0);
                } else {
                    secondC.add(amount);
                    //subtract amount from first container
                    firstC.remove(amount);
                }

                if (secondC.contains() > 100) {
                    secondC.setTo(100);

                }
            }

            if (command.equals("remove")) {

                if (amount > secondC.contains()) {
                    secondC.setTo(0);
                } else {
                    secondC.remove(amount);
                }
            }
        }
        System.out.println("First: " + firstC.toString());
        System.out.println("Second: " + secondC.toString());
    }
}
