package com.bioskop.main.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bioskop.main.model.BookingModel;
import com.bioskop.main.model.FilmModel;
import com.bioskop.main.utility.DataBaseConnection;

public class BookingDaoImplementation implements DaoInterfaces<BookingModel> {
	
	
	static Connection con = DataBaseConnection.getConnection();

	@Override
	public int save(BookingModel model) throws SQLException {
		// TODO Auto-generated method stub
			String query = "insert into booking (seat_id,screening_id,customer_id) values (?,?,?)";
			PreparedStatement ps = con.prepareStatement(query);
			
			BookingModel booking = (BookingModel) model;
			ps.setInt(1, booking.getSeatid());
			ps.setInt(2, booking.getScreeningid());
			ps.setInt(3, booking.getCustomerid());
			int result = ps.executeUpdate();
			
			return result;
	}

	@Override
	public void delete(BookingModel model) throws SQLException {
		// TODO Auto-generated method stub
		String query = "delete from booking where booking_id = ?";
		PreparedStatement ps = con.prepareStatement(query);
		
		ps.setInt(1, model.getBookingid());
		
		ps.executeUpdate();
		
	}

	@Override
	public void delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		String query = "delete from booking where booking_id = ?";
		PreparedStatement ps = con.prepareStatement(query);
		
		ps.setInt(1, id);
		
		ps.executeUpdate();
		
	}

	@Override
	public void update(BookingModel model) throws SQLException {
		// TODO Auto-generated method stub
		String query = "update booking set seat_id = ?, screening_id = ?, customer_id = ?, where booking_id = ?";
		PreparedStatement ps = con.prepareStatement(query);
		
		
		ps.setInt(1, model.getSeatid());
		ps.setInt(2, model.getScreeningid());
		ps.setInt(3, model.getCustomerid());
		ps.setInt(4, model.getBookingid());
		
		ps.executeUpdate();
		
	}

	@Override
	public BookingModel getById(BookingModel model) throws SQLException {
		// TODO Auto-generated method stub
		String query = "select * from booking where booking_id = ?";
		PreparedStatement ps = con.prepareStatement(query);
		
		ps.setInt(1, model.getBookingid());
		ResultSet rs = ps.executeQuery();
		
		BookingModel booking =  new BookingModel();
		
		while(rs.next()) {
			booking.setBookingid(rs.getInt("booking_id"));
			booking.setSeatid(rs.getInt("seat_id"));
			booking.setScreeningid(rs.getInt("screening_id"));
			booking.setCustomerid(rs.getInt("customer_id"));
		}
		
		return booking;
	}

	@Override
	public BookingModel getById(int id) throws SQLException {
		// TODO Auto-generated method stub
		String query = "select * from booking where booking_id = ?";
		PreparedStatement ps = con.prepareStatement(query);
		
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		
		BookingModel booking =  new BookingModel();
		
		while(rs.next()) {
			booking.setBookingid(rs.getInt("booking_id"));
			booking.setSeatid(rs.getInt("seat_id"));
			booking.setScreeningid(rs.getInt("screening_id"));
			booking.setCustomerid(rs.getInt("customer_id"));
		}
		
		return booking;
	}

	@Override
	public List<BookingModel> getAll() throws SQLException {
		// TODO Auto-generated method stub
		String query = "select * from booking";
		PreparedStatement ps = con.prepareStatement(query);
		
		ResultSet rs =  ps.executeQuery();
		
		List<BookingModel> lstBooking = new ArrayList<BookingModel>();
		
		while(rs.next()) {
			BookingModel booking =  new BookingModel();
			
			booking.setBookingid(rs.getInt("booking_id"));
			booking.setSeatid(rs.getInt("seat_id"));
			booking.setScreeningid(rs.getInt("screening_id"));
			booking.setCustomerid(rs.getInt("customer_id"));
			lstBooking.add(booking);
		}
		
		return (lstBooking);
	}

	

}
