package com.example.productmanagementapp.model;

public class ReviewsItem{
	private String date;
	private String reviewerName;
	private String reviewerEmail;
	private int rating;
	private String comment;

	public void setDate(String date){
		this.date = date;
	}

	public String getDate(){
		return date;
	}

	public void setReviewerName(String reviewerName){
		this.reviewerName = reviewerName;
	}

	public String getReviewerName(){
		return reviewerName;
	}

	public void setReviewerEmail(String reviewerEmail){
		this.reviewerEmail = reviewerEmail;
	}

	public String getReviewerEmail(){
		return reviewerEmail;
	}

	public void setRating(int rating){
		this.rating = rating;
	}

	public int getRating(){
		return rating;
	}

	public void setComment(String comment){
		this.comment = comment;
	}

	public String getComment(){
		return comment;
	}
}
