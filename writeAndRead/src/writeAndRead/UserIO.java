package writeAndRead;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class UserIO {

	public static void addRecord(User user) throws IOException{
		
		PrintWriter output = new PrintWriter(new FileWriter("user.txt", true));
		output.println(user.getFname()+"\t"+user.getLastName()+"\t"+user.getAccountNo()+"\t"+ user.getCardNo()+"\t"+user.getZipCode() );
		output.close();
	}

}
