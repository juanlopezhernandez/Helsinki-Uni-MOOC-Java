
import java.util.ArrayList;

 /* @author juanlopez
 */
public class Room {

    private ArrayList<Person> ocupantes;

    public Room() {
        this.ocupantes = new ArrayList<>();
    }

    public void add(Person person) {
        this.ocupantes.add(person);
    }

    public boolean isEmpty() {
        return this.ocupantes.isEmpty();
    }

    public Person shortest() {
        if (this.ocupantes.isEmpty()) {
            return null;
        }
        Person compared = ocupantes.get(0);

        for (Person holder : this.ocupantes) {
            if (compared.getHeight() > holder.getHeight()) {
                compared = holder;
            }
        }
        return compared;        
    }

    public Person take() {
        if (this.ocupantes.isEmpty()) {
            return null;
        }
        //used shortest() method to get the shortest person from the list and
        //asigns it to variable taken
        Person taken = this.shortest();
        //taken variable is then removed from ocupantes
        ocupantes.remove(taken);
        //the person is that is removed is printed
        return taken;        
    }
    
    public void clear (){
        this.ocupantes.clear();
    }

    public ArrayList<Person> getPersons() {
        return this.ocupantes;
    }
}
