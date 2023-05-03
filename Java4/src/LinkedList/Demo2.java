package LinkedList;

import java.util.Arrays;

public class Demo2 {
	public static int getThirdLargest(int[] a, int total){  
		Arrays.sort(a);  
		return a[total-3];
		}
	public static void main(String[] args) {
		int a[] = {5,6,1,2,7,3,9,4};
		//Arrays.sort(a);
		System.out.println(+getThirdLargest(a,6));
		//System.out.print(a[a.length-1]);
	}

}

