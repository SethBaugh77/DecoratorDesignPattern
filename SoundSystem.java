package DecoratorDesignPattern;

/**
 * Class that represents a SoundSystem decoration for a car.
 * @author Seth Baugh
 */
public class SoundSystem extends VehicleDecorator {
    private Vehicle vehicle;

    /**
     * Constructor that takes current description for the car and adds awesome sound to it.
     * @param _vehicle that represents the car before its description is changed.
     */
    public SoundSystem(Vehicle _vehicle) {
        this.description = _vehicle.description + ", awesome sound";
        vehicle = _vehicle;
    }

    /**
     * Method that returns the cost of the vehicle before the SoundSystem decoration and then adds the 350$ to the old cost. 
     * @return Cost of the vehicle with the SoundSystem decoration cost added.
     */
    public double getCost() {
        return vehicle.getCost() + 350;
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
