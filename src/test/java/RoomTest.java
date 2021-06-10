import hotel.Guest;
import hotel.Hotel;
import hotel.room.Bedroom;
import hotel.room.ConferenceRoom;
import org.junit.Before;
import org.junit.Test;
import hotel.room.Room;
import hotel.room.RoomType;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    private Bedroom bedroom;
    private ConferenceRoom conferenceRoom;
    private Guest guest;
    private Hotel hotel;

    @Before
    public void before() {
        bedroom = new Bedroom(RoomType.DOUBLE, 100);
        conferenceRoom = new ConferenceRoom(15, "Board Room");
        guest = new Guest("Craig");
        hotel = new Hotel();
    }

    @Test
    public void canGetBedroomType() {
        assertEquals(RoomType.DOUBLE, bedroom.getRoomType());
    }

    @Test
    public void canGetConfRoomCapacity() {
        assertEquals(15, conferenceRoom.getCapacity());
    }

    @Test
    public void confRoomHasName () {
        assertEquals("Board Room", conferenceRoom.getRoomName());
    }

    @Test
    public void bedroomTypeHasCapacity() {
        assertEquals(2, bedroom.getEnumCapacity());
    }

    @Test
    public void bedroomHasRoomNumber() {
        assertEquals(100, bedroom.getRoomNumber());
    }

    @Test
    public void bedroomHasGuestList() {
        assertEquals(0, bedroom.getGuestListSize());
    }

    @Test
    public void conferenceRoomGuestList() {
        assertEquals(0, conferenceRoom.getGuestListSize());
    }

    @Test
    public void canAddGuestToBedroom() {
        hotel.addGuestToBedroom(bedroom, guest);
        assertEquals(1, bedroom.getGuestListSize());
    }

    @Test
    public void canAddGuestToConfRoom() {
        hotel.addGuestToConfRoom(conferenceRoom, guest);
        assertEquals(1, conferenceRoom.getGuestListSize());
    }

    @Test
    public void canRemoveGuestFromBedroom() {
        hotel.addGuestToBedroom(bedroom, guest);
        hotel.removeGuestFromBedroom(bedroom, guest);
        assertEquals(0, bedroom.getGuestListSize());
    }

    @Test
    public void canRemoveGuestFromConfRoom() {
        hotel.addGuestToConfRoom(conferenceRoom, guest);
        hotel.removeGuestFromConfRoom(conferenceRoom, guest);
        assertEquals(0, conferenceRoom.getGuestListSize());
    }


}
