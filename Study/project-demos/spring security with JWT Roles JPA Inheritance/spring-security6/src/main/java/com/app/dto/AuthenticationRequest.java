package com.app.dto;
//ADD LOMBOK here n test!!!!
public class AuthenticationRequest {
	private String userName;
	private String  password;
	public AuthenticationRequest() {
		// needed for serialization/de -serial
	}
	public AuthenticationRequest(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "SignInRequest [userName=" + userName + ", password=" + password + "]";
	}
	
	
}
