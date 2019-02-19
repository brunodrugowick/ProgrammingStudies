package objects;

import java.util.Random;

/**
 * A U1-type Rocket.
 *
 * @author Bruno Drugowick Muniz
 */
public class U1 extends Rocket {

    private static final String ROCKET_SPECS = "..\nRocket Type = U1\n" +
            "Rocket cost = $100 Million\n" +
            "Rocket weight = 10 Tonnes\n" +
            "Max weight (with cargo) = 18 Tonnes\n" +
            "Chance of launch explosion = 5% * (cargo carried / cargo limit)\n" +
            "Chance of landing crash = 1% * (cargo carried / cargo limit)";

    public U1() {
        super(10000, 18000, 100000000);
    }

    /**
     * A method that launches the rocket with its cargo.
     * Given the cargo and a probability, the rocket may
     * crash.
     *
     * Chance of launch explosion = 5% * (cargo carried / cargo limit)
     *
     * @return true on a successful launch,
     * false if the rocket has crashed
     */
    @Override
    public boolean launch() {
        double explosionChance = (5.0/100) * ((double) this.getWeight() / (double) this.getMaxWeight());
        if (new Random().nextDouble() <= explosionChance)
            return false;
        return true;
    }

    /**
     * A method that lands the rocket with its cargo on
     * the destination.
     *
     * Chance of landing crash = 1% * (cargo carried / cargo limit)
     *
     * @return true on a successful landing,
     * false if the rocket has crashed.
     */
    @Override
    public boolean land() {
        double explosionChance = (1.0/100) * ((double) this.getWeight() / (double) this.getMaxWeight());
        if (new Random().nextDouble() <= explosionChance)
            return false;
        return true;
    }
}
