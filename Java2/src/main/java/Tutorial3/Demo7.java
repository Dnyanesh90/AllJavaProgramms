package Tutorial3;

public class Demo7 {

	public static void main(String[] args) 
	{
		String a="DNYANESHWAR VYANKATRAO KADAM";
	      char abc[]=a.toCharArray();
	      int count;
	      for(int i=0;i<abc.length;i++) 
	      {
	    	  count=1;
	    	  for(int j=i+1;j<abc.length;j++)
	    	  {
	    		  if(abc[i]==abc[j]&&abc[i]!=' ')
{
	    			  count++;
	    			  abc[j]='0';
	    			  
	    		  }
	    	  }
	    	  if(count>=1&&abc[i]!='0')
	    	  {
	    		  //System.out.print(abc[i]+" "+count+",");
	    		  System.out.print(abc[i]);
	    	  }
	    	 
	      }
	}
} 

//output-schol