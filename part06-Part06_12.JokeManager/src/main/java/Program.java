
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);        
        JokeManager manager = new JokeManager();
        
        UserInterface ui = new UserInterface(manager,scanner);
        
        //
        manager.addJoke("Mejor futbolista? - Cristiano");
        manager.addJoke("Mejor equipo? - Real Madrid");
        manager.addJoke("Mejor artista? - Bad Bunny");
        manager.addJoke("Y el recibo? - Esta!");

       
        String randomJoke = manager.drawJoke();
        System.out.println("");
        System.out.println(randomJoke);
        //ui.start();
 manager.printJokes();
    }
}
