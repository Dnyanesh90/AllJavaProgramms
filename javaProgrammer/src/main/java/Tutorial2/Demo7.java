package Tutorial2;

public class Demo7 {

	public static void main(String[] args) {
		aa:
		   for(int x=1;x<=5;x++)
		{
		bb:
		   for(int y=5;y>=1;y--)
		{
			if((x==3&&y==4))
		
		{
		
			break bb;
		}	
			System.out.println(x+" "+y);
		}
		System.out.println();
		

	}

}
}
