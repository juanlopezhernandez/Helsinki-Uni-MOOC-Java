import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        
        while (true) {
            System.out.println("Name: ");
            String show = scanner.nextLine();
            if (show.isEmpty()){
                break;
            }
            
            System.out.println("Duration: ");
            int tiempo = Integer.valueOf(scanner.nextLine());
            
            programs.add( new TelevisionProgram(show,tiempo));
        }
        
        System.out.println("Program's maximum duration? ");
        int maxTime = Integer.valueOf(scanner.nextLine());
        
        for (TelevisionProgram length : programs){
            //remember: if (true) {run};
            if (maxTime >= length.getDuration()) {
            System.out.println(length);
            }   
        }
    }
}
