
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juanlopez
 */
public class JokeManager {
    private ArrayList<String> jokeList;
    
    public JokeManager(){
        this.jokeList = new ArrayList<>();        
    }
    
    public void addJoke(String joke){
        this.jokeList.add(joke);
    }
    
    public String drawJoke(){
        if(this.jokeList.isEmpty()){
           
            return "Jokes are in short supply.";
        } 
        Random draw = new Random();
        int randomIndex = draw.nextInt(jokeList.size());       
        String hold = this.jokeList.get(randomIndex);
        //System.out.println(hold);
        return hold;
                
    }
    
    public void printJokes(){
        for (String hold: this.jokeList){
            System.out.println(hold);
        }
    }
    
        
}
