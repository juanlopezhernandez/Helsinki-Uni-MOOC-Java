
import java.util.ArrayList;

public class Menu {

    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }
    public void addMeal(String meal){
        if(!(meals.contains(meal))){
        // if the <meals> list DOES NOT contain the parameter meal add parameter   
        this.meals.add(meal);
        }
    
    }
    public void printMeals(){
        for (String comidas : meals){
            System.out.println(comidas);
        }
        //return "add meal";
   }    
   public void clearMenu (){
       meals.clear();
   }
   
    // implement the required methods here

}