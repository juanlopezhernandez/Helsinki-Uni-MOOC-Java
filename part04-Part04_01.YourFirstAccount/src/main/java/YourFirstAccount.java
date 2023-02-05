
public class YourFirstAccount {

    public static void main(String[] args) {
        Account artosAccount = new Account("Arto's account", 100.00);
Account artosSwissAccount = new Account("Arto's account in Switzerland", 1000000.00);

System.out.println("Initial state");
System.out.println(artosAccount);
System.out.println(artosSwissAccount);
        System.out.println(" ");

artosAccount.withdrawal(20);
System.out.println("The balance of Arto's account is now: " + artosAccount.saldo());
artosSwissAccount.deposit(200);
System.out.println("The balance of Arto's other account is now: " + artosSwissAccount.saldo());
        System.out.println(" ");

System.out.println("End state");
System.out.println(artosAccount);
System.out.println(artosSwissAccount);
        
    }
}
/*

Account juan = new Account("Juan", 100.0);
        juan.deposit(20.0);
        System.out.println(juan);
*/