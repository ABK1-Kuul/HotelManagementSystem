package pages.hotelmanagementjava.classes;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * The Booking class represents a transaction entity linking a Guest to a Room.
 * <p>
 * <b>OOP Principle - Abstraction:</b>
 * This class abstracts the complexities of a reservation into a simple object holding IDs and dates.
 * </p>
 */
public class Booking {
    private int guestId;
    private String roomNumber;
    private String checkInDate;
    private String checkOutDate;

    // Constructors
    public Booking(int guestId, String roomNumber, String checkInDate, String checkOutDate) {
        this.guestId = guestId;
        this.roomNumber = roomNumber;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    // Getters and Setters
    public int getGuestId() {
        return guestId;
    }

    public void setGuestId(int guestId) {
        this.guestId = guestId;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(String checkInDate) {
        this.checkInDate = checkInDate;
    }

    public String getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(String checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    // Additional methods
    public void addBooking() {
        String filePath = "data/booking.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(guestId + "/" + roomNumber + "/" + checkInDate + "/" + checkOutDate + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

