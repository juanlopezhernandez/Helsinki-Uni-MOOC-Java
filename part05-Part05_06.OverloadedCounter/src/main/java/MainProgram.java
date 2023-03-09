
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter ikki = new Counter();
        ikki.increase();
        ikki.increase(5);
        System.out.println(ikki.value());
    }
}
