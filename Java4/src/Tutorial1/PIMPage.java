package Tutorial1;

public class PIMPage extends LoginPage {
	public void addNewUser(String fname, String mname, String lname) {
		System.out.println(fname +" "+ mname +" "+lname);
	}
	

	public static void main(String[] args) {
		PIMPage obj =new PIMPage();
		obj.login("Admin", "admin123");
		
		String title=obj.captureTitle();
		System.out.println(title);
		
		boolean b =obj.checkLogoStatus();
		System.out.println(b);
		
		obj.addNewUser("abc", "pqr", "xyz");
		
		
	}
}
