  
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
        //part below is to keep the code that will be reused in futher in the code
        String toBePrinted = "The collection " + this.name + " ";
        
        //this part is for an empty arrayList using the repeated code above
        if (elements.isEmpty()) {
            return toBePrinted + "is empty.";
        }

        //empty string to store elements reached with the for loop
        String charactersinList = "";
        //variable stringX of String type; 
        //variable type has to be the same as the list you are traversing;
        //1 index at a time is assigned to the variable
        for (String stringX : elements) {
            //variable is added to the String created outside the loop.
            charactersinList = charactersinList + "\n" + stringX;
        }
        
        //code to print list with one element, has to print 'singular'
        //everything ELSE is plural
        if (elements.size() == 1) {
            return toBePrinted + "has " + elements.size() + " element:" + charactersinList;
        } else {
            return toBePrinted + "has " + elements.size() + " elements:" + charactersinList;

        }
    }
}
