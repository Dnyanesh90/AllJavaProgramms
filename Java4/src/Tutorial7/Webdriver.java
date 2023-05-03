package Tutorial7;

public interface Webdriver {
	void get(String url);

	String getTitle();

	String getCurrentUrl();

	void findElement();

	void findElements();
}
