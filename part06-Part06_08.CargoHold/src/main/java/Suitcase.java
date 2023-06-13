
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
public class Suitcase {
    private ArrayList<Item> articulo;
    private int limite;
    private int count;
    private int totalweight;
    
    public Suitcase(int limit){
        this.limite = limit;       
        this.articulo = new ArrayList<>();
    }
    
    public void addItem (Item inputItem){
        if (inputItem.getWeight() < this.limite){
                 this.articulo.add(inputItem);           
                 this.count++;  
                this.totalweight =this.totalweight+ inputItem.getWeight();                 
            //if (inputItem.getWeight() < this.limite){
//this.limite < this.totalweight


           // }
        }      
    }
    
    public String toString (){
        return this.count + " items " + this.totalweight;
    }
}
