package com.bioskop.main.dao;

import java.sql.SQLException;
import java.util.List;

import com.bioskop.main.model.Model;


//GENERATE JAVA 
public interface DaoInterfaces<T extends Model> {

	public int save(T model) throws SQLException;
	public void delete(T model) throws SQLException;
	public void delete(int id) throws SQLException;
	public void update(T model) throws SQLException;
	public T getById(T model) throws SQLException;
	public T getById(int id) throws SQLException;
	public List<T> getAll() throws SQLException;

}








// INTERFACE BIASA
//public interface DaoInterfaces {
//
//	public int add(Model model) throws SQLException;
//	public void delete(Model model) throws SQLException;
//	public void delete(int id) throws SQLException;
//	public void update(Model model) throws SQLException;
//	public Model getById(Model model) throws SQLException;
//	public Model getById(int id) throws SQLException;
//	public List<Model> getAll(Model model) throws SQLException;
	
	
	

