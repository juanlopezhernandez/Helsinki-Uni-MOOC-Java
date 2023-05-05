
import java.util.ArrayList;
/**
 *
 * @author juanlopez
 */
public class Stack {
    
    private ArrayList<String> contents;
    
    public Stack (){
        this.contents = new ArrayList<>();
    }
    
    public boolean isEmpty(){
        if (this.contents.isEmpty()){
            return true;
            } else {            
            return false;             
            }     
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
