package Tutorial16;

public class Demo18 {

	public static void main(String[] args) {

		//aUTOMATION tESTING
           String a="Automation Testing";

           String [] b =a.split(" ");

           for(int i=0;i<b.length;i++)
           {
	

	            System.out.println(b[i]);//Automation		Testing
	            System.out.println(b[i].substring(0, 1).toLowerCase());//a t

	            System.out.println(b[i].substring(1).toUpperCase());//UTOMATION  ESTING
	


           }
	}

}
