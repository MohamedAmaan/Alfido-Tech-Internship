// Base Class
class Vehicle {
    void startEngine() {
        System.out.println("Starting the vehicle engine...");
    }

    void stopEngine() {
        System.out.println("Stopping the vehicle engine...");
    }
}

// Derived Class: Car
class Car extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Car engine started with a key.");
    }

    @Override
    void stopEngine() {
        System.out.println("Car engine stopped.");
    }
}

// Derived Class: Bike
class Bike extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Bike engine started with a kick.");
    }

    @Override
    void stopEngine() {
        System.out.println("Bike engine stopped.");
    }
}

// Main Class
public class Task3 {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle();
        Vehicle myCar = new Car();   // Using polymorphism
        Vehicle myBike = new Bike(); // Using polymorphism

        System.out.println("=== Vehicle ===");
        myVehicle.startEngine();
        myVehicle.stopEngine();

        System.out.println("\n=== Car ===");
        myCar.startEngine();
        myCar.stopEngine();

        System.out.println("\n=== Bike ===");
        myBike.startEngine();
        myBike.stopEngine();
    }
}
