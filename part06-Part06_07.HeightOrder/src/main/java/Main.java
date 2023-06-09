
public class Main {

    public static void main(String[] args) {
        Room room = new Room();
        System.out.println("Empty room? " + room.isEmpty());
        room.add(new Person("Lea", 183));
        room.add(new Person("Kenya", 182));
        room.add(new Person("Auli", 186));
        room.add(new Person("Nina", 172));
        room.add(new Person("Terhi", 185));
        System.out.println("Empty room? " + room.isEmpty());

        System.out.println("");
        for (Person person : room.getPersons()) {
            System.out.println(person);
        }
        System.out.println("");
        System.out.println("This is the shortest person: " + room.shortest());
        //room.clear();
        System.out.println("This is the person that is \"taken\": " + room.take());
        System.out.println("");
        for (Person order :room.getPersons()){
            System.out.println(order);
        }
        room.add(new Person("juan",200));
        Person last = new Person ("gordo", 888);
        room.add(last);
        System.out.println("");
        while (!room.isEmpty()){
            System.out.println(room.take());
        }

    }
}
