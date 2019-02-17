package simulation;

import objects.Item;
import objects.Rocket;
import objects.U1;
import objects.U2;

import java.io.File;
import java.util.ArrayList;

/**
 * A class to run the simulation.
 *
 * @author Bruno Drugowick Muniz
 */
public class Simulation {

    public static final float MAX_BUDGET = 999999;

    /**
     * Reads the items on a text file and returns them as
     * an ArrayList of Item(s).
     *
     * @return An ArrayList of Items
     */
    public ArrayList<Item> loadItems(File file) {
        // TODO implement method according to specification.
        ArrayList<Item> items = new ArrayList<Item>();

        return items;
    }

    public ArrayList<Rocket> loadU1(ArrayList<Item> items) {
        // TODO implement method according to specification.
        ArrayList<Rocket> u1Rockets = new ArrayList<Rocket>();

        return u1Rockets;
    }

    public ArrayList<Rocket> loadU2(ArrayList<Item> items) {
        // TODO implement method according to specification.
        ArrayList<Rocket> u2Rockets = new ArrayList<Rocket>();

        return u2Rockets;
    }

    /**
     * Runs the simulation for the provided loaded rockets.
     * @param rockets
     * @return budget - a float indicating the total cost for the simulation
     */
    public float runSimulation(ArrayList<Rocket> rockets) {
        // TODO implement method according to specification.
        float budget = 0;

        for (Rocket rocket : rockets) {
            while ((!rocket.launch() || !rocket.land()) && budget < this.MAX_BUDGET) {
                System.out.println("Rocket crashed: " + rocket.toString());
                budget++;
            }
        }

        return budget;
    }


}
