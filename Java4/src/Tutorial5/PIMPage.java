package Tutorial5;

public class PIMPage extends BaseClass{
	public void addUser(String fname,String mName, String lname) {
		System.out.println(fname +" "+mName+" "+lname);
	}
	
	public void addMorePersonalInformation() {
		System.out.println("add more information");
	}
	
	public void searchEmployeeByID(String id) 
	{
		System.out.println("Seach employee "+id);
	}
	
	public void deleteEmployee(String id)
	{
		System.out.println("delete user functionality "+id);
	}
	

	public static void main(String[] args) {
		
		PIMPage pimpage=new PIMPage();
		
		BaseClass.initlization();
		pimpage.addUser("abc", "pqr", "xyz");
		pimpage.addMorePersonalInformation();
		pimpage.searchEmployeeByID("1000");
		pimpage.deleteEmployee("100");
		
		
		
			
	}
	
}
