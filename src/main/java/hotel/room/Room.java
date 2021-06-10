package hotel.room;

import hotel.Guest;

import java.util.ArrayList;

public abstract class Room {
    private ArrayList<Guest> guestList;

    public Room() {
        this.guestList = new ArrayList<>();
    }

    public ArrayList<Guest> getGuestList() {
        return this.guestList;
    }

    public int getGuestListSize() {
        return this.guestList.size();
    }



}