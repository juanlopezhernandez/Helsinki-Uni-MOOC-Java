
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
     private ArrayList<Integer> numbers;
     private int amount;
     private int entries;
     
     public Program(){
         this.numbers = new ArrayList<>();
         this.amount = 0;
     }
      public void add (int number) {
          
        if (number>=0 &&number<=100){
            this.numbers.add(number);
            this.entries++;
            amount += number;
        }
    }
      
    public int average (){
        //int total = 0;               
        //need code, go one by one through list, a        
        return this.amount/this.entries;
    }
    public int averagePassing (){
        int totalPassing = 0;
        int entriesPassing = 0;
        if (entriesPassing == 0){
            zero();
        }
        for (int hold :this.numbers){
            if (hold >= 50){
                totalPassing += hold;
                entriesPassing++;
            }
        }
        

        return totalPassing/entriesPassing;
        
    }
    public String zero (){
        return "-";
    }
    public int passingPercentage(){
        return (this.entries/this.amount)*100;
    }
    
   
      
}
