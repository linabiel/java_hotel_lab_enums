package hotel.room;

import hotel.Guest;

import java.util.ArrayList;

public class DiningRoom extends Room {
    private String name;
    private int capacity;
    private ArrayList<Guest> dinersList;


    public DiningRoom(String name, int capacity) {
        super();
        this.name = name;
        this.capacity = capacity;
        this.dinersList = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
