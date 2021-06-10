package hotel;

import hotel.room.Bedroom;
import hotel.room.ConferenceRoom;
import hotel.room.Room;

import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedroomsList;
    private ArrayList<ConferenceRoom> conferenceRoomsList;
    private ArrayList<Booking> bookingList;


    public Hotel() {
        this.bedroomsList = new ArrayList<>();
        this.conferenceRoomsList = new ArrayList<>();
        this.bookingList = new ArrayList<>();
    }

    public int getBedroomListSize() {
        return this.bedroomsList.size();
    }

    public int getConferenceRoomListSize() {
        return this.conferenceRoomsList.size();
    }

    public void addBedroom(Bedroom bedroom) {
        this.bedroomsList.add(bedroom);
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom) {
        this.conferenceRoomsList.add(conferenceRoom);
    }

    public void addGuestToBedroom(Bedroom bedroom, Guest guest) {
        ArrayList<Guest> guestList = bedroom.getGuestList();
        guestList.add(guest);
    }

    public void addGuestToConfRoom(ConferenceRoom conferenceRoom, Guest guest) {
        ArrayList<Guest> guestList = conferenceRoom.getGuestList();
        guestList.add(guest);
    }

    public void removeGuestFromBedroom(Bedroom bedroom, Guest guest) {
        ArrayList<Guest> guestList = bedroom.getGuestList();
        guestList.remove(guest);
    }

    public void removeGuestFromConfRoom(ConferenceRoom conferenceRoom, Guest guest) {
        ArrayList<Guest> guestList = conferenceRoom.getGuestList();
        guestList.remove(guest);
    }

    private Bedroom getBedroom(Bedroom bedroom) {
        return bedroom;
    }

    public ArrayList<Booking> getBookingList() {
        return this.bookingList;
    }

    public int getBookingListSize(){
        return this.bookingList.size();
    }

    public void bookRoom(Booking booking) {
        this.bookingList.add(booking);
    }


}
