
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class
        Scanner scanner = new Scanner(System.in);
        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        
        while (true) {
            System.out.println("First name: ");
            String inputFirst = scanner.nextLine();
            if (inputFirst.isEmpty()){
                break;
            }
            System.out.println("Last name: ");
            String inputLast = scanner.nextLine();
            
            System.out.println("Identification number: ");
            String num = scanner.nextLine();
            
            infoCollection.add( new PersonalInformation(inputFirst, inputLast, num));
        }   
        
        for (PersonalInformation fullName : infoCollection){
        System.out.println(fullName.getFirstName()+" "+ fullName.getLastName());
        }    
    }
}
