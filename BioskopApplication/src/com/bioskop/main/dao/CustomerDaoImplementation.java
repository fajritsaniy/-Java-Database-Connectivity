package com.bioskop.main.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bioskop.main.model.BookingModel;
import com.bioskop.main.model.CustomerModel;
import com.bioskop.main.utility.DataBaseConnection;

public class CustomerDaoImplementation implements DaoInterfaces<CustomerModel> {
	static Connection con = DataBaseConnection.getConnection();

	@Override
	public int save(CustomerModel model) throws SQLException {
		// TODO Auto-generated method stub
		String query = "insert into customer (first_name, last_name , no_hp, address, email, birthdate ) values (?,?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(query);
		
		CustomerModel customer = (CustomerModel) model;
		ps.setString(1, customer.getFirstname());
		ps.setString(2, customer.getLastname());
		ps.setString(3, customer.getNohp());
		ps.setString(4, customer.getAddress());
		ps.setString(5, customer.getEmail());
		ps.setDate(6, customer.getBirthdate());
		
		int result = ps.executeUpdate();
		
		return result;
	}

	@Override
	public void delete(CustomerModel model) throws SQLException {
		// TODO Auto-generated method stub
		String query = "delete from customer where customer_id = ?";
		PreparedStatement ps = con.prepareStatement(query);
		
		ps.setInt(1, model.getCustomerid());
		
		ps.executeUpdate();
		
	}

	@Override
	public void delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		String query = "delete from customer where customer_id = ?";
		PreparedStatement ps = con.prepareStatement(query);
		
		ps.setInt(1, id);
		
		ps.executeUpdate();
	}

	@Override
	public void update(CustomerModel model) throws SQLException {
		// TODO Auto-generated method stub
		String query = "update customer set first_name = ?, last_name= ? , no_hp= ?, address= ?, email= ?, birthdate= ?, where customer_id = ?";
		PreparedStatement ps = con.prepareStatement(query);
		
		
		ps.setString(1, model.getFirstname());
		ps.setString(2, model.getLastname());
		ps.setString(3, model.getNohp());
		ps.setString(4, model.getAddress());
		ps.setString(5, model.getEmail());
		ps.setDate(6, model.getBirthdate());
		ps.setInt(7, model.getCustomerid());
		
		
		ps.executeUpdate();
		
	}

	@Override
	public CustomerModel getById(CustomerModel model) throws SQLException {
		// TODO Auto-generated method stub
		String query = "select * from customer where customer_id = ?";
		PreparedStatement ps = con.prepareStatement(query);
		
		ps.setInt(1, model.getCustomerid());
		ResultSet rs = ps.executeQuery();
		
		CustomerModel customer = new CustomerModel();
		
		while(rs.next()) {
			
			customer.setCustomerid(rs.getInt("customer_id"));
			customer.setFirstname(rs.getString("first_name"));
			customer.setLastname(rs.getString("last_name"));
			customer.setNohp(rs.getString("no_hp"));
			customer.setAdress(rs.getString("address"));
			customer.setEmail(rs.getString("email"));
			customer.setBirthdate(rs.getDate("birthdate"));
			
			
		}
		
		return customer;
	}

	@Override
	public CustomerModel getById(int id) throws SQLException {
		// TODO Auto-generated method stub
		String query = "select * from customer where customer_id = ?";
		PreparedStatement ps = con.prepareStatement(query);
		
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		
		CustomerModel customer = new CustomerModel();
		
		while(rs.next()) {
			
			customer.setCustomerid(rs.getInt("customer_id"));
			customer.setFirstname(rs.getString("first_name"));
			customer.setLastname(rs.getString("last_name"));
			customer.setNohp(rs.getString("no_hp"));
			customer.setAdress(rs.getString("address"));
			customer.setEmail(rs.getString("email"));
			customer.setBirthdate(rs.getDate("birthdate"));
			
			
		}
		
		return customer;
	}

	@Override
	public List<CustomerModel> getAll() throws SQLException {
		// TODO Auto-generated method stub
		String query = "select * from customer";
		PreparedStatement ps = con.prepareStatement(query);
		
		ResultSet rs =  ps.executeQuery();
		
		List<CustomerModel> lstCustomer = new ArrayList<CustomerModel>();
		
		while(rs.next()) {
			CustomerModel customer = new CustomerModel();
			
			customer.setCustomerid(rs.getInt("customer_id"));
			customer.setFirstname(rs.getString("first_name"));
			customer.setLastname(rs.getString("last_name"));
			customer.setNohp(rs.getString("no_hp"));
			customer.setAdress(rs.getString("address"));
			customer.setEmail(rs.getString("email"));
			customer.setBirthdate(rs.getDate("birthdate"));
			lstCustomer.add(customer);
		}
		
		return (lstCustomer);
	}

}
