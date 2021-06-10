package hotel;

import hotel.room.Bedroom;
import hotel.room.ConferenceRoom;

import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedroomsList;
    private ArrayList<ConferenceRoom> conferenceRoomsList;


    public Hotel() {
        this.bedroomsList = new ArrayList<>();
        this.conferenceRoomsList = new ArrayList<>();
    }

//    public void checkInGuest(Guest guest, Bedroom bedroom) {
//        Bedroom selectedBedroom = this.bedroomsList.get(1);
//        selectedBedroom.add(guest);
//        bedroomsList.add(selectedBedroom);
//
//    }
}
