package Tutorial6;

public class Demo8 {

	public static void main(String[] args) {
		String[] xyz = new String[5];

		xyz[0] = "Rest Assured";
		xyz[1] = "JDBC";
		xyz[2] = "github";
		xyz[3] = "jenkins";
		xyz[4] = "pune";

		
		int a=xyz[1].length()-1;
		
		
		for(int i=a;i>=0;i--)
		{
			System.out.print(xyz[1].charAt(i));
		}

	}

}
