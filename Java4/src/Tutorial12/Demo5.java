package Tutorial12;

public class Demo5 {

	public static void main(String[] args) {

		String abc[] = new String[4];

		abc[0] = "POM";
		abc[1] = "cucumber";
		abc[2] = "github";
		abc[3] = "Jenkins";

		try {
			abc[4] = "Rest Assured- API Testing";
			System.out.println(abc[4]);
		} catch (Exception e) {
			System.out.println("Exception occur");
		}
	}

}
