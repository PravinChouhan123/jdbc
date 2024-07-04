package javadatabaseconectivity;


import java.sql.*;


public class Resultset {
    
      public static void main(String[] args) throws Exception {
        Connection con = null;

      
 
   Class.forName("com.mysql.cj.jdbc.Driver");
   con = DriverManager.getConnection("jdbc:mysql://localhost:3306/"
       + "college1","root", "root");
       System.out.println("Connection Established.");
      

     
        }
        
        
    }

    


	
	
	


