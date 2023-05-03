package Tutorial3;

public class Sumo1 {

	public static void main(String[] args) {
		        // Reverse ABC PQR XYZ

				String a="ABC PQR XYZ";
				//String b="DNYANESHWAR KADAM";
				
				for ( int i=a.length()-1;i>=0;i--)
				//for ( int i=b.length()-1;i>=0;i--)
				{
					System.out.print(a.charAt(i));
					//System.out.print(b.charAt(i));
				}
	

	}

}
//Output-ZYX RQP CBA