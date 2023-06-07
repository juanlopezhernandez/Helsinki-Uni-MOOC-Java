
public class Main {

    public static void main(String[] args) {
        
        Gift equipo = new Gift ("dumbells", 50);
        
        System.out.println(equipo);
        System.out.println(equipo.getName());
        
        Gift regalo = new Gift ("iphone", 1);
        
        Package todo = new Package();
        todo.addGift(equipo);
        todo.clearList();        
        todo.addGift(regalo);
        System.out.println(todo.totalWeight());
        todo.clearList();
        

    } 
}
