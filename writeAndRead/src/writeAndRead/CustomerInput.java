package writeAndRead;

import java.io.File;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class CustomerInput {
	
	  static Scanner scanner;
		 
		  public static void readFile(){
			  String account = null;
			  String zip = null;
			  String message=null;
			  String t = null;
			  String t2 = null;
			  account = CustomerPanel.getAccount();
			  zip = CustomerPanel.getZip();
			  try{ 
			  scanner = new Scanner(new File("user.txt"));
			  }
			  catch (Exception e){
				  System.out.println("file not found");
			  }
			 bigloop: while (scanner.hasNextLine()){
				  String a = scanner.nextLine();
				  String []b = a.split("\t");	
					 t = b[3]+b[4];
					 t2 = account + zip;
				  if (t.matches(t2)){
					  message= "YOUR ACCOUNT IS VALID";	
					  break bigloop;
				  }				  
				  if (!t.matches(t2)){
				  	 message= "YOUR ACCOUNT IS INVALID";
				  }  
				 }  	
			  JOptionPane.showMessageDialog(null, message);
	  }

		  public static void closeFile(){  
			scanner.close();
		  }	
}



	

		 


