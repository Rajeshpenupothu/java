public class Car {
    // Attributes
    private String make;
    private String model;
    private int year;

    // Constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
    }

    // Main method to test the Car class
    public static void main(String[] args) {
        // Create a Car object
        Car myCar = new Car("Toyota", "Camry", 2020);
        
        // Display the car details
        myCar.displayDetails();
    }
}
