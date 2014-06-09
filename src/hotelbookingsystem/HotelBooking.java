package hotelbookingsystem;

import java.util.Scanner;

public class HotelBooking {

	Scanner scanner = new Scanner(System.in);
	int roomCounter = 0;

	public static void main (String [] args){

		HotelBooking booking = new HotelBooking ();
		booking.showMenu();

	}

	public void showMenu(){


		System.out.println("Please select one of the following, enter number 1 - 5:"
				+ " \n1. List all rooms"
				+ "\n2. List all booked rooms"
				+ "\n3. List all available rooms"
				+ "\n4. Book a room"
				+ "\n5. Exit menu");

		String input = scanner.nextLine();
		processMenuSelection(input);

	}

	public void processMenuSelection(String input){

		switch(input){
		case "1":  listAllRooms(); break;
		case "2": listAllBookedRooms(); break;
		case "3": listAllAvailableRooms(); break;
		case "4": bookRoom(); break;
		case "5": exitMenu(); break;
		
		default:  System.out.println("Invalid selection....");
					showMenu(); break;
		
		}
	}

	public void bookRoom(){
		
		System.out.println("How many beds do you require?");
		String input = scanner.nextLine();
		int noOfBeds = Integer.parseInt(input);
		
		if(roomCounter < 4){
			roomCounter++;
			Room room = new Room(roomCounter, noOfBeds, true);
			
		}
		else {
			System.out.println("Hotel is full");
			System.out.println("Rooms created are ");
		}
		
		
		showMenu();
	}

	public void listAllRooms(){

	}
	
	public void listAllBookedRooms(){
		
	}

	public void listAllAvailableRooms(){

	}

	public void exitMenu(){
		System.exit(0);
	}

}
