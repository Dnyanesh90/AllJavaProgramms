package Tutorial16;

public class Demo15 {

	public static void main(String[] args) {

		//Selenium With Java
          String a="selenium with java";

          String [] abc =a.split(" ");

          for(int i=0;i<abc.length;i++)
        {
	      String b =abc[i].substring(0,1).toUpperCase();
	         System.out.println(b);//S W J
	
	         String d =abc[i].substring(1);
	         System.out.println(d);
        }


	}

}
