package com.example.networking;
public class Item {
    private String ID;
    private String name;
    private String type;

    public Item(String ID, String name, String type) {
        this.ID = ID;
        this.name = name;
        this.type = type;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

