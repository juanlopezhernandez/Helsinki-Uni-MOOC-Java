
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
    private JokeManager manager;
    private Scanner scanner;
    public UserInterface (JokeManager manager, Scanner scanner){
        this.manager = manager;
        this.scanner = scanner;
    }
    public void start(){
        while (true){
            System.out.println("Commands:");
            System.out.println("1-add a joke");
            System.out.println("2-draw a joke");
            System.out.println("3-list jokes");
            System.out.println("X-stop");
            String commandIn = scanner.nextLine();
            
            if (commandIn.equals("X")){
                break;
            }
            if (commandIn.equals("1")){
                System.out.println("Write the joke to be added:");
                String jokeAdded = scanner.nextLine();
                manager.addJoke(jokeAdded);
            }
            
            if (commandIn.equals("2")){
                manager.drawJoke();
                
            }
            
            if (commandIn.equals("3")){
                manager.printJokes();
            }            
        }
    
    }
}
