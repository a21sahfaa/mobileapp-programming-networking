package com.example.networking;

import java.util.ArrayList;
import java.util.Arrays;

public class Item {
    private String id;
    private String name;
    private String type;


    public Item(String id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public String getID() {
        return id;
    }

    public void setID(String ID) {
        this.id = id;
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

