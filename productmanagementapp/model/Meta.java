package com.example.productmanagementapp.model;

public class Meta{
	private String createdAt;
	private String qrCode;
	private String barcode;
	private String updatedAt;

	public void setCreatedAt(String createdAt){
		this.createdAt = createdAt;
	}

	public String getCreatedAt(){
		return createdAt;
	}

	public void setQrCode(String qrCode){
		this.qrCode = qrCode;
	}

	public String getQrCode(){
		return qrCode;
	}

	public void setBarcode(String barcode){
		this.barcode = barcode;
	}

	public String getBarcode(){
		return barcode;
	}

	public void setUpdatedAt(String updatedAt){
		this.updatedAt = updatedAt;
	}

	public String getUpdatedAt(){
		return updatedAt;
	}
}
