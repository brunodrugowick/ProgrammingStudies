package simulation;

import objects.Item;
import objects.Rocket;
import objects.U1;
import objects.U2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * A class to run the simulation.
 *
 * @author Bruno Drugowick Muniz
 */
public class Simulation {

    public static final float MAX_BUDGET = 200000000;

    /**
     * Reads the items on a text file and returns them as
     * an ArrayList of Item(s).
     *
     * @return An ArrayList of Items
     */
    public ArrayList<Item> loadItems(File file) throws FileNotFoundException {

        ArrayList<Item> items = new ArrayList<Item>();
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            String[] line = scanner.nextLine().split("=");
            Item item = new Item(line[0], Integer.parseInt(line[1]));
            items.add(item);
            System.out.println("    " + item.toString());
        }
        return items;
    }

    /**
     * Loads U1 Rockets with @param items.
     *
     * @param items - an ArrayList of items to load on U1 rockets.
     * @return an ArrayList of U1 Rockets.
     */
    public ArrayList<Rocket> loadU1(ArrayList<Item> items) {

        /**
         * Since Java passes arrays by reference, I can not clear
         * the passed array, so I'm creating a copy below to use
         * inside this function (that clears the array in its
         * algorithm) and be able to use to array that the caller
         * passed to this function later.
         *
         * This is strange, will keep a TODO to verify this behaviour
         * later.
         */
        ArrayList<Item> this_items = new ArrayList<>();
        for (Item item : items)
            this_items.add(item);

        ArrayList<Rocket> u1Rockets = new ArrayList<Rocket>();

        while (this_items.size() > 0) {
            U1 currentRocket = new U1();
            ArrayList<Item> carryingItems = new ArrayList<Item>();
            for (Item item : this_items) {
                if (currentRocket.canCarry(item)) {
                    currentRocket.carry(item);
                    carryingItems.add(item);
                } else
                    break;
            }
            for (Item item : carryingItems)
                this_items.remove(item);
            u1Rockets.add(currentRocket);
        }

        return u1Rockets;
    }

    /**
     * Loads U2 Rockets with @param items.
     *
     * @param items an ArrayList of items to load on U2 rockets.
     * @return an ArrayList of U2 Rockets.
     */
    public ArrayList<Rocket> loadU2(ArrayList<Item> items) {

        /**
         * Since Java passes arrays by reference, I can not clear
         * the passed array, so I'm creating a copy below to use
         * inside this function (that clears the array in its
         * algorithm) and be able to use to array that the caller
         * passed to this function later.
         *
         * This is strange, will keep a TODO to verify this behaviour
                * later.
                */
        ArrayList<Item> this_items = new ArrayList<>();
        for (Item item : items)
            this_items.add(item);

        ArrayList<Rocket> u2Rockets = new ArrayList<Rocket>();

        while (this_items.size() > 0) {
            U2 currentRocket = new U2();
            ArrayList<Item> carryingItems = new ArrayList<Item>();
            for (Item item : this_items) {
                if (currentRocket.canCarry(item)) {
                    currentRocket.carry(item);
                    carryingItems.add(item);
                } else
                    break;
            }
            for (Item item : carryingItems)
                this_items.remove(item);
            u2Rockets.add(currentRocket);
        }

        return u2Rockets;
    }

    // TODO loadU1 and loadU2 are basically the same. Should refactor later to remove repeated code.

    /**
     * Runs the simulation for the provided loaded rockets.
     * @param rockets a fleet of rockets on an ArrayList.
     * @return a float indicating the total cost for the simulation
     */
    public float runSimulation(ArrayList<Rocket> rockets) {
        float budget = 0;
        int crashes = 0;

        for (Rocket rocket : rockets) {
            while ((!rocket.launch() || !rocket.land())) {
                crashes++;
                budget += rocket.getCost();
            }
            budget += rocket.getCost();
        }
        return budget;
    }


}
