package com.bioskop.main.model;

public class BookingModel extends Model {

	private int bookingid;
	private int seatid;
	private int screeningid;
	private int customerid;
	
	
	
	public BookingModel() {
		
	}
	
	public BookingModel(int bookingid, int seatid, int screeningid, int customerid) {
		super();
		this.bookingid = bookingid;
		this.seatid = seatid;
		this.screeningid = screeningid;
		this.customerid = customerid;
	}
	
	
	public int getBookingid() {
		return bookingid;
	}
	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}
	public int getSeatid() {
		return seatid;
	}
	public void setSeatid(int seatid) {
		this.seatid = seatid;
	}
	public int getScreeningid() {
		return screeningid;
	}
	public void setScreeningid(int screeningid) {
		this.screeningid = screeningid;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	
	
}
