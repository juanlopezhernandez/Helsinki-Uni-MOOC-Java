
import java.util.ArrayList;


public class ExerciseManagement {
    
    public ArrayList<String> exercises;
    
    public ExerciseManagement () {
        this.exercises = new ArrayList<>();
    }
    
    public ArrayList<String> exerciseList(){
        return this.exercises;
    }
    
    public void add (String exercise){
        this.exercises.add("Write a test");
    }
    
//    public boolean contains (String exercise) {
//        if (this.exercises.contains(exercise)){
//            return true;
//        }
//        return false;
//    }

}
