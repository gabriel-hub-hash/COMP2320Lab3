package edu.westga.comp2320.events;

import edu.westga.comp2320.manager.ResourceManager;
import edu.westga.comp2320.resources.Laptop;

import java.util.Random;

public class CheckoutEvent extends Event {
    private ResourceManager resourceManager;

    /**
     * Creates a new CheckoutEvent at the specified time with access
     * to the ResourceManager.
     *
     * @param time The time the event occurs
     * @param resourceManager The ResourceManager from which a
     * resource is checked out
     */
    public CheckoutEvent(int time, ResourceManager resourceManager) {
        super(time);
        this.resourceManager = resourceManager;
    }

    @Override
    public Event processEvent() {
        Laptop currResource = this.resourceManager.getResource();
        if (currResource == null) {
            System.out.println("*** resource not available at time " + super.getTime());
            return null;
        }
        else {
            System.out.println("Checkout of " + currResource + " at time " + super.getTime());

            int randomNum = 20 + (int) (Math.random() * (60 - 20 + 1));
            int returnTime = super.getTime() + randomNum;

            return new ReturnEvent(returnTime, currResource);
        }
    }
}
