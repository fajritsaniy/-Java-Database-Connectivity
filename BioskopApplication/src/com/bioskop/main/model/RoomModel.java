package com.bioskop.main.model;

public class RoomModel extends Model{
	private int roomid;
	private int maxofseat;
	
	
	public RoomModel() {
		
	}
	
	
	public RoomModel(int roomid, int maxofseat) {
		super();
		this.roomid = roomid;
		this.maxofseat = maxofseat;
	}
	public int getRoomid() {
		return roomid;
	}
	public void setRoomid(int roomid) {
		this.roomid = roomid;
	}
	public int getMaxofseat() {
		return maxofseat;
	}
	public void setMaxofseat(int maxofseat) {
		this.maxofseat = maxofseat;
	}
	
	
	
}
