import java.time.Year;

public class Vehicle {
    String brand;
    String model;
    int year;

    
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    void displayInfo() {
        System.out.println(brand + " " + model + " - " + year);
    }

    int calculateAge() {
        int currentYear = Year.now().getValue();
        return currentYear - year;
    }

    boolean isVintage() {
        return calculateAge() >= 25;
    }
}
