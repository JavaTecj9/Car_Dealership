package Car_Dealership;

public class Main {
    public static void main(String[] args) {

        CarInventory Car1 = new CarInventory("Ford", "Explorer", 2024, 35000.00, 55000.00);
        CarInventory Car2 = new CarInventory("Ford", "F150", 2024, 50000.00, 65000.00);
        CarInventory Car3 = new CarInventory("Ford", "F250", 2024, 60000.00, 75000.00);
        CarInventory Car4 = new CarInventory("Ford", "Focus", 2024, 30000.00, 45000.00);

        Customer customer1 = new Customer("Jim", "Smith", "123 MainStreet", 500.00, 1, 650, 6);
        Customer customer2 = new Customer("Joe", "Brown", "246 MainStreet", 1500.00, 1, 700, 4);
        Customer customer3 = new Customer("Jane", "Smith", "821 MainStreet", 2500.00, 1, 750, 3);
        Customer customer4 = new Customer("Jessica", "Seel", "852 MainStreet", 0.00, 1, 550, 12);

        Employee employee1 = new Employee(101, "Bob", "King", 12, 8);
        Employee employee2 = new Employee(109, "Sam", "Goodman", 9, 6);

        Employee.sellCar(Car2.retailPrice, 5, customer1.interestRate);
        employee1.salesCommission(Car2.retailPrice, Car2.dealerCost, employee1.salesCommission);

        Employee.sellCar(Car1.retailPrice, 4, customer4.interestRate);
        employee2.salesCommission(Car1.retailPrice, Car1.dealerCost, employee2.salesCommission);

        Employee.sellCar(Car4.retailPrice, 5, customer3.interestRate);
        employee1.salesCommission(Car4.retailPrice, Car4.dealerCost, employee1.salesCommission);
    }
}