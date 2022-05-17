
public class CreateContacts {

	public static void main(String[] args) {
		// instantiate Contact class
		Contact contact1 = new Contact();//on heap
		        //reference or object reference
		//initializing the data members
		System.out.println(contact1.contactId);
		System.out.println(contact1.firstName);
		System.out.println(contact1.SecondName);
		System.out.println(contact1.mobileNo);
		System.out.println(contact1.eMail);
		
		
		contact1.contactId=2233;
		contact1.firstName="Megha";
		contact1.SecondName="Deo";
		contact1.mobileNo=766453219;
		contact1.eMail="megha.deo@gmail.com";
		//accessing the data members or read the data 
		
		
		System.out.println(contact1.contactId);
		System.out.println(contact1.firstName);
		System.out.println(contact1.SecondName);
		System.out.println(contact1.mobileNo);
		System.out.println(contact1.eMail);
		
		
	}

}
