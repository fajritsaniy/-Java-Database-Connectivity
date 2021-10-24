package com.bioskop.main.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bioskop.main.model.BookingModel;
import com.bioskop.main.model.RoomModel;
import com.bioskop.main.utility.DataBaseConnection;



public class RoomDaoImplementation implements DaoInterfaces <RoomModel> {
	static Connection con = DataBaseConnection.getConnection();
	@Override
	public int save(RoomModel model) throws SQLException {
		// TODO Auto-generated method stub
		String query = "insert into room (room_id,maxof_seat) values (?,?)";
		PreparedStatement ps = con.prepareStatement(query);
		
		RoomModel room = (RoomModel) model;
		ps.setInt(1, room.getRoomid());
		ps.setInt(2, room.getMaxofseat());
		int result = ps.executeUpdate();
		
		return result;
	}

	@Override
	public void delete(RoomModel model) throws SQLException {
		// TODO Auto-generated method stub
		String query = "delete from room where room_id = ?";
		PreparedStatement ps = con.prepareStatement(query);
		
		ps.setInt(1, model.getRoomid());
		
		ps.executeUpdate();
		
	}

	@Override
	public void delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		String query = "delete from room where room_id = ?";
		PreparedStatement ps = con.prepareStatement(query);
		
		ps.setInt(1, id);
		
		ps.executeUpdate();
		
	}

	@Override
	public void update(RoomModel model) throws SQLException {
		// TODO Auto-generated method stub
		String query = "update room set maxof_seat = ?where room_id = ?";
		PreparedStatement ps = con.prepareStatement(query);
		
		ps.setInt(1, model.getMaxofseat());
		ps.setInt(2, model.getRoomid());
		
		
		ps.executeUpdate();
	}

	@Override
	public RoomModel getById(RoomModel model) throws SQLException {
		// TODO Auto-generated method stub
		String query = "select * from room where room_id = ?";
		PreparedStatement ps = con.prepareStatement(query);
		
		ps.setInt(1, model.getRoomid());
		ResultSet rs = ps.executeQuery();
		
		RoomModel room = new RoomModel();
		
		while(rs.next()) {
			room.setRoomid(rs.getInt("room_id"));
			room.setMaxofseat(rs.getInt("maxof_seat"));
		}
		
		return room;
	}

	@Override
	public RoomModel getById(int id) throws SQLException {
		// TODO Auto-generated method stub
		String query = "select * from room where room_id = ?";
		PreparedStatement ps = con.prepareStatement(query);
		
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		
		RoomModel room = new RoomModel();
		
		while(rs.next()) {
			room.setRoomid(rs.getInt("room_id"));
			room.setMaxofseat(rs.getInt("maxof_seat"));
		}
		
		return room;
	}

	@Override
	public List<RoomModel> getAll() throws SQLException {
		// TODO Auto-generated method stub
		String query = "select * from room";
		PreparedStatement ps = con.prepareStatement(query);
		
		ResultSet rs =  ps.executeQuery();
		
		List<RoomModel> lstRoom = new ArrayList<RoomModel>();
		
		while(rs.next()) {
			RoomModel room = new RoomModel();;
			
			room.setRoomid(rs.getInt("room_id"));
			room.setMaxofseat(rs.getInt("maxof_seat"));
			lstRoom.add(room);
		}
		
		return (lstRoom);
	}

}
