
public class MainProgram {

    public static void main(String[] args) {
        // test your class here
        Money a = new Money(10,0);
        Money b = new Money(3,0);
        Money g = new Money(5,0);

        Money c = a.plus(b);

        System.out.println(a);  // 10.00e
        System.out.println(b);  // 5.00e
        System.out.println(c);
        
        System.out.println(a.lessThan(b));
        System.out.println(b.lessThan(g));
        
        
    }
}
