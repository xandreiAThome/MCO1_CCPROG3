package HotelClasses;

/**
 * Represents a reservation for a room
 */
public class Reservation {
    private String guest;
    private Date checkIn;
    private Date checkOut;
    private Room chosenRoom;
    private double totalPrice;

    /**
     * Initializes a Reservation object with the provided guest name, check-in date, check-out date, and the room chosen for reservation.
     * 
     * @param guest
     * @param checkIn
     * @param checkOut
     * @param chosenRoom
     */
    public Reservation(String guest, Date checkIn, Date checkOut, Room chosenRoom) {
        this.guest = guest;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.chosenRoom = chosenRoom;
        this.totalPrice = (checkOut.getDay() - checkIn.getDay() + 1) * chosenRoom.getPrice();
    }

    /**
     * Retrieves the guest name associated with the reservation.
     * 
     * @return guest of the current Reservation instance
     */
    public String getGuestName() {
        return this.guest;
    }

    /**
     * Retrieves the check-in date of the reservation.
     * 
     * @return checkIn of the current Reservation instance
     */
    public Date getCheckInDate() {
        return this.checkIn;
    }

    /**
     * Retrieves the check-out date of the reservation.
     * 
     * @return checkOut of the current Reservation instance
     */
    public Date getCheckOutDate() {
        return this.checkOut;
    }

    /**
     * Retrieves the room that has been reserved.
     * 
     * @return chosenRoom of the current Reservation instance
     */
    public Room getChosenRoom() {
        return this.chosenRoom;
    }

    /**
     * Retrieves the total price of the reservation.
     * 
     * @return the totalPrice of the reservation of the current Reservation instance
     */
    public double getTotalPrice() {
        return this.totalPrice;
    }
}