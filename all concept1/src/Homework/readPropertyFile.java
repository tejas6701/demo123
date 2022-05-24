package Homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class readPropertyFile {

	public static void main(String[] args) throws IOException {
		//file loacation and name
		
//		ABSOLUTE PATH
     String currentDir=System.getProperty("user.dir")+"\\appData\\signupdetails.properties";
     System.out.println(currentDir);
     FileInputStream file=new FileInputStream("F:\\Workplace\\all concept1\\appData\\signupdetails.properties");
     
     FileInputStream file1=new FileInputStream(currentDir);
     
     FileInputStream file2=new FileInputStream(".\\appData\\signupdetails.properties");//relative path
     
//     create an intance of Properties class
     Properties prop=new Properties();
//     load property file using load () from properties class()
     prop.load(file2);
     
//     read data from property file using getProperty()
     System.out.println("firstname: "+prop.getProperty("firstname"));
     System.out.println("lastname: "+prop.getProperty("lastname"));
     System.out.println("mobilenumber: "+prop.getProperty("mobileNumber"));
    }

}
