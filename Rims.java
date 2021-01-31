package DecoratorDesignPattern;

/**
 * Class that represents a rim decoration for a car.
 * @author Seth Baugh
 */
public class Rims extends VehicleDecorator {
    private Vehicle vehicle;

    /**
     * Constructor that takes current description for the car and adds cool rims to it.
     * @param _vehicle that represents the car before its description is changed.
     */
    public Rims(Vehicle _vehicle) {
        vehicle = _vehicle;
        this.description = _vehicle.description + ", cool rims";
    }

    /**
     * Method that returns the description of the car in String format.
     * @return description of the car.
     */
    public String toString() {
        return this.description;
    }

    /**
     * Method that returns the cost of the vehicle before the paint decoration and then adds the 200$ to the old cost. 
     * @return Cost of the vehicle with the rims decoration cost added.
     */
    public double getCost() {
        return vehicle.getCost() + 200;
    }

}
