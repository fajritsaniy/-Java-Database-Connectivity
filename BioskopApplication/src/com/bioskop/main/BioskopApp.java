package com.bioskop.main;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.List;

import com.bioskop.main.dao.BookingDaoImplementation;
import com.bioskop.main.dao.CustomerDaoImplementation;
import com.bioskop.main.dao.FilmDaoImplementation;
import com.bioskop.main.dao.RoomDaoImplementation;
import com.bioskop.main.dao.ScreeningDaoImplementation;
import com.bioskop.main.dao.SeatDaoImplementation;
import com.bioskop.main.model.BookingModel;
import com.bioskop.main.model.CustomerModel;
import com.bioskop.main.model.FilmModel;
import com.bioskop.main.model.RoomModel;
import com.bioskop.main.model.ScreeningModel;
import com.bioskop.main.model.SeatModel;
import com.bioskop.main.utility.DataBaseConnection;

public class BioskopApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
//			Statement st = DataBaseConnection.getConnection().createStatement();
//			ResultSet rs = st.executeQuery("SELECT * FROM film");
//			
//			while (rs.next()) {
//				System.out.println(rs.getString(2));
//				
//			}
//			
//			FilmModel film = new FilmModel();
//			film.setFilmName("Beranak Dalam Kardus");
//			film.setCategory("Horror");
//			film.setSubTitle("Sunda");
//			
//			FilmDaoImplementation filmDao = new FilmDaoImplementation();
//			filmDao.add(film);
			
			
			//FILM
			FilmModel film = new FilmModel();
			FilmDaoImplementation filmDao = new FilmDaoImplementation();
			List <FilmModel> lstFilm = filmDao.getAll();
			
			for (FilmModel filmModel : lstFilm) {
				System.out.println(filmModel.getFilmId() + " | "+ filmModel.getFilmName()+ " | " +filmModel.getCategory()+" | "+ filmModel.getSubTitle());
				System.out.println();
			}
			
//			FilmModel updateFilm = new FilmModel();
//			updateFilm.setFilmId(6);
//			updateFilm.setFilmName("Suzanna");
//			updateFilm.setCategory("Horror");
//			updateFilm.setSubTitle("Indonesia");
//			filmDao.update(updateFilm);
			
			
			//BOOKING
			BookingModel booking = new BookingModel();
			BookingDaoImplementation bookingDao = new BookingDaoImplementation();
			List <BookingModel> lstBooking = bookingDao.getAll();
			
			for (BookingModel bookingModel : lstBooking) {
				System.out.println(bookingModel.getBookingid() + " | "+ bookingModel.getSeatid()+ " | " +bookingModel.getScreeningid()+" | "+ bookingModel.getCustomerid());
				System.out.println();
				
			}
			
			//CUSTOMER
			CustomerModel customer = new CustomerModel();
			CustomerDaoImplementation customerDao = new CustomerDaoImplementation();
			List<CustomerModel> lstCustomer = customerDao.getAll();
			
			for (CustomerModel customerModel : lstCustomer) {
				System.out.println(customerModel.getCustomerid() + " | " + customerModel.getFirstname() + " | " + customerModel.getLastname()+ " | " + customerModel.getNohp()+ " | " + customerModel.getAddress()+" | "+ customerModel.getEmail()+" | "+customerModel.getBirthdate());
				System.out.println();
			}
			
			//ROOM
			RoomModel room = new RoomModel();
			RoomDaoImplementation roomDao = new RoomDaoImplementation();
			List<RoomModel> lstRoom = roomDao.getAll();
			
			for (RoomModel roomModel : lstRoom) {
				System.out.println(roomModel.getRoomid()+" | "+roomModel.getMaxofseat());
				System.out.println();
			}
			
			
			//SCREENING
			ScreeningModel screening = new ScreeningModel();
			ScreeningDaoImplementation screeningDao = new ScreeningDaoImplementation();
			List<ScreeningModel> lstScreening = screeningDao.getAll();
			
			for (ScreeningModel screeningModel : lstScreening) {
				System.out.println(screeningModel.getScreeningid()+" | "+screeningModel.getFilmid()+" | "+screeningModel.getRoomid()+" | "+screeningModel.getScreeningdate()+" | "+screeningModel.getPrice());
				System.out.println();
			}
			
			//SEAT
			SeatModel seat = new SeatModel();
			SeatDaoImplementation seatDao = new SeatDaoImplementation();
			List<SeatModel> lstSeat = seatDao.getAll();
			
			for (SeatModel seatModel : lstSeat) {
				System.out.println(seatModel.getSeatid()+" | "+seatModel.getRoomseatid());
				System.out.println();
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}

}
