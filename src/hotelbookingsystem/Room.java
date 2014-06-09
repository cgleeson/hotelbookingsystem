package hotelbookingsystem;

public class Room {
	
	private int roomNumber;
	private int numberOfBeds;
	private boolean isBooked;
	
	public int getRoom() {
		return roomNumber;
	}

	public void setRoom(int room) {
		this.roomNumber = room;
	}

	public int getNumberOfBeds() {
		return numberOfBeds;
	}

	public void setNumberOfBeds(int numberOfBeds) {
		this.numberOfBeds = numberOfBeds;
	}

	public boolean isBooked() {
		return isBooked;
	}

	public void setBooked(boolean isBooked) {
		this.isBooked = isBooked;
	}

	public Room(int room, int numberOfBeds, boolean isBooked) {
		super();
		this.roomNumber = room;
		this.numberOfBeds = numberOfBeds;
		this.isBooked = isBooked;
	}
	
	

}
