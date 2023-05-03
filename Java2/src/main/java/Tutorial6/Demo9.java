package Tutorial6;

public class Demo9 {

	public static void main(String[] args) {
		 aa:  
	     for(int i=1;i<=5;i++)
	     {    
	     bb:  
	     for(int j=1;j<=5;j++)
	     {    
	     if(i==2&&j==2)
	     {    
	    //using break statement with label  
	     break aa;    
	     }    
	       System.out.println(i+" "+j);    
	    }    

	}

}
}