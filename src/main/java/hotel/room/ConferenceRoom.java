package hotel.room;

import hotel.Guest;

import java.util.ArrayList;

public class ConferenceRoom extends Room{

    private String name;
    private int capacity;

    public ConferenceRoom(int capacity, String name) {
        super();
        this.name = name;;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public String getRoomName() {
        return this.name;
    }
}
