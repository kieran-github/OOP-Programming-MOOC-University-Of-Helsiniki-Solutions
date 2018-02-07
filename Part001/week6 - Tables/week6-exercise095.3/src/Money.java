public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros(){
        return euros;
    }

    public int cents(){
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    public Money plus(Money added) {
    	Money newMoney = new Money(this.euros + added.euros(), this.cents + added.cents());
    	return newMoney;
    }
    public Money minus(Money decremented){
        if(this.euros - decremented.euros > 0){
            if(this.cents < decremented.cents){
                Money newMoney1 = new Money((this.euros-1) - decremented.euros, Math.abs(this.cents-decremented.cents));
                return newMoney1;
            } 
            else {
                Money newmoney2 = new Money (this.euros - decremented.euros, this.cents - decremented.cents);
                return newmoney2;
            }
        } else {
            Money newmoney3 = new Money (0, 0);
            return newmoney3;
        }
        
    }
}
  