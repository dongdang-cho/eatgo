package kr.co.dongdang.eatgo.domain;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    
    private final String name;
    private final String address;
    private final Long id;
    private List<MenuItem> menuItems = new ArrayList<MenuItem>();

    public Restaurant(String name) {
        this.name = name;
        this.address = "";
        this.id = 0L;
    }

    public Restaurant(String name, String address) {
        this.name = name;
        this.address = address;
        this.id = 0L;
    }

    public Restaurant(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getInformation() {
        return name + " in " + address;
    }

    public String getAddress() {
        return address;
    }

    public Long getId() {
        return id;
    }

    public void addMenuItem(MenuItem item) {
        menuItems.add(item);
    }

    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<MenuItem> menuItems) {
        for(MenuItem menuItem : menuItems) {
            addMenuItem(menuItem);
        }
    }

}
