package com.anudip.Hotelmanagement;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 Configuration conf=new Configuration().configure().addAnnotatedClass(Customer.class).addAnnotatedClass(Room.class).addAnnotatedClass(Reception.class).addAnnotatedClass(Hotelinfo.class).addAnnotatedClass(Reviews.class).addAnnotatedClass(Booking.class);
	     
    	 SessionFactory ss=conf.buildSessionFactory();
	       Session s=ss.openSession();
	       Transaction t=s.beginTransaction(); 
	       
    	Customer c1=new Customer();
    	c1.setCustomer_id(01);
    	c1.setCustomer_aadhar_num("7017234567");
    	c1.setCustomer_name("Abhijeet");
    	c1.setCustomer_phone_num(1234567654);
    	c1.setCheckIn_CheckOut("CheckIn");
    	Customer c2=new Customer();
    	c2.setCustomer_id(02);
    	c2.setCustomer_aadhar_num("1234561421");
    	c2.setCustomer_name("vilash");
    	c2.setCustomer_phone_num(123542726);
    	c2.setCheckIn_CheckOut("CheckIn");
    			
   		
   		Room r1=new Room();
    	r1.setRoom_id(101);
    	r1.setRoom_price("3000");
    	r1.setRoom_status("Not Booked");
    	r1.setRoom_bed_size(2);
    	Room r2=new Room();
    	r2.setRoom_id(102);
    	r2.setRoom_price("5000");
    	r2.setRoom_status("Not Booked");
    	r2.setRoom_bed_size(4);
    	
    	Reception a1=new Reception();
    	a1.setReceptionist_id(01);
    	a1.setReceptionist_name("Aniket");
    	a1.setE_mail("aniket@gmail.com");
    	a1.setPhone_no(1234567632);
	    Reception a2=new Reception();
	    a2.setReceptionist_id(02);
	    a2.setE_mail("abhi@gmail.com");
	    a2.setPhone_no(983472635);
	    
	    Hotelinfo h1=new Hotelinfo();
	    h1.setHotel_id(10251);
	    h1.setHotel_location("Khamgaon");
	    h1.setHotel_name("Five Stars");
	    h1.setNum_of_rooms("25");
	    h1.setRating(4);
	    h1.setReception(a1);
	    
	    c1.getRoom().add(r1);
	    c2.getRoom().add(r2);
	    
	    Reviews rv1=new Reviews();
	    rv1.setReview_Id(10);
	    rv1.setRating(4);
	    rv1.setComment("Good");
	    rv1.setCustomer(c1);
	    
	    Booking b1=new Booking();
	    b1.setBooking_Id(1021);
	    b1.setAdults(2);
	    b1.setChildren(1);
	    b1.setPrice(2500);
	    LocalDate checkInDate = LocalDate.of(2023, 12, 10); 
	    LocalDate checkOutDate = LocalDate.of(2023, 12, 17); 
	    b1.setCheckInDate(java.sql.Date.valueOf(checkInDate));
	    b1.setCheckOutDate(java.sql.Date.valueOf(checkOutDate));
	    b1.setBreakfast("Yes");
	    
	    s.save(c1);
	    s.save(c2);
	    s.save(r1);
	    s.save(r2);
	    s.save(a1);
	    s.save(a2);
	    s.save(b1);
	    
	    
	    s.save(rv1);
	    
         s.save(h1);
	    t.commit();
	    
	    System.out.println( "Hello World!" );
    }
}
