
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        SimpleCollection xmen = new SimpleCollection("characters");
        System.out.println("Longest: " + xmen.longest());
        
        xmen.add("magneto");
        xmen.add("mystique");
        xmen.add("phoenix");
        
        System.out.println("Longest: " + xmen.longest());
        System.out.println("");
        System.out.println(xmen.getElements());
    }
}
