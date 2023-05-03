package Interview;

public class Demo10 {

	public static void main(String[] args) {
		 
	    String a="SCHOOL";
	    char b[]=a.toCharArray();
	    int c;
	    for(int i=0;i<b.length;i++)
	    {
	      c=1;
	      for(int j=i+1;j<b.length;j++)
	      {
	        if (b[i]==b[j]&&b[i]!=' ') 
	        {
	          c++;
	          b[j]='0';
	        }
	      }
	      if(c>=1&&b[i]!='0')
	      {
	        System.out.print(b[i]);
	          
	        }

	}
	}
}

//                DNYAESHWR VKTO M