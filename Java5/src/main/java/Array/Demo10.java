package Array;

public class Demo10 {

	public static void main(String[] args) {
		int[] array = new int[]{2,5,5,5,6,8,8,7,7,7};
		System.out.println(array.length);
		for(int i=0;i<array.length;i++)
		{
			if(i==0)  
			{  
				System.out.println(" first occurance at "+i +" " + array[i]); 
			}
			else if( !(array[i]== array[i-1]))  
			{
				//System.out.println(i);
				System.out.println(array[i-1] + (i-1)+ " last occurance") ;
				 
		 		System.out.println(" first occurance at "+i +" " + array[i]);
				
			}
			
		}
}
}