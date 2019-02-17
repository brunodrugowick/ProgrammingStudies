import objects.Item;
import objects.Rocket;
import objects.U1;
import objects.U2;
import simulation.Simulation;

import java.io.File;
import java.util.ArrayList;

/**
 * Main class to run the Simulation program.
 */
public class Main {

    /**
     * Runs the simulation.
     *
     * @param args
     */
    public static void main (String[] args) {

        // Creates asimulation
        Simulation simulation1 = new Simulation();
        System.out.println("Simulation MAX_BUDGET: " + Simulation.MAX_BUDGET);

        // Load items to execute the missions (phases 1 and 2)
        ArrayList<Item> phase1Items = simulation1.loadItems(new File("../files/phase-1.txt"));
        ArrayList<Item> phase2Items = simulation1.loadItems(new File("../files/phase-2.txt"));

        // =======================
        // U1 Rockets
        // =======================
        // Load items and create Fleet for phase 1
        ArrayList<Rocket> u1Phase1Fleet = simulation1.loadU1(phase1Items);

        // Load items and create Fleet for phase 2
        ArrayList<Rocket> u1Phase2Fleet = simulation1.loadU1(phase2Items);

        float u1Budget = 0;
        u1Budget += simulation1.runSimulation(u1Phase1Fleet);
        u1Budget += simulation1.runSimulation(u1Phase2Fleet);

        System.out.println("Total cost for U1 rockets: " + u1Budget);


        // =======================
        // U1 Rockets
        // =======================
        // Load items and create Fleet for phase 1
        ArrayList<Rocket> u2Phase1Fleet = simulation1.loadU2(phase1Items);

        // Load items and create Fleet for phase 2
        ArrayList<Rocket> u2Phase2Fleet = simulation1.loadU2(phase2Items);

        float u2Budget = 0;
        u2Budget += simulation1.runSimulation(u2Phase1Fleet);
        u2Budget += simulation1.runSimulation(u2Phase2Fleet);

        System.out.println("Total cost for U2 rockets: " + u2Budget);

    }
}
