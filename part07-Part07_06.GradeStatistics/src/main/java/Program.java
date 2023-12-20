
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

    private ArrayList<Integer> numbersList;
    private int addedValueOfNumbers;
    private int entries;

    public Program() {
        this.numbersList = new ArrayList<>();
        this.addedValueOfNumbers = 0;
        this.entries = 0;
    }

    public void add(int number) {

        if (number > 0 && number <= 100) {
            this.numbersList.add(number);
            this.entries++;
            addedValueOfNumbers += number;
        }
    }

    public double average() {
        //int total = 0;               
        //need code, go one by one through list, a        
        return this.addedValueOfNumbers / this.entries;
    }

    public double averagePassing() {
        int totalPassing = 0;
        int entriesPassing = 0;

        for (int hold : this.numbersList) {
            if (hold >= 50) {
                totalPassing += hold;
                entriesPassing++;
            }
        }

        return totalPassing / entriesPassing;

    }

    //review
    public String zero() {
        return "-";
    }

    public double passingPercentage() {
        double totalPassing = 0;
        double entriesPassing = 0;

        for (int hold : this.numbersList) {
            entriesPassing++;
            if (hold >= 50) {
                totalPassing++;

            }
        }

        return 100 * totalPassing / entriesPassing;

    }
    //stars
    public String distro (){
        
        for ( int hold : this.numbersList){
            if(hold < 50){
                return "0: ";
            }
        }
        
        return "";
    }

}
