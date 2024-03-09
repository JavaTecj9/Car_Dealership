package Car_Dealership;

public class CarInventory {

    public String make;
    public String model;
    public int year;
    public double dealerCost;
    public double retailPrice;

    public CarInventory(String make, String model, int year, double dealerCost, double retailPrice) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.dealerCost = dealerCost;
        this.retailPrice = retailPrice;
    }
}
