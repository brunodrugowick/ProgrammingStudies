package objects;

/**
 * A U1-type Rocket.
 *
 * @author Bruno Drugowick Muniz
 */
public class U1 extends Rocket {

    /**
     * A method that launches the rocket with its cargo.
     * Given the cargo and a probability, the rocket may
     * crash.
     *
     * @return true on a successful launch,
     * false if the rocket has crashed
     */
    @Override
    public boolean launch() {
        // TODO implement the method
        return super.launch();
    }

    /**
     * A method that lands the rocket with its cargo on
     * the destination.
     *
     * @return true on a successful landing,
     * false if the rocket has crashed.
     */
    @Override
    public boolean land() {
        // TODO implement the method
        return super.land();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
