package testjunit;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.princeton.cs.algs4.Stack;

public class ORDTestStack {

	@Test
	public void testStack() {
		Stack st = new Stack();
		assertEquals(0, st.getN());
	}

	@Test
	public void testIsEmpty() {
		Stack st = new Stack();
		assertEquals(true, st.isEmpty());
	}

	@Test
	public void testSize() {
		Stack st = new Stack();
		assertEquals(st.getN(), st.size());
	}

	@Test
	public void testPush() {
		
	}

	@Test
	public void testPop() {
		fail("Not yet implemented"); 
	}

	@Test
	public void testPeek() {
		fail("Not yet implemented"); 
	}

	@Test
	public void testToString() {
		fail("Not yet implemented"); 
	}

	@Test
	public void testIterator() {
		fail("Not yet implemented"); 
	}

}
