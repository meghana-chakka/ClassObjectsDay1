
public class CreateContacts3 {

	public static void main(String[] args) {
		// instantiate Contact class
		Contact3 contact1 = new Contact3(334,"Jone","karl",345827345,"jone.karl@gmail.com");//on heap
		        //reference or object reference
		//prints the present state
		System.out.println(contact1.getContactId());
		System.out.println(contact1.getFirstName());
		System.out.println(contact1.getSecondName());
		System.out.println(contact1.getMobileNo());
		System.out.println(contact1.geteMail());
		
		
		contact1.setMobileNo(57257836L);
		//initializing the data members
	    /*
		
		contact1.setContactId(2233);
		contact1.setFirstName("Megha");
		contact1.setSecondName("Deo");
		contact1.setMobileNo(766453219);
		contact1.seteMail("megha.deo@gmail.com");
	    */
	
	//accessing the data members or read the data 
		
		
		System.out.println(contact1.getContactId());
		System.out.println(contact1.getFirstName());
		System.out.println(contact1.getSecondName());
		System.out.println(contact1.getMobileNo());
		System.out.println(contact1.geteMail());
		
		
	}

	
	


}
