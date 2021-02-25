package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
	
	private Integer roomNumber;
	private Date checkin;
	private Date checkout;
	
	private static SimpleDateFormat sdf1 = new SimpleDateFormat ("dd/MM/yyyy");

	public Reservation() {
		
	}

	public Reservation(Integer roomNumber, Date checkin, Date checkout) {
		this.roomNumber = roomNumber;
		this.checkin = checkin;
		this.checkout = checkout;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckin() {
		return checkin;
	}


	public Date getCheckout() {
		return checkout;
	}

	public long duration(Date checkin, Date checkout) {
		long difference = checkin.getTime() - checkout.getTime();
		return TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS);		
	}
	
	public void updatedDates(Date checkin, Date checkout) {
		this.checkin = checkin;
		this.checkout = checkout;
	}
	
	@Override
	public String toString() {
		return "Room "
			+ roomNumber
			+ ", Check-In: "
			+ sdf1.format(checkin)
			+ ", Check-Out: "
			+ sdf1.format(checkout)
			+ ", Duration: "
			+ duration(checkin, checkout)
			+ "Nights ";
		
	}
	
}
