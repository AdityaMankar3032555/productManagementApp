package com.example.productmanagementapp.model;

import java.util.List;

public class UserModelItem{
	private List<String> images;
	private String thumbnail;
	private int minimumOrderQuantity;
	private Object rating;
	private String returnPolicy;
	private String description;
	private int weight;
	private String warrantyInformation;
	private String title;
	private List<String> tags;
	private Object discountPercentage;
	private List<ReviewsItem> reviews;
	private Object price;
	private Meta meta;
	private String shippingInformation;
	private int id;
	private String availabilityStatus;
	private String category;
	private int stock;
	private String sku;
	private Dimensions dimensions;
	private String brand;

	public void setImages(List<String> images){
		this.images = images;
	}

	public List<String> getImages(){
		return images;
	}

	public void setThumbnail(String thumbnail){
		this.thumbnail = thumbnail;
	}

	public String getThumbnail(){
		return thumbnail;
	}

	public void setMinimumOrderQuantity(int minimumOrderQuantity){
		this.minimumOrderQuantity = minimumOrderQuantity;
	}

	public int getMinimumOrderQuantity(){
		return minimumOrderQuantity;
	}

	public void setRating(Object rating){
		this.rating = rating;
	}

	public Object getRating(){
		return rating;
	}

	public void setReturnPolicy(String returnPolicy){
		this.returnPolicy = returnPolicy;
	}

	public String getReturnPolicy(){
		return returnPolicy;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setWeight(int weight){
		this.weight = weight;
	}

	public int getWeight(){
		return weight;
	}

	public void setWarrantyInformation(String warrantyInformation){
		this.warrantyInformation = warrantyInformation;
	}

	public String getWarrantyInformation(){
		return warrantyInformation;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setTags(List<String> tags){
		this.tags = tags;
	}

	public List<String> getTags(){
		return tags;
	}

	public void setDiscountPercentage(Object discountPercentage){
		this.discountPercentage = discountPercentage;
	}

	public Object getDiscountPercentage(){
		return discountPercentage;
	}

	public void setReviews(List<ReviewsItem> reviews){
		this.reviews = reviews;
	}

	public List<ReviewsItem> getReviews(){
		return reviews;
	}

	public void setPrice(Object price){
		this.price = price;
	}

	public Object getPrice(){
		return price;
	}

	public void setMeta(Meta meta){
		this.meta = meta;
	}

	public Meta getMeta(){
		return meta;
	}

	public void setShippingInformation(String shippingInformation){
		this.shippingInformation = shippingInformation;
	}

	public String getShippingInformation(){
		return shippingInformation;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setAvailabilityStatus(String availabilityStatus){
		this.availabilityStatus = availabilityStatus;
	}

	public String getAvailabilityStatus(){
		return availabilityStatus;
	}

	public void setCategory(String category){
		this.category = category;
	}

	public String getCategory(){
		return category;
	}

	public void setStock(int stock){
		this.stock = stock;
	}

	public int getStock(){
		return stock;
	}

	public void setSku(String sku){
		this.sku = sku;
	}

	public String getSku(){
		return sku;
	}

	public void setDimensions(Dimensions dimensions){
		this.dimensions = dimensions;
	}

	public Dimensions getDimensions(){
		return dimensions;
	}

	public void setBrand(String brand){
		this.brand = brand;
	}

	public String getBrand(){
		return brand;
	}
}