
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }
    
    public Money plus(Money addition){
        int whole = this.euros+ addition.euros;
        int centavo = this.cents+ addition.cents;
        Money newMoneyPlus = new Money(whole, centavo );
                
        return newMoneyPlus;
    }
    public Money minus(Money decreaser){
        int whole = this.euros - decreaser.euros;
        int centavo = this.cents - decreaser.cents;
        if(centavo < 0){
            whole--;
            centavo= centavo + 100;
        }
        if (whole<0){
            whole = 0;
            centavo= 0;
        }
        
        Money newMoneyMinus = new Money(whole, centavo);
        return newMoneyMinus;
    }
    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }
    
    public boolean lessThan(Money compared){
        if(this.euros < compared.euros){
            return true;
        }
        if(this.euros == compared.euros && this.cents < compared.cents){
            return true;
        }
        return false;
    }
    


    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
