
import java.util.ArrayList;
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
    private Scanner scanner;
    private TodoList list;
    
    public UserInterface(TodoList list, Scanner scanner){
       this.scanner = scanner;
       this.list = list;
    }
    public void start(){
                 System.out.println("Command:");
        
        while (true){

        String command = scanner.next();   
            
            
            if (command.equals("stop")){
                break;
            }
            if (command.equals("add")){
                System.out.println("Task:");
                String task = scanner.nextLine();
                this.list.add(task);
                continue;               
            }
            if (command.equals("completed")){
                System.out.println("Which task was completed?");
                int taskIndex = scanner.nextInt();
                this.list.remove(taskIndex);
                System.out.println(list.listContent());
                continue;
            }
            if (command.equals("list")){                
                System.out.println(list.index()+": "+list.listContent());
            }
        }
                
    }
}
