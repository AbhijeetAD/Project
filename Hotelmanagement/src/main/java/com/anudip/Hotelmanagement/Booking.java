package com.anudip.Hotelmanagement;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "bookings")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "booking_id")
    private int Booking_id;

    @Column(name = "children")
    private int children;

    @Column(name = "adults")
    private int adults;

    @Column(name = "check_in_date")
    @Temporal(TemporalType.DATE)
    private Date checkInDate;

    @Column(name = "check_out_date")
    @Temporal(TemporalType.DATE)
    private Date checkOutDate;

    @Column(name = "price")
    private int price;
    
    @Column(name="Breakfast")
    private String Breakfast;
    

	public int getBooking_Id() {
		return Booking_id;
	}

	public void setBooking_Id(int Booking_id) {
		this.Booking_id = Booking_id;
	}

	public int getChildren() {
		return children;
	}

	public void setChildren(int children) {
		this.children = children;
	}

	public int getAdults() {
		return adults;
	}

	public void setAdults(int adults) {
		this.adults = adults;
	}

	public Date getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(Date checkInDate) {
		this.checkInDate = checkInDate;
			
	}

	public Date getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	

	public String getBreakfast() {
		return Breakfast;
	}

	public void setBreakfast(String breakfast) {
		this.Breakfast = breakfast;
	}

	public Booking(int Booking_id, int children, int adults, Date checkInDate, Date checkOutDate, int price,String Breakfast) {
		super();
		this.Booking_id = Booking_id;
		this.children = children;
		this.adults = adults;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.price = price;
		this.Breakfast= Breakfast;
	}

	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
    
    
}
