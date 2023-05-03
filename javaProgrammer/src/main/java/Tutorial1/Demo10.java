package Tutorial1;

public class Demo10 {

	public static void main(String[] args) {
		 String a ="Big black bug bit a big black dog bug on nose his big a his black nose";    
	        int b;    
	              
	        a= a.toLowerCase();                
	       
	        String c[] = a.split(" ");    
	                
	        for(int i=0;i<c.length; i++)
	        {    
	            b = 1;    
	            for(int j = i+1;j<c.length;j++)
	            {    
	                if(c[i].equals(c[j])) 
	                {    
	                    b++;    
	                   
	                    c[j] = "0";    
	                }    
	            }    	                	         
	            if(b>1 && c[i] != "0")    
	                System.out.println(c[i]);    
	        }    

	}

}

//output
//big
//black
//his
