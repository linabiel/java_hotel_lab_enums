import hotel.room.Bedroom;
import org.junit.Before;
import org.junit.Test;
import hotel.room.Room;
import hotel.room.RoomType;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    private Bedroom bedroom;

    @Before
    public void before(){
        bedroom = new Bedroom(1, );
    }


//    @Test
//    public void roomTypeTypo() {
//        hotel.room.Room newRoom = new hotel.room.Room("Doouble");
//        assertEquals("Doouble", newRoom.getRoomType());
//    }
//
//    @Test
//    public void roomCanBeBanana() {
//        hotel.room.Room bananaRoom = new hotel.room.Room("banana");
//        assertEquals("banana", bananaRoom.getRoomType());
//    }
}
