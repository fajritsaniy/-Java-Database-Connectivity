package com.bioskop.main.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bioskop.main.model.RoomModel;
import com.bioskop.main.model.SeatModel;
import com.bioskop.main.utility.DataBaseConnection;

public class SeatDaoImplementation implements DaoInterfaces<SeatModel> {
	
	static Connection con = DataBaseConnection.getConnection();

	@Override
	public int save(SeatModel model) throws SQLException {
		// TODO Auto-generated method stub
		String query = "insert into seat (seat_id,room_seat_id) values (?,?)";
		PreparedStatement ps = con.prepareStatement(query);
		
		SeatModel seat = (SeatModel) model;
		ps.setInt(1, seat.getSeatid());
		ps.setInt(2, seat.getRoomseatid());
		int result = ps.executeUpdate();
		
		return result;
	}

	@Override
	public void delete(SeatModel model) throws SQLException {
		// TODO Auto-generated method stub
		String query = "delete from seat where seat_id = ?";
		PreparedStatement ps = con.prepareStatement(query);
		
		ps.setInt(1, model.getSeatid());
		
		ps.executeUpdate();
	}

	@Override
	public void delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		String query = "delete from seat where seat_id = ?";
		PreparedStatement ps = con.prepareStatement(query);
		
		ps.setInt(1, id);
		
		ps.executeUpdate();
	}

	@Override
	public void update(SeatModel model) throws SQLException {
		// TODO Auto-generated method stub
		String query = "update seat set room_seat_id = ? where seat_id = ?";
		PreparedStatement ps = con.prepareStatement(query);
		
		ps.setInt(1, model.getRoomseatid());
		ps.setInt(2, model.getSeatid());
		
		
		ps.executeUpdate();
	}

	@Override
	public SeatModel getById(SeatModel model) throws SQLException {
		// TODO Auto-generated method stub
		String query = "select * from seat where seat_id = ?";
		PreparedStatement ps = con.prepareStatement(query);
		
		ps.setInt(1, model.getSeatid());
		ResultSet rs = ps.executeQuery();
		
		SeatModel seat = new SeatModel();
		
		while(rs.next()) {
			seat.setSeatid(rs.getInt("seat_id"));
			seat.setRoomseatid(rs.getInt("room_seat_id"));
		}
		return seat;
	}

	@Override
	public SeatModel getById(int id) throws SQLException {
		// TODO Auto-generated method stub
		String query = "select * from seat where seat_id = ?";
		PreparedStatement ps = con.prepareStatement(query);
		
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		
		SeatModel seat = new SeatModel();
		
		while(rs.next()) {
			seat.setSeatid(rs.getInt("seat_id"));
			seat.setRoomseatid(rs.getInt("room_seat_id"));
		}
		return seat;
	}

	@Override
	public List<SeatModel> getAll() throws SQLException {
		// TODO Auto-generated method stub
		String query = "select * from seat";
		PreparedStatement ps = con.prepareStatement(query);
		
		ResultSet rs =  ps.executeQuery();
		
		List<SeatModel> lstSeat = new ArrayList<SeatModel>();
		
		while(rs.next()) {
			SeatModel seat = new SeatModel();;
			
			seat.setSeatid(rs.getInt("seat_id"));
			seat.setRoomseatid(rs.getInt("room_seat_id"));
			lstSeat.add(seat);
		}
		
		return (lstSeat);
	}
	
	

}
