package edu.westga.comp2320.resources;

public class StudyRoom extends Resource{
    private static final String TYPE = "StudyRoom";
    private static int studyroomCount = 0;
    private String code;

    /**
     * Creates a new studyroom with a unique code.
     */
    public StudyRoom() {
        studyroomCount++;
        this.code = TYPE + "-" + studyroomCount;
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

