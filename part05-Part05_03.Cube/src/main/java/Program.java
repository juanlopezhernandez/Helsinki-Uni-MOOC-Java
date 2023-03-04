
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give me the length and "
                + "I'll give you the volume of a cube.");
        int input = Integer.valueOf(scanner.nextLine());
        
        Cube userCube = new Cube(input);
        System.out.println(userCube.volume());
        System.out.println(userCube);

        // Experiment with your program here
    }
}
