package Tutorial9;

public class Demo3 {

	public void selenium() {
		System.out.println("Selenium is called");
	}

	public void testng() {
		System.out.println("testng is called");
	}

	public void pom() {
		System.out.println("pom is called");
	}

	public void Hybrid() {
		selenium();
		testng();
		pom();
		System.out.println("Hybrid is called");
	}

	public static void main(String[] args) {
		Demo3 obj = new Demo3();
		obj.Hybrid();

	}

}
