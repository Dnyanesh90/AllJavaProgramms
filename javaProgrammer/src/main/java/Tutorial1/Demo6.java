package Tutorial1;

public class Demo6 {

	public static void main(String[] args) {
		String a = "RUSHIKEISH DHARURKAR";    
        int count;    
            
         
        char b[] = a.toCharArray();    
            
       // System.out.println("Duplicate characters in a given string: ");    
       
        for(int i = 0; i <b.length; i++) {    
            count = 1;    
            for(int j = i+1; j <b.length; j++) {    
                if(b[i] == b[j] && b[i] != ' ') {    
                    count++;    
                      
                    b[j] = '0';    
                }    
            }    
            //A character is considered as duplicate if count is greater than 1    
            if(count > 1 && b[i] != '0')    
                System.out.print(b[i]);

	}

}
}


//output-RUSHKA