package com.bioskop.main.model;

import java.sql.Date;

public class ScreeningModel extends Model {
	private int screeningid;
	private int filmid;
	private int roomid;
	private Date screeningdate;
	private int price;
	
	
	
	
	public ScreeningModel() {
		
	}
	
	
	public ScreeningModel(int screeningid, int filmid, int roomid, Date screeningdate, int price) {
		super();
		this.screeningid = screeningid;
		this.filmid = filmid;
		this.roomid = roomid;
		this.screeningdate = screeningdate;
		this.price = price;
	}
	public int getScreeningid() {
		return screeningid;
	}
	public void setScreeningid(int screeningid) {
		this.screeningid = screeningid;
	}
	public int getFilmid() {
		return filmid;
	}
	public void setFilmid(int filmid) {
		this.filmid = filmid;
	}
	public int getRoomid() {
		return roomid;
	}
	public void setRoomid(int roomid) {
		this.roomid = roomid;
	}
	public Date getScreeningdate() {
		return screeningdate;
	}
	public void setScreeningdate(Date screeningdate) {
		this.screeningdate = screeningdate;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	

}
