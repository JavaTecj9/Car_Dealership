package Car_Dealership;

public class Customer {

    public String firstName;
    public String lastName;
    public String address;
    public double downPayment;
    public int salesPerson;
    public int creditScore;

    public int interestRate;

    public Customer(String firstName, String lastName, String address, double downPayment, int salesPerson, int creditScore, int interestRate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.downPayment = downPayment;
        this.salesPerson = salesPerson;
        this.creditScore = creditScore;
        this.interestRate = interestRate;
    }
}
