
import java.util.ArrayList;
import java.util.Scanner;

 /* @author juanlopez
 */
public class UserInterface {
    private Scanner scanner;
    private TodoList list;
    
    public UserInterface(TodoList list, Scanner scanner){
       this.scanner = scanner;
       this.list = list;
    }
    public void start(){
                       
        while (true){
            System.out.println("Command:"); 
            String command = scanner.next();
                        
            if (stopCommand(command)){
                break;
            }
//            if (addCommand(command)){
//                
//            }
            if (command.equals("add")){
                System.out.println("Task:");
                //String task = scanner.nextLine();
                this.list.add(scanner.next());
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
                
                System.out.println(list.listContent());
                continue;
            }
        }                
    }
    
    public boolean stopCommand(String command){
            if (command.equals("stop")){
                return true;                
            }
            return false;
        }
//    public boolean addCommand (String command){
//        if (command.equals("add")){
//            System.out.println("Task:");
//            this.list.add(scanner.next());
//        }
    }
       
