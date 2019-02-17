package objects;

import java.util.ArrayList;

/**
 * A rocket.
 *
 * @author Bruno Drugowick Muniz
 */
public class Rocket implements SpaceShip {

    private int weight;
    private int max_weight;
    public ArrayList<Item> items;

    public int getCost() {
        return cost;
    }

    private int cost;

    public Rocket(int weight, int max_weight, int cost) {
        this.weight = weight;
        this.max_weight = max_weight;
        this.items = new ArrayList<>();
        this.cost = cost;
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
        return Math.random() < 0.5;
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
        return Math.random() < 0.5;
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
    public boolean canCarry(Item item) {
        if (this.weight + item.getWeight() <= this.max_weight)
            return true;
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
        this.weight += item.getWeight();
        this.items.add(item);
    }

    @Override
    public String toString() {
        StringBuilder specs = new StringBuilder();
        specs.append("Max weight: " + this.max_weight);
        specs.append(" Current weight: " + this.weight);
        specs.append(" Items: " + this.items);

        return specs.toString();
    }
}
