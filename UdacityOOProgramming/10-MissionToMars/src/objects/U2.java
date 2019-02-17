package objects;

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

    private static final int cost = 120;
    private static final int u2Weight = 18000;
    private static final int u2maxWeight = 29000;

    public U2() {
        super(u2Weight, u2maxWeight, cost);
    }

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
}
