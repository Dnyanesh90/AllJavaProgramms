package Tutorial5;

public class Demo14 {

	public static void main(String[] args) {

		String [] abc =new String[5];
		
		abc[0]="selenium";
		abc[1]="TestNG";
		abc[2]="cucumber";
		abc[3]="POM";
		abc[4]="BDD Framework";
		
		System.out.println(abc.length);
		
		System.out.println(abc[0]);
		
		
		for(int i=0;i<5;i++)
		{
			System.out.println(abc[i]);
		}

	}
}

