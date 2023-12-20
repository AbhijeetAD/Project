package com.anudip.Hotelmanagement;




import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;


import javax.persistence.Id;

import javax.persistence.ManyToMany;

@Entity
public class Room  {
	@Id
	@Column(name="Room_Id")
	private int room_id;
	
	@Column(name="Room_Price")
	private String room_price;
	
	@Column(name="Room_Bed_Size")
	private int room_bed_size;
	
	@Column(name="Room_Status")
	private String room_status;
	
	@ManyToMany(cascade=CascadeType.ALL,mappedBy="room")
	
	List<Customer> customer=new ArrayList<Customer>();
	
	
	
	public List<Customer> getCustomer() {
		return customer;
	}
	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}
	public int getRoom_id() {
		return room_id;
	}
	public void setRoom_id(int room_id) {
		this.room_id = room_id;
	}
	public String getRoom_price() {
		return room_price;
	}
	public void setRoom_price(String room_price) {
		this.room_price = room_price;
	}
	public String getRoom_status() {
		return room_status;
	}
	public void setRoom_status(String room_status) {
		this.room_status = room_status;
	}
	
	
	public int getRoom_bed_size() {
		return room_bed_size;
	}
	public void setRoom_bed_size(int room_bed_size) {
		this.room_bed_size = room_bed_size;
	}
	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
	