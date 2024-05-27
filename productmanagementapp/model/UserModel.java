package com.example.productmanagementapp.model;

import java.util.List;

public class UserModel{
	private List<UserModelItem> userModel;

	public void setUserModel(List<UserModelItem> userModel){
		this.userModel = userModel;
	}

	public List<UserModelItem> getUserModel(){
		return userModel;
	}
}