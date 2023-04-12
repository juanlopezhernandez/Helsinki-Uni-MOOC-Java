
public class Main {

    public static void main(String[] args) {
        // test your program here!
        SimpleDate person1 = new SimpleDate(30, 12, 1992);
        
        System.out.println(person1);
        
        person1.advance(3);
        System.out.println(person1);
        
        person1.afterNumberOfDays(5);
        System.out.println(person1);
        
        System.out.println(person1.afterNumberOfDays(5));
        
        SimpleDate person4 =person1.afterNumberOfDays(10);
       
        System.out.print(person4);
    }
}
