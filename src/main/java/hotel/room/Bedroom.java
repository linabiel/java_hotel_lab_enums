package hotel.room;

public class Bedroom extends Room{

    private RoomType roomType;
    private int roomNumber;
    private int nightlyRate;

    public Bedroom(RoomType roomType, int roomNumber, int nightlyRate) {
        super();
        this.roomType = roomType;
        this.roomNumber = roomNumber;
        this.nightlyRate = nightlyRate;
    }

    public Bedroom getBedroomList() {
        return this.getBedroomList();
    }

    public RoomType getRoomType() {
        return this.roomType;
    }

    public int getEnumCapacity() {
        return this.roomType.getEnumCapacity();
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }

    public int getNightlyRate() {
        return this.nightlyRate;
    }

}
