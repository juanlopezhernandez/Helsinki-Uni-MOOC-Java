/**
 *
 * @author juanlopez
 */
public class Item {

    private String name;
    private int weight;

    public Item(String inputName, int inputWeight) {
        this.name = inputName;
        this.weight = inputWeight;
    }

    public String getName() {
        return this.name;
    }

    public int getWeight() {
        return this.weight;
    }

    public String toString() {
        return this.name + " (" + this.weight + " kg)";
    }

}
