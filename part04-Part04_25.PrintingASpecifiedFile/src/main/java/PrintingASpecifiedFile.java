
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should be printed? ");
        String fileName = scanner.nextLine();
        
        try(Scanner fileScanner = new Scanner(Paths.get(fileName))){
            while (fileScanner.hasNextLine()){
                String fileContent = fileScanner.nextLine();
                System.out.println(fileContent);
            }
        } catch (Exception e){
            //System.out.println(e + "does not exist.");
        }

    }
}
