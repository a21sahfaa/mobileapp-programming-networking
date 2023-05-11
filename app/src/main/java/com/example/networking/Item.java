package com.example.networking;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.Arrays;

public class Item {
    @SerializedName("ID")
    private String ID;
    @SerializedName("name")
    private String name;
    @SerializedName("cost")
    private int feet;
    @SerializedName("size")
    private int meter;

    public Item(String name){
        this.name = name;
    }

    public String getTitle() {
        return name;
    }
}

