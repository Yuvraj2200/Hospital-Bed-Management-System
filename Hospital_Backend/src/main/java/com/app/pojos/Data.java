package com.app.pojos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Data {

	public String email;
	public Data(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	public String password;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Data [email=" + email + ", password=" + password + "]";
	}
	
	
}
