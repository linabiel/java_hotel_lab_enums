package hotel.room;

import hotel.Guest;

import java.util.ArrayList;

public class Bedroom extends Room{

    private RoomType roomType;
    private int roomNumber;

    public Bedroom(RoomType roomType, int roomNumber) {
        super();
        this.roomType = roomType;
        this.roomNumber = roomNumber;
    }
}
