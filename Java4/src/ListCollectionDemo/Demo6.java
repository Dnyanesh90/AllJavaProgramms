package ListCollectionDemo;

import java.util.Stack;

public class Demo6 {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		Stack v =new Stack();
		
		v.push("A");
		v.push("B");
		v.push("C");
		v.push("D");

			
		System.out.println(v);
		System.out.println("remove the top Element " +v.pop());
		System.out.println(v);
		System.out.println("get the top element "+v.peek());
		System.out.println(v);	
		
	}

}
