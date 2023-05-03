package Tutorial17;

public class Demo2 {

	public static void main(String[] args) {
		String a="mumbai is big city of india";
		
		String[] b=a.split(" ");
		
		for (int i=0;i<=a.length();i++)
		{
			System.out.println(b[i].substring(0, 1).toUpperCase());
		}

	}

}
