package Tutorial7;

public class Demo6 {

	public static void main(String[] args) {
		aa:
		for(int x=1;x<=5;x++)
		{
		bb:
		for(int y=1;y<=5;y++)
		{
		if(x==4&&y==4)
		{
		break bb;
		}
		System.out.println(x+" "+y);
		}
		}

	}

}
