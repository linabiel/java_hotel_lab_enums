import hotel.Booking;
import hotel.room.Bedroom;
import org.junit.Before;
import org.junit.Test;

public class BookingTest {

    private Bedroom bedroom;
    private Booking booking;

    @Before
    public void before(){
        booking = new Booking(bedroom, 3);
    }


}
