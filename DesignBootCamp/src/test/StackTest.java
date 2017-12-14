package test;

import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class StackTest {

	Stack<Integer> stack = new Stack<>();
	@Before
	public void before()
	{
		System.out.println("Before");
	}
	@After
	public void After()
	{
		System.out.println("After");
	}
	private int size = stack.size();
	@Test
	public void checkEmpty()
	{
		boolean size = stack.isEmpty();
		System.out.println("checkEmpty");
		assertEquals(true,size);
	}
	@Test
	public void checkSize() {
		System.out.println("checkSize");

		stack.push(10);
		assertEquals(1,size+1);
		}

	
	@Test
	public void checkPush() {
		System.out.println("checkPush");

		stack.push(10);
	
	assertEquals(1,size+1);
		
	}
	@Test
	public void checkPop() {
		System.out.println("checkPop");

	stack.push(10);
	stack.pop();
	assertEquals(0,size);
		
	}
	@Test
	public void checkPeek() {
		System.out.println("checkPeek");

		stack.push(10);
		assertEquals(1,size+1);
		int peek = (int) stack.peek();
		
		assertEquals(10,peek);
			
		}

}
