
//import java.util.Scanner;

public class NumberUno {

    public static void main(String[] args) {
       
        int eka = 3;
        int toka = 8;
        int kolmas = 6;
        int neljas = 2;
        
        int total = custom(custom(eka,toka),custom(kolmas, neljas));
        System.out.println(total);
    }
    public static int custom(int one, int two) {
        return one + two;
    }
}
