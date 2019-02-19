package objects;

/**
 * A class that represents an item to be carried by a Spaceship
 * to wherever place.
 *
 * @author Bruno Drugowick Muniz
 */
public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + ":" + weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
}
