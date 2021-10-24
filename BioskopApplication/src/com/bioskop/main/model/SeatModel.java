package com.bioskop.main.model;

public class SeatModel extends Model{
	private int seatid;
	private int roomseatid;
	
	
	public SeatModel() {
		
	}
	
	
	public SeatModel(int seatid, int roomseatid) {
		super();
		this.seatid = seatid;
		this.roomseatid = roomseatid;
	}
	public int getSeatid() {
		return seatid;
	}
	public void setSeatid(int seatid) {
		this.seatid = seatid;
	}
	public int getRoomseatid() {
		return roomseatid;
	}
	public void setRoomseatid(int roomseatid) {
		this.roomseatid = roomseatid;
	}
	
	
	
}
