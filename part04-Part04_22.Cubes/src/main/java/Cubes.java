
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String inputS = scanner.nextLine();
            if (inputS.equals("end")){
                break;
            }
            int inputN = Integer.valueOf(inputS);
            System.out.println(inputN*inputN*inputN);
        }        
    }
}
