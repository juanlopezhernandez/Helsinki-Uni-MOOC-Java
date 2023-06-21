
public class Main {

    public static void main(String[] args) {
        // You can use the main to test your classes!
        Item tv = new Item("Panasonic", 5);       
        System.out.println(tv);
        Item brush = new Item("Colgate", 50);
        Item pc = new Item ("Mac" , 10);
        
        Suitcase mochila = new Suitcase (90);
        mochila.addItem(brush);
        mochila.addItem(tv);
        mochila.addItem(pc);
        
        System.out.println(mochila);
        System.out.println("");
        System.out.println(mochila.totalWeight());
        mochila.printItems();
        System.out.println("");
        System.out.println(mochila.heaviestItem());
        System.out.println("");
        
         Hold hold = new Hold(1000);
         hold.addSuitcase(mochila);
         System.out.println(hold);
         
         System.out.println("The suitcase on hold contains the follow items:");
         hold.printItems();
     
        
    }

}
