package hotel.room;

import hotel.Guest;

import java.util.ArrayList;

public abstract class Room {
    private ArrayList<Guest> guestList;
    private int capacity;

    public Room() {
        this.guestList = new ArrayList<>();
        this.capacity = capacity;
    }

    public ArrayList<Guest> getGuestList() {
        return this.guestList;
    }

    public int getGuestListSize() {
        return this.guestList.size();
    }

    public int getCapacity() {
        return this.capacity;
    }

}