
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juanlopez
 */
public class UserInterface {
   private Scanner scanner;
   private Program points;
    
    public UserInterface(){
        this.scanner= new Scanner (System.in);
        this.points= new Program();
    }
    
    public void start (){
            System.out.println("Enter points totals, -1 stops:");        
        while(true){

            int pointInput = scanner.nextInt();
            
            if (pointInput == -1){
                break;
            }
            this.points.add(pointInput);
            
       }
        
        System.out.println("Point average(all): " + this.points.average());
        System.out.println("Point average(passing): " + this.points.averagePassing());
        System.out.println("Pass percentage: " + this.points.passingPercentage());

   }
}
