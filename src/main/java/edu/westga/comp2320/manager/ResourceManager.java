package edu.westga.comp2320.manager;

import java.util.ArrayList;

import edu.westga.comp2320.resources.Laptop;

import static edu.westga.comp2320.SimulationParameters.*;

/**
 * The ResourceManager class manages the inventory of resources in the resource center.
 * It allows for generating inventories of different resource types and retrieving available resources.
 * The different types of resources are laptops, tablets, and study rooms.
 * The number of each resource type is defined in the SimulationParameters class.
 *
 * @author COMP2320
 */
public class ResourceManager {
    private ArrayList<Laptop> inventory;

    /**
     * Constructs a ResourceManager and generates the initial inventory of resources.
     */
    public ResourceManager() {
        this.inventory = new ArrayList<Laptop>();
        this.generateLaptopInventory();
    }

    private void generateLaptopInventory() {
        for (int i = 0; i < NUMBER_OF_LAPTOPS; i++) {
            this.inventory.add(new Laptop());
        }
    }

    /**
     * Returns a laptop from the inventory.
     *
     * @return a laptop, or null if the inventory is empty
     */
    public Laptop getResource() {
        if (this.inventory.isEmpty()) {
            return null;
        }
        return this.inventory.getFirst();
    }
}
