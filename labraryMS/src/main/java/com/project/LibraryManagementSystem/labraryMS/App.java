package com.project.LibraryManagementSystem.labraryMS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException
    {
        //System.out.println( "Hello World!" );
    	
    	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Library", "root","root");
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Which Operation you want to perform \n 1) Craete table \n 2) Insert Data \n 3) Update Data \n 4) Delete Data \n 5) Show Data ");
        int ch = sc.nextInt();
        
       switch(ch)
       {
       
       case 1: 
       {
       	   // creating table Book Details
           String q = "create table Book_Details(Book_Id int,Book_Name varchar(100), Price int, Author varchar(100))";
           PreparedStatement ps = con.prepareStatement(q);
   
           System.out.println(" Book Details Table Created...");
           
           // execute updates
           ps.executeUpdate();
           
           System.out.println(" Student  Details Table Created...");
           
           // close the connection
           con.close();
           break;
       }
       
       case 2:
       {
       	
       	    String s = "Insert into Book_Details(Book_Id, Book_Name, Price, Author) values (?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(s);
 
            // Take input from user & adding add using scanner class
            System.out.println("Enter Book Id ");
            int Book_Id = sc.nextInt();
            
            System.out.println("Enter Book Name ");
            String name= sc.next();
            
            System.out.println("Enter Book Price ");
            int price = sc.nextInt();
            
            System.out.println("Enter  Book Author Author");
            String Author = sc.next();
            
            // Setting the value 
            ps.setInt(1,Book_Id);
            ps.setString(2,name);
            ps.setInt(3,price);
            ps.setString(4,Author);
            ps.executeUpdate();
		    System.out.println("Data inserted Sucessfully...");
            break;
       }
       
       case 3 :
       {
       	   String u = "update Book_Details set Book_Name = ?, Price = ?, Author = ? where Book_Id = ?";
           PreparedStatement psu = con.prepareStatement(u);
           
       
           System.out.println("Enter Book Id that you want to update");
           int Book_Id = sc.nextInt();
           
           System.out.println("Enter Book Name that you want to update");
           String Book_Name = sc.next();
           
           System.out.println("Enter Book Price that you want to update");
           int Price = sc.nextInt();
           
           System.out.println("Enter Author that you want to update");
           String Author = sc.next();
           
           // setting the value 
           
           psu.setString(1, Book_Name);
           psu.setInt(2,Price);
           psu.setString(3, Author);
           psu.setInt(4, Book_Id);
           
           psu.executeUpdate();
           System.out.println("Data Updated Sucessfully....");
           psu.close();
           break;
       }
       
       case 4:
       {
       		String d = "delete from Book_Details where Book_Id = ?";
            PreparedStatement psd = con.prepareStatement(d);
       		System.out.println("Enter Book Id that you want to delete : ");
       		int Book_Id = sc.nextInt();
           
       		psd.setInt(1, Book_Id);
           
       		psd.executeUpdate();
       		System.out.println("Data deleted....");
       		break;
       }
       
       case 5:
       {
       	    String s = "select * from Book_Details";
            PreparedStatement pss = con.prepareStatement(s);
            ResultSet rset = pss.executeQuery();
           
            while(rset.next())
            {
           	 	int Book_Id = rset.getInt(1);
           	 	String Book_Name = rset.getString(2);
           	 	int Price = rset.getInt(3);
           	 	String Author = rset.getString(4);
           	 
           	 	System.out.println("ID : "+Book_Id+" "+"Name : "+Book_Name+ " "+" Price : "+Price+ " "+"Author : "+Author);
            }
           System.out.println("Data Displayed....");
           pss.close();
           break;
       }

            
     }
       
    }
}
