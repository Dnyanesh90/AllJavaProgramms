package Tutorial6;

public class Demo10 {

	public static void main(String[] args) {
        String[] tools=new String[5];
		
		tools[0]="Selenium WebDriver";
		tools[1]="TestNG";
		tools[2]="Cucumber";
		tools[3]="Page Object Model";
		tools[4]="GitHub";
		
		String[] abc=tools;
		
		for(String xyz:abc)
		{
			System.out.println(xyz);
		}

	}

}
