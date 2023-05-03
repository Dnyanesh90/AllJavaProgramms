package Tutorial6;

public class Semo3 {

	public static void main(String[] args) {
		int abc[]= {15,24,36,48,56,68,75,88,90};
		int p=abc[0];
		for(int i=0;i<abc.length;i++)
		{
		if(abc[i]>p)
		{
		p=abc[i];
		}
		}
		System.out.println(p);
		}

	}


