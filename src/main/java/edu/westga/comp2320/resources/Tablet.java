package edu.westga.comp2320.resources;

public class Tablet extends Resource {
    private static final String TYPE = "Tablet";
    private static int tabletCount = 0;
    private String code;

    /**
     * Creates a new Tablet with a unique code.
     */
    public Tablet() {
        tabletCount++;
        this.code = TYPE + "-" + tabletCount;
    }

    @Override
    public String getCode() {
        return this.code;
    }

    @Override
    public String getType() {
        return TYPE;
    }

}

