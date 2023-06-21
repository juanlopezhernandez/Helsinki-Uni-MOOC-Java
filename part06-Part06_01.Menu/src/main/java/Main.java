
public class Main {
    public static void main(String[] args) {
          Menu elMenu = new Menu();
        
        // When you have completed the method addMeal(String meal)
        // You can delete the comments below
        

        elMenu.addMeal("Smoked salmon, white wine and butter sauce with basil");
        elMenu.clearMenu();        
        elMenu.addMeal("Seasonal green salad with apple-honey vinegarette");
        elMenu.addMeal("Roasted lamb in a red wine sauce");
        
        elMenu.printMeals();
        System.out.println("");

        elMenu.addMeal("Una Carnita Asada");        
        
        System.out.println("");
        
        elMenu.printMeals();
        // When you have completed the method clearMenu()
        // you can remove the comments below
//        exactum.clearMenu();
//        exactum.printMeals();
    }
}
