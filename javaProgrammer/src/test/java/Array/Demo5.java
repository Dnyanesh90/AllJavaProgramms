package Array;

public class Demo5 {

	public static void main(String[] args) {
        int abc []= new int[5];
		
		abc[0]=800;
		abc[1]=300;
		abc[2]=400;
		abc[3]=180;
		abc[4]=50;
		//Assume abc[0] is minimum value
		int mini = abc[0];//30
		
		for(int i=0;i<=4;i++)
		{
			//30>50
			if(mini>abc[i])
			{
				mini=abc[i];
			}
		}
		
		System.out.println(mini);

	}

}
