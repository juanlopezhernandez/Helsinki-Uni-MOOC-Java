
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juanlopez
 */
public class TodoList {
    private ArrayList list;
    
    public TodoList(){
        this.list = new ArrayList <>();
    }

    public void add (String task) {
     this.list.add(task);     
    }
    
    public void remove (int number){
        this.list.remove(number);
    }
    
    public ArrayList listContent (){
       

        return this.list;
    }
    public int index (){
        int index = 0;
        for (int i=1;i<list.size();i++){
            index = i;
       }
        return index;
    }
   
}
