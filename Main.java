package com.parser;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		String path = "src\\com\\parser\\Data.csv";
		ParseCSV p = new ParseCSV();
		p.read(path);
	}

	}


