
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account Matt = new Account ("Matthews account", 1000.0);
        Account my = new Account ("My account", 0);
        Matt.withdrawal(100.0);
        my.deposit(100.0);
        System.out.println(Matt);
        System.out.println(my);
        double saldo = Matt.balance();
        System.out.println(Matt.balance() + my.balance());
        System.out.println("this is the value of variable " + saldo);
    }
}
