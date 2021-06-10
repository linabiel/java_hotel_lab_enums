package hotel.room;

import hotel.Guest;

import java.util.ArrayList;

public class ConferenceRoom extends Room{

    private ArrayList<Guest> guestList;
    private String name;
    private int capacity;

    public ConferenceRoom(int capacity, String name) {
        super();
        this.name = name;;
        this.capacity = capacity;
    }
}
