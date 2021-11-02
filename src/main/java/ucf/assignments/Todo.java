package ucf.assignments;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Ryan Turner
 */


public class Todo {
    private String id;
    private String name;
    private String description;
    private String dueDate;
    private boolean complete;

    /*
    * This class handles the individual todo items. You can
    * call the item by ID, get its name, or any other part of the
    * todo listing
    */


    public String getID() {
        return id;
    }
    public void setID(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setItemName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public boolean getComplete(boolean complete) {
        return complete;
    }

    public void setComplete(boolean Complete) {
        this.complete = complete;
    }
}
