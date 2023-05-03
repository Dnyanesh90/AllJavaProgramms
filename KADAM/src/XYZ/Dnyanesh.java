package XYZ;

public class Dnyanesh {

	public static void main(String[] args) {
		String a="DNYANESHWAR KADAM";
		char b[]=a.toCharArray();
		int count;
		for(int i=0;i<b.length;i++)
		{
		count=1;
		for(int j=i+1;j<b.length;j++)
		{
		if(b[i]==b[j] &&b[i]!=' ')
		{
		count++;
		b[j]='0';
		}
		}
		if(count>=1 &&b[i]!='0')
		{
		System.out.println(" "+ count+" "+b[i]);
		}
		{
			//System.out.print(b[i]);
		}
		}
	}
}

	


