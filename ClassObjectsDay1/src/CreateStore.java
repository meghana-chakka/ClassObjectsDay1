
public class CreateStore {

	public static void main(String[] args) {
		StoreContacts store = new StoreContacts();

		Contact3 con1 =new Contact3(567,"Lara","Sing",56455694,"Lara@hostmail.com");
		Contact3 con2 =new Contact3(577,"Diya","Sing",53276924,"Diya@hostmail.com");
		Contact3 con3 =new Contact3(587,"Karl","Dev",45823984,"Karl@hostmail.com");
		
		
		
		
		Contact3 contact3Array[]=new Contact3[3];
		contact3Array[0]=con1;
		contact3Array[1]=con2;
		contact3Array[2]=con3;
		
		store.setContacts(contact3Array);
		
		//System.out.println(store);
		
		Contact3 contacts[]=store.getContacts();
		for(Contact3 contact : contacts) {
			System.out.println(contact);
		}
		
		
		
		
	}

}
