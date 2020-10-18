package com.parser;
import java.util.*;

import java.util.regex.*;
import org.junit.*;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

//import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;

class ParseCSVTest {
	Pattern pattern;
	Matcher matcher;
	Person p;
	
	@Test
	public void whenMatchesTenDigitsNumber_thenCorrect() {
		p= new Person();
		String phone = p.getPhone_no();
	    Pattern pattern = Pattern.compile("^\\d{10}$");
	    Matcher matcher = pattern.matcher(phone);
	    assertTrue(matcher.matches());
	}
	
	@Test
	public void validate_email_address() {
		p= new Person();
		String email = p.getEmail();
		    pattern = Pattern.compile("^[(a-zA-Z-0-9-\\_\\+\\.)]+@[(a-z-A-z)]+\\.[(a-zA-z)]{2,3}$");
	        matcher   = pattern.matcher(email);
	        System.out.println(email);
	        assertTrue(matcher.matches());
	        
	}
	
	@Test 
	public void isValidPinCode() {
		p= new Person();
		String pincode = p.getPincode();
		    pattern = Pattern.compile("^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$");
	        matcher = pattern.matcher(pincode);
	        assertTrue(matcher.matches());
	}
	
	@Test
	public void check_cityname_is_valid(){
		p= new Person();
		String city = p.getCity();
		    pattern = Pattern.compile("^[a-zA-Z\\u0080-\\u024F.]+((?:[ -.|'])[a-zA-Z\\u0080-\\u024F]+)*$");
	        matcher = pattern.matcher(city);
	        assertTrue(matcher.matches());
	        
	}
		
	@Test
	public void checkAddressLine() {
		p= new Person();
		String landmark = p.getLandmark();
		    pattern = Pattern.compile("^[a-zA-Z\\u0080-\\u024F.]+((?:[ -.|'])[a-zA-Z\\u0080-\\u024F]+)*$");
	        matcher = pattern.matcher(landmark);
	        assertTrue(matcher.matches());
	}
	@Test
	public void check_statename_is_valid(){
		p= new Person();
		String state = p.getState();
		    pattern = Pattern.compile("^[a-zA-Z\\u0080-\\u024F.]+((?:[ -.|'])[a-zA-Z\\u0080-\\u024F]+)*$");
	        matcher = pattern.matcher(state);
	        assertTrue(matcher.matches());
	        
	}
	
	
}
