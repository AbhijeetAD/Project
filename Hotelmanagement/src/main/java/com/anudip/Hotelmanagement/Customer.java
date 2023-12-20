package com.anudip.Hotelmanagement;


	
	import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.ManyToMany;

	@Entity
	public class Customer {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		 private int Customer_id;
		
		@Column(name="Customer_Aadhar_No",nullable=false,length=15)
		 private String Customer_aadhar_num;
		
		@Column(name="Customer_Name",nullable=false,length=50)
		private String Customer_name;
		
		@Column(name="Customer_Phone_No",nullable=false,length=15)
		private int Customer_phone_num;
		
		@Column(name="CheckIn_CheckOut")
		private String CheckIn_CheckOut;
		
		@ManyToMany(cascade=CascadeType.ALL)
		
		 List<Room> room=new ArrayList<Room>(); 
		
		public  List<Room> getRoom() {
			return room;
		}
		public void setRoom( List<Room> room) {
			this.room = room;
		}
		public int getCustomer_id() {
			return Customer_id;
		}
		public void setCustomer_id(int customer_id) {
			Customer_id = customer_id;
		}
		public String getCustomer_aadhar_num() {
			return Customer_aadhar_num;
		}
		public void setCustomer_aadhar_num(String customer_aadhar_num) {
			Customer_aadhar_num = customer_aadhar_num;
		}
		public String getCustomer_name() {
			return Customer_name;
		}
		public void setCustomer_name(String customer_name) {
			Customer_name = customer_name;
		}
		public int getCustomer_phone_num() {
			return Customer_phone_num;
		}
		public void setCustomer_phone_num(int customer_phone_num) {
			Customer_phone_num = customer_phone_num;
		}
		
		public String getCheckIn_CheckOut() {
			return CheckIn_CheckOut;
		}
		public void setCheckIn_CheckOut(String checkIn_CheckOut) {
			CheckIn_CheckOut = checkIn_CheckOut;
		}
		public Customer() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
			
		
		
		
		
		
		
}
