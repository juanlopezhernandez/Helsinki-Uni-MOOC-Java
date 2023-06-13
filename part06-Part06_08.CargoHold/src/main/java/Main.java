
public class Main {

    public static void main(String[] args) {
        // You can use the main to test your classes!
        Item tv = new Item("Panasonic", 50);       
        System.out.println(tv);
        Item brush = new Item("colgate", 2);
        
        Suitcase mochila = new Suitcase (90);
        mochila.addItem(brush);
        mochila.addItem(tv);
        
        System.out.println(mochila);
    }

}
