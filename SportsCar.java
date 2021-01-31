package DecoratorDesignPattern;

/**
 * Class that represents a SportsCar car design. Inherits from Vehicle abstract class.
 * @author Seth Baugh
 */
public class SportsCar extends Vehicle {

    /**
     * Constructor that creates a SportsCar object. Sets the description to Compact description to "SportsCar".
     */
    public SportsCar() {
        description = "SportsCar";
    }

    /**
     * Method that returns the cost of the normal SportsCar with no additional decorations.
     * @return The cost of the vehicle, 30,000 dollars.
     */
    @Override
    public double getCost() {
        return 30000;
    }

}
