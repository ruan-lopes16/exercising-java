package challenges.manageCars;

public class Car {
    // attributes
    private int id;
    private String model;
    private double maxSpeed;
    private double bestLapTime;
    private boolean needsMaintenance;

    // construtor
    public Car( int id, String model, double maxSpeed ){
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

    public void registerBestLap( double time ) {

        if ( time < this.bestLapTime ) {
            this.bestLapTime = time;
        }

    }

    public boolean needsMaintenance( double odometer ) throws MaintenanceNeededException {

        if ( odometer >= 90000 ) {
            this.needsMaintenance = true;
            throw new MaintenanceNeededException( "Vehicle " + getModel() + " needs maintenance!" );

        } else {
            return false;

        }

    }

    public void carInfo() {

        System.out.println(
                "Car id: " + getId() +
                "Car model: " + getModel() +
                "Max speed: " + getMaxSpeed() + "km/h" +
                "Best lap time: " + getBestLapTime() + "min."
        );

    }

}