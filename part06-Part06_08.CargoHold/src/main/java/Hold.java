
import java.util.ArrayList;

/**
 * @author juanlopez
 */
public class Hold {

    private ArrayList<Suitcase> cases;
    private int maxWeight;
    private int weightCurrentlyOnHold;

    public Hold(int peso) {
        this.maxWeight = peso;
        this.cases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (suitcase.totalWeight() + this.weightCurrentlyOnHold <= this.maxWeight) {
            this.cases.add(suitcase);
            this.weightCurrentlyOnHold = this.weightCurrentlyOnHold + suitcase.totalWeight();
        }
    }

    public void printItems() {
        System.out.println(this.cases);

        for (Suitcase caseEx : cases) {
            caseEx.printItems();
        }
    }

    public String toString() {
        String common = this.cases.size() + " ";

        if (cases.isEmpty()) {
            return "Nothing on hold";
        }

        if (cases.size() == 1) {
            return common + "suitcase (" + this.weightCurrentlyOnHold + "kg)";
        } else {
            return common + "suitcases (" + this.weightCurrentlyOnHold + "kg)";
        }

    }

}
