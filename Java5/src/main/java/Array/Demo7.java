package Array;

public class Demo7 {

	public static void main(String[] args) {
		String[] xyz = new String[5];

		xyz[0] = "Rest Assured";
		xyz[1] = "JDBC";
		xyz[2] = "github";
		xyz[3] = "jenkins";
		xyz[4] = "pune";

		
		int a=xyz[3].length()-1;
		for(int i=a;i>=0;i--)
		{
			System.out.print(xyz[3].charAt(i));
		}
		
		
		int b= xyz[1].length()-1;
		for(int i=b;i>=0;i--)
		{
			System.out.print(xyz[1].charAt(i));
		}
		
		
		for(int i=0;i<5;i++)
		{
			System.out.println(xyz[i]);
		}

	}

}
