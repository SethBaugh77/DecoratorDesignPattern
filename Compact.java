package DecoratorDesignPattern;

/**
 * Class that represents a compact car design. Inherits from Vehicle abstract class.
 * @author Seth Baugh
 */
public class Compact extends Vehicle {

    /**
     * Constructor that creates a Compact object. Sets the description to Compact description to "Compact".
     */
    public Compact() {
        description = "Compact car";
    }

    /**
     * Method that returns the cost of the normal Compact with no additional decorations.
     * @return The cost of the vehicle, 15,000 dollars.
     */
    @Override
    public double getCost() {
        return 15000;
    }
}
