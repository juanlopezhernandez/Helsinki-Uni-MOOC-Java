
public class MainProgram {

    public static void main(String[] args) {
        Product cintaParaMedir = new Product("Measuring Tape");
        Product plaster = new Product ("Plaster", "isle number 10");
        Product tyre = new Product ("Tire", 4);
        
        System.out.println(cintaParaMedir);
        System.out.println(plaster);
        System.out.println(tyre);
        System.out.println(tyre.getName());

    }
}
