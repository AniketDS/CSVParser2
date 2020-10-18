package com.parser;

public class Person {

	private String name = " ";
	private String phone_no = " ";
	private String email = " ";
	private String apartmentNumber = " ";
	private String landmark = " ";
	private String city = " ";
	private String state = " ";
	private String pincode = " ";
	
	public Person(String name,String phone_no, String email, String apartmentNumber, String landmark, String city, String state, String pincode)
	{
		this.name = name;
		this.phone_no = phone_no;
		this.email = email;
		this.apartmentNumber = apartmentNumber;
		this.landmark = landmark;
		this.city = city;
		this.pincode = pincode;
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "\nPerson [Name="+name + ", Phone no=" + phone_no + ", Email=" + email + ", Apartment Number="
				+ apartmentNumber + ", Landmark=" + landmark + ", City=" + city + ", State=" + state + ", Pincode="
				+ pincode + "]";
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getApartmentNumber() {
		return apartmentNumber;
	}

	public void setApartmentNumber(String apartmentNumber) {
		this.apartmentNumber = apartmentNumber;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
}
