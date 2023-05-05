
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        Stack letras = new Stack();
        letras.add("hello");
        letras.add("my");
        letras.add("friend");
        System.out.println(letras.isEmpty());
        System.out.println(letras.values());
        letras.take();
        System.out.println(letras.values());

    }
}
