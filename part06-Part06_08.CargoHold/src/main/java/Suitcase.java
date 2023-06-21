
import java.util.ArrayList;

/* @author juanlopez
 */
public class Suitcase {

    private ArrayList<Item> articulo;
    private int limite;
    private int totalweight;

    public Suitcase(int limit) {
        this.limite = limit;
        this.articulo = new ArrayList<>();
    }

    public void addItem(Item inputItem) {

        if (inputItem.getWeight() + this.totalweight <= this.limite) {
            this.articulo.add(inputItem);
            this.totalweight = this.totalweight + inputItem.getWeight();
        }
    }

    public int totalWeight() {
        return this.totalweight;
    }

    public void printItems() {
        for (Item itemSample : this.articulo) {
            System.out.println(itemSample);
        }

    }

    public Item heaviestItem() {

        if (this.articulo.isEmpty()) {
            return null;
        }
        Item compared = this.articulo.get(0);
        for (Item hold : this.articulo) {
            if (compared.getWeight() < hold.getWeight()) {
                compared = hold;
            }
        }
        return compared;

    }

    public String toString() {
        String common = "(" + this.totalweight + " kg)";

        if (this.articulo.isEmpty()) {
            return "no items" + common;
        }
        if (this.articulo.size() == 1) {
            return this.articulo.size() + " item " + common;
        } else {
            return this.articulo.size() + " items " + "(" + this.totalweight + " kg)";
        }
    }
}
