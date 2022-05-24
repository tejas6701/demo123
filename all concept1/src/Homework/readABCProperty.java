package Homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class readABCProperty {

	public static void main(String[] args) throws IOException {
    String ref=System.getProperty("user.dir")+"\\abc\\abc.properties"; 
    System.out.println(ref);
    FileInputStream ref1=new FileInputStream("F:\\Workplace\\all concept1\\abc\\abc.properties");
    FileInputStream ref2=new FileInputStream(ref);
    FileInputStream ref3=new FileInputStream(".\\abc\\abc.properties");
    Properties props=new Properties();
    props.load(ref3);
    System.out.println("FirstName: "+props.getProperty("FirstName"));
    System.out.println("Lastname: "+props.getProperty("LastName"));
    System.out.println("MobileNumber: "+props.getProperty("MobileNumber"));
    System.out.println("EmpId: "+props.getProperty("EmpId"));
    
	
	}
}
