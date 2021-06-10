import hotel.Booking;
import hotel.Hotel;
import hotel.room.Bedroom;
import hotel.room.ConferenceRoom;
import hotel.room.DiningRoom;
import hotel.room.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Bedroom bedroom;
    private ConferenceRoom conferenceRoom;
    private Booking booking;
    private DiningRoom diningRoom;

    @Before
    public void before() {
        hotel = new Hotel();
        bedroom = new Bedroom(RoomType.DOUBLE, 100, 50);
        conferenceRoom = new ConferenceRoom(15, "Board Room");
        booking = new Booking(bedroom, 2);
        diningRoom = new DiningRoom("CodeClan Cafe", 25);

    }

    @Test
    public void hotelHasBedroomList() {
        assertEquals(0, hotel.getBedroomListSize());
    }

    @Test
    public void hotelHasConfRoomList() {
        assertEquals(0, hotel.getConferenceRoomListSize());
    }

    @Test
    public void hotelCanAddBedroom() {
        hotel.addBedroom(bedroom);
        assertEquals(1, hotel.getBedroomListSize());
    }

    @Test
    public void hotelCanAddConfRoom() {
        hotel.addConferenceRoom(conferenceRoom);
        assertEquals(1, hotel.getConferenceRoomListSize());
    }

    @Test
    public void canBookRoom() {
        hotel.bookRoom(booking);
        assertEquals(1, hotel.getBookingListSize());
    }

    @Test
    public void canGetTotalBill() {
        hotel.bookRoom(booking);
        assertEquals(100, hotel.getTotalBill(booking, bedroom), 0.00);
    }

    @Test
    public void canAddDiningRoomToCollection() {
        hotel.addDiningRoomToCollection(diningRoom);
        assertEquals(1, hotel.getDiningRoomListSize());
    }

}
