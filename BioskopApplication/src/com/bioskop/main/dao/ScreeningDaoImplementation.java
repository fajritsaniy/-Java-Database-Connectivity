package com.bioskop.main.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bioskop.main.model.RoomModel;
import com.bioskop.main.model.ScreeningModel;
import com.bioskop.main.utility.DataBaseConnection;

public class ScreeningDaoImplementation implements DaoInterfaces<ScreeningModel> {
	static Connection con = DataBaseConnection.getConnection();

	@Override
	public int save(ScreeningModel model) throws SQLException {
		// TODO Auto-generated method stub
		String query = "insert into screening (film_id,room_id,screening_date,price) values (?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(query);
		
		ScreeningModel screening = (ScreeningModel) model;
		ps.setInt(1, screening.getFilmid());
		ps.setInt(2, screening.getRoomid());
		ps.setDate(3, screening.getScreeningdate());
		ps.setInt(4, screening.getPrice());
		int result = ps.executeUpdate();
		
		return result;
	}

	@Override
	public void delete(ScreeningModel model) throws SQLException {
		// TODO Auto-generated method stub
		String query = "delete from screening where screening_id = ?";
		PreparedStatement ps = con.prepareStatement(query);
		
		ps.setInt(1, model.getScreeningid());
		
		ps.executeUpdate();
	}

	@Override
	public void delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		String query = "delete from screening where screening_id = ?";
		PreparedStatement ps = con.prepareStatement(query);
		
		ps.setInt(1, id);
		
		ps.executeUpdate();
	}

	@Override
	public void update(ScreeningModel model) throws SQLException {
		// TODO Auto-generated method stub
		String query = "update screening set film_id = ?,room_id = ?,screening_date = ?,price = ? where screening_id = ?";
		PreparedStatement ps = con.prepareStatement(query);
		
		ps.setInt(1, model.getFilmid());
		ps.setInt(2, model.getRoomid());
		ps.setDate(3, model.getScreeningdate());
		ps.setInt(4, model.getPrice());
		ps.setInt(5, model.getScreeningid());
		
		
		ps.executeUpdate();
	}

	@Override
	public ScreeningModel getById(ScreeningModel model) throws SQLException {
		// TODO Auto-generated method stub
		String query = "select * from screening where screening_id = ?";
		PreparedStatement ps = con.prepareStatement(query);
		
		ps.setInt(1, model.getRoomid());
		ResultSet rs = ps.executeQuery();
		
		ScreeningModel screening = new ScreeningModel();
		
		while(rs.next()) {
			
			screening.setScreeningid(rs.getInt("screening_id"));
			screening.setFilmid(rs.getInt("film_id"));
			screening.setRoomid(rs.getInt("room_id"));
			screening.setScreeningdate(rs.getDate("screening_date"));
			screening.setPrice(rs.getInt("price"));
		}
		
		return screening;
	}

	@Override
	public ScreeningModel getById(int id) throws SQLException {
		// TODO Auto-generated method stub
		String query = "select * from screening where screening_id = ?";
		PreparedStatement ps = con.prepareStatement(query);
		
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		
		ScreeningModel screening = new ScreeningModel();
		
		while(rs.next()) {
			
			screening.setScreeningid(rs.getInt("screening_id"));
			screening.setFilmid(rs.getInt("film_id"));
			screening.setRoomid(rs.getInt("room_id"));
			screening.setScreeningdate(rs.getDate("screening_date"));
			screening.setPrice(rs.getInt("price"));
		}
		
		return screening;
	}

	@Override
	public List<ScreeningModel> getAll() throws SQLException {
		// TODO Auto-generated method stub
		String query = "select * from screening";
		PreparedStatement ps = con.prepareStatement(query);
		
		ResultSet rs =  ps.executeQuery();
		
		List<ScreeningModel> lstScreening = new ArrayList<ScreeningModel>();
		
		while(rs.next()) {
			ScreeningModel screening = new ScreeningModel();;
			
			screening.setScreeningid(rs.getInt("screening_id"));
			screening.setFilmid(rs.getInt("film_id"));
			screening.setRoomid(rs.getInt("room_id"));
			screening.setScreeningdate(rs.getDate("screening_date"));
			screening.setPrice(rs.getInt("price"));
			lstScreening.add(screening);
		}
		
		return (lstScreening);
	}

}
