package Tutorial1;

public class LoginPage {
	public void login(String uname , String pass) {	
		System.out.println("user name is "+uname);
		System.out.println("Password is "+pass);
	}
	
	public String captureTitle() {
		return "OrangeHRM";
	}
	
	public boolean checkLogoStatus() {
		return true;
	}
}
