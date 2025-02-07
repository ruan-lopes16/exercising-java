package challenges.manageCars.model;

import challenges.manageCars.exceptions.InvalidInputException;
import challenges.manageCars.exceptions.MaintenanceNeededException;

public class Car {
    // attributes
    private int id;
    private String model;
    private double maxSpeed;
    private double bestLapTime;
    private boolean needsMaintenance;

    // construtor
    public Car( int id, String model, double maxSpeed ) throws InvalidInputException {
        if ( id <= 0 ) {
            throw new InvalidInputException( "Invalid car ID. ID must be positive." );
        }
        if ( maxSpeed <= 0 ) {
            throw new InvalidInputException( "Invalid max speed. Speed must be positive." );
        }
        this.id = id;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.bestLapTime = Double.MAX_VALUE;
        this.needsMaintenance = false;
    }

    // getters
    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public double getBestLapTime() {
        return bestLapTime;
    }

    public boolean isNeedsMaintenance() {
        return needsMaintenance;
    }

    // setters
    public void setBestLapTime( double bestLapTime ) {
        this.bestLapTime = bestLapTime;
    }

    public void setNeedsMaintenance( boolean needsMaintenance ) {
        this.needsMaintenance = needsMaintenance;
    }

    // methods
    public void calculateLapTime( double distance ) {

        double time = ( distance / maxSpeed ) * 60; // * 60 to be in minutes
        System.out.println( "Estimated time for lap: " + time + " minutes." );

    }

    public void registerBestLap( double time ) throws InvalidInputException {
        if ( time <= 0 ) {
            throw new InvalidInputException( "Invalid lap time. Time must be posisitive." );
        }

        if ( time < this.bestLapTime ) {
            this.bestLapTime = time;
        }

    }

    public boolean checkMaintenance( double odometer ) throws MaintenanceNeededException {

        if ( odometer >= 90000 ) {
            this.needsMaintenance = true;
            throw new MaintenanceNeededException( "Vehicle " + getModel() + " needs maintenance!" );

        }
        return false;

    }

    @Override
    public String toString() {
        return "Car ID: " + id +
                ", Model: " + model +
                ", Max Speed: " + maxSpeed + " km/h " +
                ", Best Lap Time: " + bestLapTime + " min. " +
                ", Needs Maintenance: " + needsMaintenance;
    }
}