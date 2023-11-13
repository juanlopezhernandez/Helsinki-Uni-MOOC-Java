
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
public class Program {
     private ArrayList numbers;
     private int amount;
     private int amountPassing;
     
     public Program(){
         this.numbers = new ArrayList<>();
         this.amount = 0;
     }
      public void add (int number) {
        this.numbers.add(number);
        this.amount++;
        if (number>60){
            this.amountPassing++;
        }
    }
    public int average (){
        int total = 0;
        
        
        //need code, go one by one through list, a
        
        return total/this.amount;
    }
    public int averagePassing (){
        int total=0;
        
        return total/this.amountPassing;
    }
    public int passingPercentage(){
        return (this.amountPassing/this.amount)*100;
    }
    
   
      
}
