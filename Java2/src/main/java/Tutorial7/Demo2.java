package Tutorial7;

public class Demo2 {

	public static void main(String[] args) {
		String a = "Dream big";    
        //Stores the reverse of given string    
        String b = "";    
            
        //Iterate through the string from last and add each character to variable reversedStr    
        for(int i=a.length()-1; i>=0;i--)
        {    
         b =b+a.charAt(i);    
        }    
            
        System.out.println("Original string: " + a);    
        //Displays the reverse of given string    
        System.out.println(b);    
	}

}
