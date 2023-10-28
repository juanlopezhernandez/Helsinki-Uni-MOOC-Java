
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Container contenedor = new Container();
        UserInterface ui = new UserInterface();
        ui.start();
        
        contenedor.add(50);
        //contenedor.add(-5);
        //contenedor.remove (-60);
        System.out.println(contenedor);
        //System.out.println(contenedor.contains());


//        while (true) {
//            System.out.print("> ");
//
//            String input = scan.nextLine();
//            if (input.equals("quit")) {
//                break;
//            }}

        
    }

}
