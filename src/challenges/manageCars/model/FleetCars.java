package challenges.manageCars.model;

import challenges.manageCars.exceptions.CarNotFoundException;
import challenges.manageCars.exceptions.MaintenanceNeededException;

import java.util.ArrayList;

public class FleetCars {
    // attributes
    private ArrayList<Car> cars;

    // constructor
    public FleetCars() {
        this.cars = new ArrayList<Car>();
    }

    // methods
    public void addCar( Car car ) {
        this.cars.add( car );
    }

    public void removeCar( int id ) throws CarNotFoundException {
        for ( int i = 0; i < this.cars.size(); i++ ) {
            Car car = this.cars.get( i );

            if ( car.getId() == id ) {
                this.cars.remove( i );
            }
        }
        throw new CarNotFoundException( "Car with ID " + " not found." );
    }

    public void updateCar( int id, Car newCar ) throws CarNotFoundException {
        for ( int i = 0; i < cars.size() ; i++ ) {

            Car existingCar = cars.get( i );

            if ( existingCar.getId() == id ) {
                cars.set( i, newCar );
                return;
            }
        }
        throw new CarNotFoundException( "Car with ID " + " not found." );
    }

    public void listCars() {
        for ( Car car: cars ) {
            System.out.println( car.toString() );
        }
    }

    public void checkCarsForMaintenance() throws MaintenanceNeededException {
        System.out.println( "Cars that need maintenance:" );
        for ( Car car: cars ) {

            try {
                if ( car.checkMaintenance(90000)) {
                    System.out.println(car);
                }

            } catch ( MaintenanceNeededException exception ) {
                System.out.println( car.getModel() + ": " + exception.getMessage() );

            }
        }
    }

}
