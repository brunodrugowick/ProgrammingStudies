package objects;

/**
 * A rocket.
 *
 * @author Bruno Drugowick Muniz
 */
public class Rocket implements SpaceShip {

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
        return true;
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
        return true;
    }

    /**
     * A method that determines if an objects.Item can be carried
     * on the Spaceship based on its current weight and
     * weight limit.
     *
     * @param item The item to be determine if can be carried.
     * @return true if the rocket can carry such item or
     * false if it will exceed the weight limit
     */
    @Override
    public boolean canCarrry(Item item) {
        // TODO implement the method
        return false;
    }

    /**
     * A method that loads an objects.Item on the Spaceship,
     * updating its current weight.
     *
     * @param item The item to be loaded on the Spaceship.
     */
    @Override
    public void carry(Item item) {
        // TODO implement the method
    }
}
