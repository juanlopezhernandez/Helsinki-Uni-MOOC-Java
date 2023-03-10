/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juanlopez
 */
public class Timer {
    private ClockHand hundSec;
    private ClockHand seconds;
    
    public Timer (){
        this.hundSec = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }
    
    public String toString(){
        
        return seconds + ":" + hundSec;
    }
    
    public void advance(){
        this.hundSec.advance();
        
        if(this.hundSec.value() == 0){
            this.seconds.advance();
        } 
                
    }
}
