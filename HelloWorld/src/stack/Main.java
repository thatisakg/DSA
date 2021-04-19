package stack;

import java.util.ArrayList;
import java.util.Arrays;


public class Main {
	public static void main(String args[])
	{
		Stack<String> stack = new Stack<String>();
		System.out.println("Is Stack Empty:"+stack.isEmpty());
		stack.push("Gyan");
		stack.push("Vivek");
		stack.push("Rochit");
		stack.push("Panda");
//		System.out.println("Is Stack Empty:"+stack.isEmpty());
//		System.out.println("Peek Top Element:"+stack.peek());
		System.out.println("After peek:"+stack);
//		System.out.println("Pop Top Element:"+stack.pop());
//	    System.out.println(Util.isBalancedParenthesis("{{}}}{}"));
//        System.out.println(Util.resolvedDirectoryStructure("/a/b/../c"));
//		Util.nextGreaterElement(Arrays.asList(1,2,13,4,6,16,0));
//		System.out.println(Util.removeDuplicate(Arrays.asList(1,2,2,3,4,4,6)));
		
//		Stack<Integer> stack=new Stack<>();
//		stack.push(5);
//		stack.push(1);
//		stack.push(2);
//		stack.push(20);
//		stack.push(15);
//		Util.sortUtil(stack);
		
//		int[] arr = { 100, 80, 60, 70, 60, 75, 85 };
//		for(int val:Util.stockSpan(arr))
//		{
//			System.out.println(val+" ");
//	    }
		
//		int val = Util.infixEvaluation("2+(5-3*6/2)");
//		System.out.println(val);
		
		System.out.println(Util.infixToPostfix("A*B+C"));
}
}
