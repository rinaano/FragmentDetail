package com.example.mac.fragment4;

import java.io.Serializable;
import java.util.ArrayList;

public class Item implements Serializable {
    private static final long serialVersionUID = -6099312954099962806L;
    private String title;
    private String body;

    public Item(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    public static ArrayList<Item> getItems() {
        ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item("Item 1", "Item pertama"));
        items.add(new Item("Item 2", "Item kedua"));
        items.add(new Item("Item 3", "Item ketiga"));
        return items;
    }

    @Override
    public String toString() {
        return getTitle();
    }

}