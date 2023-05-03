package Tutorial6;

public class Demo8 {

	public static void main(String[] args) {
		//outer loop   
        for(int i=1;i<=5;i++)
        {    
           //inner loop  
         for(int j=1;j<=5;j++)
        {    
         if(i==2&&j==2)
         {    
            //using break statement inside the inner loop  
               break;    
         }    
            System.out.println(i+" "+j);    
                }    
        }    

	}

}
