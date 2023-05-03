package Tutorial9;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Demo2 {

	public static void main(String[] args) {
		int a[]= {3,2,4,3,1,2,5,1,6,5,7,8,9,8,7,6,4,3};
		Set<Integer> set =new HashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			set.add(a[i]);
		}
		
		Integer []b =set.toArray(new Integer[set.size()]);
		System.out.println(Arrays.toString(b));

	}

}

//Output-[1, 2, 3, 4, 5, 6, 7, 8, 9]