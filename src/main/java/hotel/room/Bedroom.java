package hotel.room;

public class Bedroom extends Room{

    private RoomType roomType;
    private int roomNumber;

    public Bedroom(RoomType roomType, int roomNumber) {
        super();
        this.roomType = roomType;
        this.roomNumber = roomNumber;
    }

    public Bedroom getBedroomList() {
        return this.getBedroomList();
    }

    public RoomType getRoomType() {
        return this.roomType;
    }

    public int getEnumCapacity() {
        return this.roomType.getCapacity();
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }

}
