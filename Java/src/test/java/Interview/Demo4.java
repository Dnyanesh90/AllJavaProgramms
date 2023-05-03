package Interview;

public class Demo4 {

	public static void main(String[] args) {
		int a=123456789,reverse =0;
		while (a!=0)
		{
			int remainder =a%10;
			reverse =reverse*10+remainder;
			a=a/10;
		}
		System.out.println(+reverse);
		}

	}

//output-----987654321 
