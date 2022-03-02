package com.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
	

public static Properties p;

public Configuration_Reader() throws IOException {

	File f = new File(
			"C:\\Users\\infan\\Selenium4oclockbatch\\Maven_Project\\src\\main\\java\\com\\properties\\configuration.properties");
	
	FileInputStream fis = new FileInputStream(f);
	
	p = new Properties();
	p.load(fis);

}

public String geturl() throws IOException {
	
	String url =  p.getProperty("url");
	
	return url;
}
public String getfirsttName() throws IOException {
	
	String firstName = p.getProperty("firstName");
	return firstName;
}

public String getlastName() throws IOException {
	
	String lastName = p.getProperty("lastName");
	return lastName;
}

public String getmailid() throws IOException {
	
	String mailid = p.getProperty("mailid");
	return mailid;

}

}
