
public class ComparingObjects {

	public static void main(String[] args) {
		
		
		Contact2 contact1=new Contact2();
		Contact2 contact2= new Contact2();
		
		//== is equals operator which is used for checking object references in memory
		
		
		boolean result =(contact1==contact2);
		System.out.println(result);
		
		
        result=(contact1.hashCode()==contact2.hashCode());
        System.out.println(result);		
	
        Contact2 contact3 = contact1;
        		//assigning the ref of contact1 to contact3
        
        result =(contact1==contact3);
		System.out.println(result);
		
		
		 result=(contact1.hashCode()==contact3.hashCode());
		 System.out.println(result);		
		
		
		
	
	
	
	}

}
