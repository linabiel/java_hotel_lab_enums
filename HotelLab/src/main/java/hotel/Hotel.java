package hotel;

import hotel.room.Bedroom;
import hotel.room.ConferenceRoom;
import hotel.room.DiningRoom;

import java.util.ArrayList;
import java.util.HashMap;

public class Hotel {

    private ArrayList<Bedroom> bedroomsList;
    private ArrayList<ConferenceRoom> conferenceRoomsList;
    private ArrayList<Booking> bookingList;
    private HashMap<String, DiningRoom> diningRoomList;

    public Hotel() {
        this.bedroomsList = new ArrayList<>();
        this.conferenceRoomsList = new ArrayList<>();
        this.bookingList = new ArrayList<>();
        this.diningRoomList = new HashMap<>();
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
//
//    private Bedroom getBedroom(Bedroom bedroom) {
//        return bedroom;
//    }

    public ArrayList<Booking> getBookingList() {
        return this.bookingList;
    }

    public int getBookingListSize(){
        return this.bookingList.size();
    }

    public void bookRoom(Booking booking) {
        this.bookingList.add(booking);
    }

    public double getTotalBill(Booking booking, Bedroom bedroom) {
        double nightlyRate = bedroom.getNightlyRate();
        double totalBill = nightlyRate * booking.getNightsBooked();
        return totalBill;
    }

    public void addDiningRoomToCollection(DiningRoom diningRoom) {
        String diningRoomName = diningRoom.getName();
        this.diningRoomList.put(diningRoomName, diningRoom);
    }

    public int getDiningRoomListSize() {
        return this.diningRoomList.size();
    }
}
