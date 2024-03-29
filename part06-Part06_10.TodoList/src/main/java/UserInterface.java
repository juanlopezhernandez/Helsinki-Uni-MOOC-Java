
import java.util.ArrayList;
import java.util.Scanner;

/* @author juanlopez
 */
public class UserInterface {

    private Scanner scanner;
    private TodoList list;

    public UserInterface(TodoList list, Scanner scanner) {
        this.scanner = scanner;
        this.list = list;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            String command = scanner.nextLine();

            if (stopCommand(command)) {
                break;
            }
            if (command.equals("add")) {
                addCommand();
                //continue;
            }
            if (command.equals("list")) {
                list.print();
                //continue;
            }
            if (command.equals("remove")) {
                removeCommand();
                //continue;
            }
        }
    }

    public boolean stopCommand(String command) {
        if (command.equals("stop")) {
            return true;
        }
        return false;
    }

    public void addCommand() {
        System.out.println("To add:");
        String task = scanner.nextLine();
        this.list.add(task);
    }

    public void removeCommand() {
        System.out.println("Which one is to be removed?");
        int taskIndex = scanner.nextInt();
        scanner.nextLine();
        this.list.remove(taskIndex);
    }

}
