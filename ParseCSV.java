package com.parser;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.io.*;

public class ParseCSV {
	
	public static final char SEPARATOR = ',';
	public static final char QUOTE = '"';
	
	public void read(String path) {
		try {
		FileReader fr=new FileReader(path);    
        BufferedReader br=new BufferedReader(fr); 
        List<String> fields = new ArrayList<>();
        List<Person> empList = new ArrayList<>();
       
        String line = "";
        int index = 0;
        while((line = br.readLine()) != null) {
        	Person emp = new PersonBuilder().getDetails();
        	fields = tokenizeLine(line);
        	index = 0;	
              while (fields.size() > index) {
            	  if (index == 0)
  					emp.setName(fields.get(index));
  				else if (index == 1)
  					emp.setPhone_no(fields.get(index));
  				else if (index == 2)
  					{emp.setEmail(fields.get(index));
            	  //System.out.println(fields.get(index));
  					}
  				else if (index == 3)
  					emp.setApartmentNumber(fields.get(index));
  				else if (index == 4)
  					emp.setLandmark(fields.get(index));
  				else if (index == 5)
  					emp.setCity(fields.get(index));
  				else if (index == 6)
  					emp.setState(fields.get(index));
  				else if (index == 7)
  					emp.setPincode(fields.get(index));
  				else
  					System.out.println("invalid data::" + fields.get(index));
  				index++;
  				
              }
        	 empList.add(emp);
        }
        System.out.println(empList);
        br.close();
		}
		catch(IOException ioe){
            ioe.printStackTrace();
		}
	}
		
	public static List<String> tokenizeLine(String line) {
		List<String> fields = new ArrayList<>();

		String current = "";
		boolean inQuote = false;
		char[] charArray = line.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			char c = charArray[i];
			switch (c) {
				case QUOTE:
					if (current.isEmpty()) {
						inQuote = true;
						break;
					}
					if (inQuote) {
						if (nextCharIsAlsoQuote(charArray, i)) {
							current += QUOTE;
							i++;
						} else {
							inQuote = !inQuote;
						}
					} else {
						current += QUOTE;
					}
					break;
				case SEPARATOR:
					if (inQuote) {
						current += c;
					} else {
						fields.add(current);
						current = "";
					}
					break;
				default:
					current += c;
			}
		}
		fields.add(current);

		return fields;
	}

	private static boolean nextCharIsAlsoQuote(char[] charArray, int currentIndex) {
		return charArray.length > currentIndex + 1 && charArray[currentIndex + 1] == QUOTE;
	}
		
}