
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true){
        String text = scanner.nextLine();
        if (text.isEmpty()){
             break;
        }
                      
        String[] pieces = text.split(" ");
            for (int i = 0; i < pieces.length; i++){
                System.out.println(pieces[i]);
            }
        } 
    }
}
/*
 System.out.println(pieces[0]);
        System.out.println(pieces[1]);
        System.out.println(pieces[2]);
        System.out.println(pieces[3]);

  System.out.println();

          
*/