package Tutorial1;

public class Demo1 {

	public static void main(String[] args) {
		int n1=1,n2=2,n3,i,count=10;   
		 System.out.print(n1+" "+n2);//printing 0 and 1    
		    
		 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }    
	}

}

//output-1 2 3 5 8 13 21 34 55 89