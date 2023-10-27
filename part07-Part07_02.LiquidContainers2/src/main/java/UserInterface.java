
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
    
        private Scanner scan;
        private int first = 0;
        private int second = 0;        
    
    public UserInterface(){ 
        this.scan = new Scanner(System.in);
    }
    
    public void start(){
        
        
       while (true) {
            System.out.println("First: " + first + "/100");            
            System.out.println("Second: " + second + "/100");
            //takes in the user input that would take the user input
            String input = scan.nextLine();
            //break has to be set right after t he input has been recieved to avoid
            //outOfBounds Exceptions, if the break is set after the SPLITing of input
            //it will expect a an array at [1].
            if (input.equals("quit")) {
                break;
            }            
            //input split into 2 parts, a string and a int, separated by a space " "
            String[] parts = input.split(" ");
            //parts at [0], is assigned to a string, and parts at [1] to an integer         
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
                        
            if (command.equals("add")){
                
                
                
                if (amount < 0){
                    continue;
                }
                if((amount + first) <= 100){
                    first += amount;   
                } else {
                    first = 100;
                }
            }
                
            if (command.equals("move")){
                if (amount < 0){
                    continue;
                }
                //if amount is greater than first and first plus second is less than 100
                //add first to second and first set to 0;
                //else 
//                if(amount>first){
//                    if ((first + second)<=100){
//                    second += first;
//                    first =0;
//                } else {
//                        second += amount;
//                        first -= amount;
//                    }
//                }
                
                
                
                if (amount > first && ((first + second) <= 100)){
                   // if(second)
                    
                    second += first;
                    first = 0;
                }else {
                    second += amount;
                    first -= amount;
                }
                
                if (second > 100){                   
                        second = 100;
                       
                    }
            }
            
            if (command.equals("remove")){
                
                if(amount > second){
                    second = 0;
                } else {
                second -= amount;                
                }

                
            } 
        
    }
    
    
    
    
    
    }
    //
            

                


        
    
   // 
}
