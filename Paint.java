package DecoratorDesignPattern;

/**
 * Class that represents a paint decoration for a car.
 * @author Seth Baugh
 */
public class Paint extends VehicleDecorator {
    private Vehicle vehicle;

    /**
     * Constructor that takes current description for the car and adds fancy paint to it.
     * @param _vehicle that represents the car before its description is changed. 
     */
    public Paint(Vehicle _vehicle) {
        this.description = _vehicle.description + ", fancy paint";
        vehicle = _vehicle;
    }

    /**
     * Method that returns the cost of the vehicle before the paint decoration and then adds the 150$ to the old cost. 
     * @return Cost of the vehicle with the paint decoration cost added.
     */
    public double getCost() {
        return vehicle.getCost() + 150;
    }

    /**
     * Method that returns the description of the car in String format.
     * @return description of the car.
     */
    @Override
    public String toString() {
        return this.description;
    }

}
