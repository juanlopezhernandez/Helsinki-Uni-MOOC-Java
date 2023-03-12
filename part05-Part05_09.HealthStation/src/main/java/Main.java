
public class Main {

    public static void main(String[] args) {
        // write experimental code here to check how your program functions
        HealthStation childrens = new HealthStation();
        
        Person jeff = new Person ("jeff", 19, 50, 200);
        Person andrew = new Person ("andrew", 5, 25, 143);
        
        System.out.println(jeff.getName() + " weighs: " + childrens.weigh(jeff) +" kilos");
        System.out.println(andrew.getName() + " weighs: " + childrens.weigh(andrew) +" kilos");

        childrens.feed(jeff);        
        childrens.feed(jeff);
        
        System.out.println("");
        
        System.out.println(jeff.getName() + " weighs: " + childrens.weigh(jeff) +" kilos");

        System.out.println(childrens.weighings());
        if (childrens.adult(jeff)){
              System.out.println(jeff.getName() + " is over 18");
        }
      
    }
}
