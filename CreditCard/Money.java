package CreditCard;

public class Money {
    private long dollars;
    private long cents;

    // Constructors

    // money object constructor
    public Money(double amount) {
        this.dollars = (long) amount;
        this.cents = Math.round((amount - dollars) * 100);
    }

    // copy constructor for money object
    public Money(Money otherObject) {
        this.dollars = otherObject.dollars;
        this.cents = otherObject.cents;
    }

    // method to add money
    public Money add(Money otherAmount) {
        long totalCents = this.dollars * 100 + this.cents + otherAmount.dollars * 100 + otherAmount.cents;
        return new Money(totalCents / 100);
    }

    // method to subtract money
    public Money subtract(Money otherAmount) {
        long totalCents = this.dollars * 100 + this.cents - otherAmount.dollars * 100 - otherAmount.cents;
        return new Money(totalCents / 100);
    }

    // compare two money objects
    public int compareTo(Money otherObject) {
        long totalCents1 = this.dollars * 100 + this.cents;
        long totalCents2 = otherObject.dollars * 100 + otherObject.cents;
        return Long.compare(totalCents1, totalCents2);
    }

    // check equals
    public boolean equals(Money otherObject) {
        if (this == otherObject) return true; 
        
        if (otherObject == null) return false;
        
        return dollars == otherObject.dollars && cents == otherObject.cents;
    }

    // to string
    public String toString() {
        return "$" + dollars + "." + String.format("%02d", cents);
    }

}
