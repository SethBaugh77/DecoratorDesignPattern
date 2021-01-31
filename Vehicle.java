package DecoratorDesignPattern;

/**
 * Abstract class that is the parents class for all other classes.
 * @author Seth Baugh
 */
public abstract class Vehicle {
    protected String description;

    /**
     * Method that returns the description of the car in String format.
     * @return description of the car.
     */
    public String toString() {
        return description;
    }

    /**
     * Abstract method that returns the cost of the car.
     * @return double that is the cost of the car.
     */
    public abstract double getCost();

}
