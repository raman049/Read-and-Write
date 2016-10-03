package writeAndRead;

public class CustomerInfo {

	private String accountNo, zipcode;
	
	public CustomerInfo(String acc, String zip){
		accountNo = acc;
		zipcode = zip;
	}


public String getAccountNo() {
	return accountNo;
}

public void setAccountNo(String accountNo) {
	this.accountNo = accountNo;
}

public String getZipcode() {
	return zipcode;
}

public void setZipcode(String zipcode) {
	this.zipcode = zipcode;
}

}