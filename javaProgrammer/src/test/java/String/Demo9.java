package String;

public class Demo9 {

	public static void main(String[] args) {
		String s="ag22yb35xz15c";
		int sum=0;
		for(int i=0;i<s.length();i++) {
			if(Character.isDigit(s.charAt(i))) {
				sum=sum+Integer.parseInt(String.valueOf(s.charAt(i)));
			}
		}
	            System.out.println(sum);

	}

}
