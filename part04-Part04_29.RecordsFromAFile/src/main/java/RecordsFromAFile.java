
import java.nio.file.Paths;
import java.util.Scanner;


public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        try (Scanner userFile = new Scanner(Paths.get(file))){
            while (userFile.hasNext()) {
                String fileContent = userFile.nextLine();
                //System.out.println(fileContent);line to test
                
                 if (fileContent.isEmpty()){
                    continue;
                } //if w/ continue goes before the manipulation of the
                  //program
                 
                String[] parts = fileContent.split(",");
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);
                
                if (age==1) {
                    System.out.println(name + ", age: " + age + " year");
                } else {
                System.out.println(name + ", age: " + age + " years");
                }
                              
            }  
            
        } catch (Exception e) {
            
        }
    }
}
