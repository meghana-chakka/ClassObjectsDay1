
public class Contact3 {
	private int contactId;
	private String firstName;
	private String SecondName;
	private long mobileNo;
	private String eMail;
	
	public Contact3() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Contact3(int contactId, String firstName, String secondName, long mobileNo, String eMail) {
		
		this.contactId = contactId;
		this.firstName = firstName;
		this.SecondName = secondName;
		this.mobileNo = mobileNo;
		this.eMail = eMail;
	}
	
	//mutators or accessor methosds or get/set methods

	
	
	public int getContactId() {
		return contactId;
	}
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSecondName() {
		return SecondName;
	}
	public void setSecondName(String secondName) {
		this.SecondName = secondName;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}



	@Override
	public String toString() {
		return "Contact3 [contactId=" + contactId + ", firstName=" + firstName + ", SecondName=" + SecondName
				+ ", mobileNo=" + mobileNo + ", eMail=" + eMail + "]";
	}



	
	
	

}

