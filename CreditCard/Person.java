package CreditCard;

public class Person {
    private String firstName;
    private String lastName;
    private Address address;

    // constructor
    public Person(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    // to string
    public String toString() {
        return lastName + " " + firstName + ", " + address.toString();
    }
}
