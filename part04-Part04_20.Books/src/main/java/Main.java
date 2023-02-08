import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Book> bookInfo = new ArrayList<>();
        
        while (true){
            System.out.println("Title: ");
            String inputTitle = scan.nextLine();
            if (inputTitle.isEmpty()){
                break;
            }
            System.out.println("Pages: ");
            int inputPages = Integer.valueOf(scan.nextLine());
            
            System.out.println("Publication year: ");
            int inputYear = Integer.valueOf(scan.nextLine());
            
            bookInfo.add(new Book (inputTitle, inputPages, inputYear));            
        }
        System.out.println("What information will be printed? ");
        String toPrint = scan.nextLine();
        
        for (Book bookInstance : bookInfo){
            if (toPrint.equals("everything")){
                System.out.println(bookInstance);
            }
            if (toPrint.equals("name")){
                System.out.println(bookInstance.getTitle());
            }
        }
    }
}
