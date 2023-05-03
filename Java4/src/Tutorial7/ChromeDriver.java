package Tutorial7;

public class ChromeDriver implements Webdriver {

	@Override
	public void get(String url) {
		System.out.println("get method");

	}

	@Override
	public String getTitle() {

		return "Google";
	}

	@Override
	public String getCurrentUrl() {

		return "https://www.google.com";
	}

	@Override
	public void findElement() {
		System.out.println("Find Element ");

	}

	@Override
	public void findElements() {
		System.out.println("Find Elements ");

	}

	public static void main(String[] args) {
		Webdriver driver = new ChromeDriver();
		driver.get("abc");
		driver.getTitle();
		driver.getCurrentUrl();
		driver.findElement();
		driver.findElements();
		
	}
}
