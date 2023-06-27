
import java.util.ArrayList;
/**
 *
 * @author juanlopez
 */
public class Stack {
    
    private final ArrayList<String> contents;
    
    public Stack (){
        this.contents = new ArrayList<>();
    }
    
    public boolean isEmpty(){
        return this.contents.isEmpty();
    }
    
    public void add (String value){
        this.contents.add(value);
    }
    
    public ArrayList<String> values(){
        return this.contents;
    }
    
    public String take(){
       return this.contents.remove(this.contents.size()-1);
    }
    
}
