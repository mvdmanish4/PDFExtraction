import java.util.*;
import java.sql.*;
import java.io.*;

public class PrintMain {

	public static void main(String args[]) throws IOException {
		System.out.println("Hello World");
	    
//		String url = "jdbc:mysql://localhost:3306/hck_rfyl";
//		String username = "";
//		String password = "";
//
//		System.out.println("Connecting database...");
//
//		try (Connection connection = DriverManager.getConnection(url, username, password)) {
//		    System.out.println("Database connected!");
//		} catch (SQLException e) {
//		    throw new IllegalStateException("Cannot connect the database!", e);
//		}	  	
       
		String fileName = "one.txt";
        String line = null;
        StringBuilder templateObj = new StringBuilder();

        try {
            
            FileReader fileReader = 
                new FileReader(fileName);
           
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
                templateObj.append(line);
            }         
            
            bufferedReader.close(); 
            
            
            templateObj.append("Manish Varma is great");
            
            FileWriter fileWriter = 
                    new FileWriter(fileName);
            
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(templateObj.toString());   
            bufferedWriter.close();
            
        }
        catch(FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");
            ex.printStackTrace();
        }	
	}	
}
