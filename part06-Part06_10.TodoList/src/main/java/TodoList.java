
import java.util.ArrayList;

/*
 * @author juanlopez
 */
public class TodoList {
    private ArrayList<String> list;
    
    public TodoList(){
        this.list = new ArrayList <>();
    }

    public void add (String task) {
     this.list.add(task);     
    }
    
    public void remove (int number){
        this.list.remove(number-1);
    }
    
    public void print(){
        int number = 1;
        for (String content: list){
            if(content.isEmpty()){
                break;
            }
            System.out.println(number + ": " + content);
            number++;           
        }    
    }
    
    public int index (){
        int index = 0;
        for (int i=1;i<list.size();i++){
            index = i;
       }
        return index;
    }
   
}
