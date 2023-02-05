
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> bers = new ArrayList<>();
        bers.add(3);
        bers.add(4);
        bers.add(2);
        bers.add(1);
        bers.add(5);
        System.out.println(sum(bers));

    }
    public static int sum(ArrayList<Integer> numbers){
            int suma = 0;
            for (int i : numbers){
                suma += i;
            }
            return suma;
        }    
}
