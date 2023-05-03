package Tutorial3;

public class ArrayOperation extends StringOperation {
	public void maxNumber() {
		int [] xyz=array();
		
		int max=xyz[0];
		
		for(int i=1;i<xyz.length;i++)
		{
			
			if(xyz[i]>max)
			{
				max=xyz[i];
			}
		}

		System.out.println("max value is "+max);
	}
	
	
	public static void main(String[] args) {
		
		ArrayOperation obj =new ArrayOperation();
		obj.reverseString();
		obj.maxNumber();
		obj.add();
		obj.sub();
		obj.mul();
		obj.combineString();
		obj.equalmethod();
		

	}

}
