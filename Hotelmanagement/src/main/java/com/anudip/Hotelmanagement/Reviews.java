package com.anudip.Hotelmanagement;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
	@Table(name = "reviews")
	public class Reviews {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "review_id")
	    private int Review_id;

	    @Column(name = "comment")
	    private String comment;

	    @Column(name = "rating")
	    private int rating;

	    @ManyToOne(cascade=CascadeType.ALL)
	    @JoinColumn(name = "Customer_id")
	    private Customer customer;

		public int getReview_Id() {
			return Review_id;
		}

		public void setReview_Id(int Review_id) {
			this.Review_id = Review_id;
		}

		public String getComment() {
			return comment;
		}

		public void setComment(String comment) {
			this.comment = comment;
		}

		public int getRating() {
			return rating;
		}

		public void setRating(int rating) {
			this.rating = rating;
		}

		public Customer getCustomer() {
			return customer;
		}

		public void setCustomer(Customer customer) {
			this.customer = customer;
		}

		public Reviews(int Review_id, String comment, int rating, Customer customer) {
			super();
			this.Review_id = Review_id;
			this.comment = comment;
			this.rating = rating;
			this.customer = customer;
		}

		public Reviews() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
	    


}
