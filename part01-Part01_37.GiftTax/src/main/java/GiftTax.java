
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Value of the gift? ");
        double gift = Double.valueOf(scan.nextLine());
        if (gift < 5000) {
            System.out.println("No tax!");
        } else if (gift <= 25000) {
            System.out.println("Tax:"+((gift-5000)* .08 +100));
        } else if (gift <= 55000) {
            System.out.println("Tax:"+((gift-25000)* .10 +1700));
        } else if (gift <= 200000) {
            System.out.println("Tax:"+((gift-55000)* .12 +4700));
        } else if (gift <= 1000000) {
            System.out.println("Tax:"+((gift-200000)* .15 +22100));
        } else {
            System.out.println("Tax: "+ ((gift-1000000)* .17 +142100) );
        }
    }
}
