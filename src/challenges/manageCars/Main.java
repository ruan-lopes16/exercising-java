package challenges.manageCars;

import challenges.manageCars.exceptions.InvalidInputException;
import challenges.manageCars.exceptions.MaintenanceNeededException;
import challenges.manageCars.model.Car;
import challenges.manageCars.model.FleetCars;

public class Main {
    public static void main(String[] args) {
        FleetCars fleetCars = new FleetCars();

        try {
            Car car1 = new Car(1, "Ferrari", 300);
            Car car2 = new Car(2, "Porsche", 280);
            Car car3 = new Car(3, "Koenigsseg", 440);

            fleetCars.addCar(car1);
            fleetCars.addCar(car2);
            fleetCars.addCar(car3);

            car1.calculateLapTime(5);
            car1.registerBestLap(1.5);

            // fleetCars.removeCar(4); // exception

            Car updateCar = new Car(1, "BMW", 330);
            fleetCars.updateCar(1, updateCar);

            fleetCars.checkCarsForMaintenance();

        } catch ( InvalidInputException | MaintenanceNeededException exception ) {
            System.err.println("Error: " + exception.getMessage());
            exception.printStackTrace();
        }

        System.out.println("\nListing cars in the fleet:");
        fleetCars.listCars();

        fleetCars.toString();
    }
}
