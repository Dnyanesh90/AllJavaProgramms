package Tutorial16;

public class Demo19 {

	public static void main(String[] args) {

		//aUTOMATION tESTING
         String a="Automation Testing";

          String [] b =a.split(" ");

          for(int i=0;i<b.length;i++)
   {
	
	      System.out.print(b[i].substring(0,1).toLowerCase()+b[i].substring(1).toUpperCase()+" ");
   }


	}

}
