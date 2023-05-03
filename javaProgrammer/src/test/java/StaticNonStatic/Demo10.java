package StaticNonStatic;

public class Demo10 {

		public static void reverseString() {
			String a = "selenium";

			for (int i = a.length() - 1; i >= 0; i--) {
				System.out.print(a.charAt(i));
			}
			System.out.println();
		}

		// reverse the All array String value
		public static void m1() {
			String[] abc = { "selenium", "testng", "cucumber" };

			for (int i = 0; i < abc.length; i++) {
				System.out.println(abc[i]);
			}
		}

		// find max number in array
		public static void findMaxValue() {
			int[] abc = { 100, 200, 4000, 40, 50 };
			int max = abc[0];

			for (int a : abc) 
			{
				if (max < a) 
				{
					max = a;
				}
			}
			
			System.out.println(max);
		}

		public static void main(String[] args) 
		{
			m1();
			Demo10.reverseString();
			Demo10 obj =new Demo10();
			obj.findMaxValue();
			

	}

}
