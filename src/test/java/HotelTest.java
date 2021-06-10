import hotel.Hotel;
import hotel.room.Bedroom;
import hotel.room.ConferenceRoom;
import hotel.room.RoomType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Bedroom bedroom;
    private ConferenceRoom conferenceRoom;

    @Before
    public void before() {
        hotel = new Hotel();
        bedroom = new Bedroom(RoomType.DOUBLE, 100);
        conferenceRoom = new ConferenceRoom(15, "Board Room");

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


}
