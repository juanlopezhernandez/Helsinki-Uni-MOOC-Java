
public class Main {

    public static void main(String[] args) {
        // you can write code here to try out your program
        SimpleDate date = new SimpleDate (24, 3, 2017);
        SimpleDate date2 = new SimpleDate (23, 7, 2017);
        SimpleDate date3 = new SimpleDate (24, 3, 2017);
        
        Person leo = new Person ("Leo", date, 62, 9);
        Person lily = new Person("Lily", date2, 65, 8);
        Person clone = new Person("Close", date3, 62, 9);
        
        if (leo.equals(lily)){
            System.out.println("Is this quite correct?");
        }
        Person loeWithDifferentWeight = new Person("Leo", date, 62, 10);
        
        if (leo.equals(loeWithDifferentWeight)){
            System.out.println("Is this quire correct?");
        }
        if (leo.equals(clone)){
            System.out.println("Same!");
        }
        
    }
}
