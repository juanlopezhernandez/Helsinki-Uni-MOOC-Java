
public class Averaging {

    // implement the sum method here again
    public static int sum(int number1, int number2, int number3, int number4) {
        // write some code here
        System.out.println("hellow world");
        return number1 + number2 + number3 + number4;
        
    }

    public static double average(int number1, int number2, int number3, int number4) {
        /* we could have gotten the average only using one method, but i suppose
        we in certain programs we might need to call the sum() method for one
        reason or another ex. to double the sum etc.*/
        return sum(number1, number2, number3,number4)/4.0;
    }

    public static void main(String[] args) {
        double result = average(4, 3, 6, 1);
        System.out.println("Average: " + result);
    }
}
