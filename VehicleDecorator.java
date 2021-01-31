package DecoratorDesignPattern;

/**
 * Abstract class that Paint, Rims, and SoundSystem all inherit from. 
 * @author Seth Baugh
 */
public abstract class VehicleDecorator extends Vehicle {

    /**
     * Abstract method that must be implemented in all child classes.
     * @return Description of the vehicle in String format. 
     */
    public abstract String toString();
}
