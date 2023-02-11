
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(Paths.get("data.txt"))) {
            while (scan.hasNextLine()){
                String linea = scan.nextLine();
                System.out.println(linea);
            }
        } catch (Exception e) {
            
        }
            
    }
}
