
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author juanlopez
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
        if (this.ocupantes.isEmpty()) {
            return true;
        } else {
            return false;
        }
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

        Person compared = ocupantes.get(0);

        for (Person holder : this.ocupantes) {
            if (compared.getHeight() > holder.getHeight()) {
                compared = holder;
            }
        }
        this.ocupantes.remove(compared);
        return compared;

    }
    public void clear (){
        this.ocupantes.clear();
    }

    public ArrayList<Person> getPersons() {
        return this.ocupantes;
    }
}
