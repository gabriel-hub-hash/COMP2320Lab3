package edu.westga.comp2320.resources;

/**
 * The Resource abstract class represents a generic resource in the resource center.
 * Each resource has a unique code and can be borrowed or returned.
 *
 * @author COMP2320
 */
public abstract class Resource implements Borrowable {
    protected boolean isAvailable;

    public Resource() {
        isAvailable = true;
    }

    @Override
    public void borrow() {
        isAvailable = false;
    }

    @Override
    public void returnItem() {
        isAvailable = true;
    }

    @Override
    public boolean isAvailable() {
        return isAvailable;
    }

    /**
     * Returns the unique code identifying this resource.
     *
     * @return the code of this resource
     */
    public abstract String getCode();

    /**
     * Returns the string representation of the type of this resource,
     * which is equal to the class name.
     *
     * @return the type of this resource
     */
    public abstract String getType();

    @Override
    public String toString() {
        return this.getCode();
    }
}
