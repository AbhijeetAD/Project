package com.anudip.Hotelmanagement;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Reception")


public class Reception {
	@Id
	private int receptionist_id;
	
	@Column(name="Receptionist_Name")
	private String receptionist_name;
	
	private String e_mail;
	private int phone_no;
	@OneToOne(cascade=CascadeType.ALL)
	public int getReceptionist_id() {
		return receptionist_id;
	}
	public void setReceptionist_id(int receptionist_id) {
		this.receptionist_id = receptionist_id;
	}
	public String getReceptionist_name() {
		return receptionist_name;
	}
	public void setReceptionist_name(String receptionist_name) {
		this.receptionist_name = receptionist_name;
	}
	public String getE_mail() {
		return e_mail;
	}
	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}
	
	public int getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(int phone_no) {
		this.phone_no = phone_no;
	}
	
	
	public Reception(int receptionist_id, String receptionist_name, String e_mail, int phone_no) {
		super();
		this.receptionist_id = receptionist_id;
		this.receptionist_name = receptionist_name;
		this.e_mail = e_mail;
		this.phone_no = phone_no;
	}
	public Reception() {
		
		// TODO Auto-generated constructor stub
	}
	
	

}
