package com.parser;

public class PersonBuilder {
	private String name = "";
	private String phone_no = "";
	private String email = "";
	private String apartmentNumber = "";
	private String landmark = "";
	private String city = "";
	private String state = "";
	private String pincode = "";
	


	public PersonBuilder setName(String name) {
		this.name = name;
		return this;
	}

	public PersonBuilder setPhone_no(String phone_no) {
		this.phone_no = phone_no;
		return this;
	}

	public PersonBuilder setEmail(String email) {
		this.email = email;
		return this;
	}

	public PersonBuilder setApartmentNumber(String apartmentNumber) {
		this.apartmentNumber = apartmentNumber;
		return this;
	}

	public PersonBuilder setLandmark(String landmark) {
		this.landmark = landmark;
		return this;
	}

	public PersonBuilder setCity(String city) {
		this.city = city;
		return this;
	}

	public PersonBuilder setState(String state) {
		this.state = state;
		return this;
	}

	public PersonBuilder setPincode(String pincode) {
		this.pincode = pincode;
		return this;
	}
	
	public Person getDetails()
	{
		return new Person(name, phone_no, email, apartmentNumber, landmark, city, state, pincode);
	}

}
