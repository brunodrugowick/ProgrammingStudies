package objects;

import java.util.Random;

/**
 * A U2-type Rocket.
 *
 * @author Bruno Drugowick Muniz
 */
public class U2 extends Rocket {

    private static final String ROCKET_SPECS = "..\nRocket type = U2\n" +
            "Rocket cost = $120 Million\n" +
            "Rocket weight = 18 Tonnes\n" +
            "Max weight (with cargo) = 29 Tonnes\n" +
            "Chance of launch explosion = 4% * (cargo carried / cargo limit)\n" +
            "Chance of landing crash = 8% * (cargo carried / cargo limit)";

    public U2() {
        super(18000, 29000, 120000000);
    }

    /**
     * A method that launches the rocket with its cargo.
     * Given the cargo and a probability, the rocket may
     * crash.
     *
     * Chance of launch explosion = 4% * (cargo carried / cargo limit)
     *
     * @return true on a successful launch,
     * false if the rocket has crashed
     */
    @Override
    public boolean launch() {
        double explosionChance = (4.0/100) * ((double) this.getWeight() / (double) this.getMaxWeight());
        if (new Random().nextDouble() <= explosionChance)
            return false;
        return true;
    }

    /**
     * A method that lands the rocket with its cargo on
     * the destination.
     *
     * Chance of landing crash = 8% * (cargo carried / cargo limit)
     *
     * @return true on a successful landing,
     * false if the rocket has crashed.
     */
    @Override
    public boolean land() {
        double explosionChance = (8.0/100) * ((double) this.getWeight() / (double) this.getMaxWeight());
        if (new Random().nextDouble() <= explosionChance)
            return false;
        return true;
    }
}
