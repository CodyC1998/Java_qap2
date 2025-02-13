package CreditCard;

public class CreditCard {
    private Person owner;
    private Money balance;
    private Money creditLimit;

    // constructor
    public CreditCard(Person owner, Money creditLimit) {
        this.owner = owner;
        this.balance = new Money(0);
        this.creditLimit = creditLimit;
    }

    // getters and setters
    public Money getBalance() {
        return new Money(balance);
    }

    public Money getCreditLimit() {
        return new Money(creditLimit);
    }

    public String getPersonals() {
        return owner.toString();
    }

    // methods
    public void charge(Money amount) {
        Money newBalance = new Money(balance);
        newBalance.add(amount);

        if (newBalance.compareTo(creditLimit) <= 0) {
            balance.add(amount);
            System.out.println("Charge: " + amount);
        } else {
            System.out.println("Charge failed: Credit limit exceeded");
        }
    }

    public void payment(Money amount) {
        balance.subtract(amount);
        System.out.println("Payment: " + amount);
    }
}
