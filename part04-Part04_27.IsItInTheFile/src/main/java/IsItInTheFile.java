
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;


public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        try (Scanner fileScan = new Scanner(Paths.get(file))) {
            while (fileScan.hasNextLine()){
                list.add(fileScan.nextLine());
               // String fileContent = fileScan.nextLine();
                
               } 
                System.out.println("Search for:");
                String searchedFor = scanner.nextLine();
                int i;
                
                for (i = 0;i <list.size();i++){
                    if(list.contains(searchedFor)){
                    System.out.println("Found!");
                    } else {
                        System.out.println("Not found.");
                }
                }  
 
        }   catch (Exception e) {
            System.out.println("Reading the file "+file+"failed");
        }
        
    }
}
