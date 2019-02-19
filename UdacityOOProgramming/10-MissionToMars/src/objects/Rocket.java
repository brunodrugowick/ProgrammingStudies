package objects;

import java.util.ArrayList;

/**
 * A rocket.
 *
 * @author Bruno Drugowick Muniz
 */
public class Rocket implements SpaceShip {

    private int cost;
    private int weight;
    private int maxWeight;
    private ArrayList<Item> items;

    public Rocket(int weight, int maxWeight, int cost) {
        this.weight = weight;
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public int getWeight() {
        return weight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * A method that launches the rocket with its cargo.
     * Originally it should return true and be implemented
     * on the subclasses, but I thought it would be cooler
     * to randomly return true|false.
     *
     * @return true on a successful launch,
     * false if the rocket has crashed
     */
    @Override
    public boolean launch() {
        return Math.random() < 0.5;
    }

    /**
     * A method that launches the rocket with its cargo.
     * Originally it should return true and be implemented
     * on the subclasses, but I thought it would be cooler
     * to randomly return true|false.
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
        if (this.getWeight() + item.getWeight() <= this.getMaxWeight())
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
    public boolean carry(Item item) {
        if(!canCarry(item))
            return false;
        this.setWeight(this.getWeight() + item.getWeight());
        this.items.add(item);
        return true;
    }

    @Override
    public String toString() {
        StringBuilder specs = new StringBuilder();
        specs.append("Cost: " + this.getCost());
        specs.append(" Max weight: " + this.getMaxWeight());
        specs.append(" Current weight: " + this.getWeight());
        specs.append(" Items: " + this.getItems());

        return specs.toString();
    }
}
