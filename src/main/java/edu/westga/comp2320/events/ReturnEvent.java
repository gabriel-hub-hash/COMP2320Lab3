package edu.westga.comp2320.events;

import edu.westga.comp2320.resources.Laptop;
import edu.westga.comp2320.resources.Resource;

public class ReturnEvent extends Event {
    private Resource resource;

    /**
     * Creates a new ReturnEvent with the specified time and resource
     * to be returned.
     *
     * @param time the scheduled time of the return event
     * @param resource the resource being returned
     */
    public ReturnEvent(int time, Resource resource){
        super(time);
        this.resource = resource;
    }

    @Override
    public Event processEvent() {
        System.out.println("Return of " + this.resource + " at time " + super.getTime());
        return null;
    }
}
