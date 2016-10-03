
package writeAndRead;

public class User {
	

	
	
	private String fname, lastName, accountNo, cardNo, zipCode;
	
 public	User(String name, String lname, String account, String cardno, String zipcode){
		setFname(name);
		setLastName(lname);
		setAccountNo(account);
		setCardNo(cardno);
		setZipCode(zipcode);
		
	}
 
 
public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}



public String getZipCode() {
	return zipCode;
}



public void setZipCode(String zipCode) {
	this.zipCode = zipCode;
}



public String getCardNo() {
	return cardNo;
}



public void setCardNo(String cardNo) {
	this.cardNo = cardNo;
}



public String getFname() {
	return fname;
}



public void setFname(String fname) {
	this.fname = fname;
}

public String toString(User user){
	 return user.getFname()+"\t"+user.getLastName()+"\t"+user.getAccountNo()+"\t"+ user.getCardNo()+"\t"+user.getZipCode();
		
}

public String getAccountNo() {
	return accountNo;
}



public void setAccountNo(String accountNo) {
	this.accountNo = accountNo;
}




}