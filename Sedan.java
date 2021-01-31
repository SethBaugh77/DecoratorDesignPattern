package DecoratorDesignPattern;

/**
 * Class that represents a Sedan car design. Inherits from Vehicle abstract class.
 * @author Seth Baugh
 */
public class Sedan extends Vehicle {

    /**
     * Constructor that creates a Sedan object. Sets the description "Sedan".
     */
    public Sedan() {
        description = "Sedan";
    }

    /**
     * Method that returns the cost of the normal Sedan with no additional decorations.
     * @return The cost of the vehicle, 20,000 dollars.
     */
    @Override
    public double getCost() {
        return 20000;
    }

}
