import objects.Item;
import objects.Rocket;
import simulation.Simulation;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
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
    public static void main (String[] args) throws FileNotFoundException {

        // Creates asimulation
        Simulation simulation1 = new Simulation();
        System.out.println("Simulation MAX_BUDGET (not in use): " + Simulation.MAX_BUDGET);

        // Load items to execute the missions (phases 1 and 2)
        System.out.println("Loading Phase-1 Items from file (<item>:<weight>):");
        ArrayList<Item> phase1Items = simulation1.loadItems(new File("files/phase-1.txt"));
        System.out.println("Loading Phase-2 Items from file (<item>:<weight>):");
        ArrayList<Item> phase2Items = simulation1.loadItems(new File("files/phase-2.txt"));

        // =======================
        // U1 Rockets
        // =======================
        // Create Fleet for phase 1
        System.out.println("\n============================================================================================\n" +
                "======================================== U1 Rockets ========================================\n" +
                "============================================================================================");
        System.out.println("Creating U1 fleet for phase 1:");
        ArrayList<Rocket> u1Phase1Fleet = simulation1.loadU1(phase1Items);
        for (Rocket rocket : u1Phase1Fleet)
            System.out.println("    [Rocket] " + rocket + " (hashCode: " + rocket.hashCode() + ")");

        // Create Fleet for phase 2
        System.out.println("Creating U1 fleet for phase 2:");
        ArrayList<Rocket> u1Phase2Fleet = simulation1.loadU1(phase2Items);
        for (Rocket rocket : u1Phase2Fleet)
            System.out.println("    [Rocket] " + rocket + " (hashCode: " + rocket.hashCode() + ")");

        System.out.println("U1 Fleet Summary: ");
        System.out.println("  Phase 1: " + u1Phase1Fleet.size() + " rockets.");
        System.out.println("  Phase 2: " + u1Phase2Fleet.size() + " rockets.");

        System.out.println("\nRunning simulations for U1 rockets: ");
        float u1Budget = 0;
        u1Budget += simulation1.runSimulation(u1Phase1Fleet);
        u1Budget += simulation1.runSimulation(u1Phase2Fleet);
        System.out.println("    Total cost of fleet: " + u1Budget);


        // =======================
        // U2 Rockets
        // =======================
        // Create Fleet for phase 1
        System.out.println("\n============================================================================================\n" +
                "======================================== U2 Rockets ========================================\n" +
                "============================================================================================");
        System.out.println("Creating U2 fleet for phase 1:");
        ArrayList<Rocket> u2Phase1Fleet = simulation1.loadU2(phase1Items);
        for (Rocket rocket : u2Phase1Fleet)
            System.out.println("    [Rocket] " + rocket + " (hashCode: " + rocket.hashCode() + ")");

        // Create Fleet for phase 2
        System.out.println("Creating U2 fleet for phase 2:");
        ArrayList<Rocket> u2Phase2Fleet = simulation1.loadU2(phase2Items);
        for (Rocket rocket : u2Phase2Fleet)
            System.out.println("    [Rocket] " + rocket + " (hashCode: " + rocket.hashCode() + ")");

        System.out.println("U2 Fleet Summary: ");
        System.out.println("  Phase 1: " + u2Phase1Fleet.size() + " rockets.");
        System.out.println("  Phase 2: " + u2Phase2Fleet.size() + " rockets.");

        System.out.println("\nRunning simulations for U2 rockets: ");
        float u2Budget = 0;
        u2Budget += simulation1.runSimulation(u2Phase1Fleet);
        u2Budget += simulation1.runSimulation(u2Phase2Fleet);
        System.out.println("Total cost og fleet: " + u2Budget);

    }
}
