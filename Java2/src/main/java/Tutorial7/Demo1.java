package Tutorial7;

public class Demo1 {

	public static void main(String[] args) {
		String a = "java with selenium";    
        int b = 0;    
            
        //Counts each character except space    
        for(int i = 0;i<a.length();i++) 
        {    
            if(a.charAt(i)!=' ')    
                b++;    
        }    
            
        //Displays the total number of characters present in the given string    
        System.out.println(b); 
		System.out.println(a.length());
	}

}
//output-16