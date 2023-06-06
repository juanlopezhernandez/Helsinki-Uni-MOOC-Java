
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);

    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        String toBePrinted = "The collection " + this.name + " ";

        if (elements.isEmpty()) {
            return toBePrinted + "is empty.";
        }

        String charactersinList = "";
        for (String stringX : elements) {
            charactersinList = charactersinList + "\n" + stringX;
        }

        if (elements.size() == 1) {
            return toBePrinted + "has " + elements.size() + " element:" + charactersinList;
        } else {
            return toBePrinted + "has " + elements.size() + " elements:" + charactersinList;

        }
    }
}
