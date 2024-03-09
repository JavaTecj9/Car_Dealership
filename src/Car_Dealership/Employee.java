package Car_Dealership;

public class Employee {

    public int employeeID;
    public String firstName;
    public String lastName;
    public double salesCommission;
    public int yearsWithCompany;

    private double retailPrice;
    private int interestRate;
    private int term;


    public Employee(int employeeID, String firstName, String lastName, double salesCommission, int yearsWithCompany) {
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salesCommission = salesCommission;
        this.yearsWithCompany = yearsWithCompany;
    }

    public static void sellCar(double retailPrice, int term, int interestRate){
        double interestAmount = retailPrice * (interestRate * 0.01);
        double totalLoanAmount = interestAmount + retailPrice;
        double monthlyPayment = totalLoanAmount / (term * 12);
        System.out.println("Sold!! Total car price is: $" + String.format("%.2f", totalLoanAmount) + ". Interest on the load is: $" + String.format("%.2f", interestAmount) + ". Monthly payments will be: $" + String.format("%.2f", monthlyPayment) + ".");
    }

    public void salesCommission(double retailPrice, double dealerPrice, double salesCommission){
        double comPayOut = (retailPrice - dealerPrice) * (salesCommission * .01);
        System.out.println("The sales person " + firstName + " " + lastName + " receives $" + comPayOut + " in commission.\n");

    }
}
