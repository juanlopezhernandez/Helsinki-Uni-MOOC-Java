/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author juanlopez
 */
public class Fitbyte {
    private int age;
    private int rHr;
    
    public Fitbyte(int edad, int restingHeartRate){
        this.age = edad;
        this.rHr = restingHeartRate;
    }
    public double maxRate (){
        return 206.3 - (0.711 * this.age);
    }
    public double targetHeartRate(double targetPercentage){
        double target = targetPercentage;
        return (maxRate() - this.rHr) * (target) + this.rHr;
    }
}
