package com.anudip.Hotelmanagement;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Hotel")
@Access(value=AccessType.FIELD)

public class Hotelinfo {
	@Id
	 private int Hotel_id;
	 private String hotel_location;
	 private String hotel_name;
	private String num_of_rooms;
	private int rating;
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	
	Reception reception;
	
	public int getHotel_id() {
		return Hotel_id;
	}
	public void setHotel_id(int hotel_id) {
		Hotel_id = hotel_id;
	}
	public String getHotel_location() {
		return hotel_location;
	}
	public void setHotel_location(String hotel_location) {
		this.hotel_location = hotel_location;
	}
	public String getHotel_name() {
		return hotel_name;
	}
	public void setHotel_name(String hotel_name) {
		this.hotel_name = hotel_name;
	}
	public String getNum_of_rooms() {
		return num_of_rooms;
	}
	public void setNum_of_rooms(String num_of_rooms) {
		this.num_of_rooms = num_of_rooms;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public Reception getReception() {
		return reception;
	}
	public void setReception(Reception reception) {
		this.reception = reception;
	}
	public Hotelinfo(int hotel_id,String hotel_location, String hotel_name, String num_of_rooms, int rating) {
		super();
		this.Hotel_id=hotel_id;
		this.hotel_location = hotel_location;
		this.hotel_name = hotel_name;
		this.num_of_rooms = num_of_rooms;
		this.rating = rating;
		
	}
	public Hotelinfo() {
		
		// TODO Auto-generated constructor stub
	}
	
    
}
	