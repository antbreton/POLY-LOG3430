package testjunit;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.princeton.cs.algs4.Queue;

/*
 * Test cases for Queue class
 */
public class MadumTest {

	/*
	 * Test the first tranch of LAST attribute
	 * Queue -> getLast -> enqueue -> getLAst -> dequeue -> getLast
	 */
	
	@Test
	public void firstTranchForLast() {
	}
	/*
	 * Test the second tranch of LAST attribute
	 * Queue -> getLast -> dequeue -> getLAst -> enqueue -> getLast
	 */
	@Test
	public void secondTranchForLast() {
	}

	/*
	 * Test the first tranch of N attribute
	 * Queue -> size -> enqueue -> size -> dequeue -> size
	 */
	@Test
	public void firstTranchForN() {
	}
	/*
	 * Test the second tranch of N attribute
	 * Queue -> size -> dequeue -> size -> enqueue -> size
	 */
	@Test
	public void secondTranchForN() {
		
		Queue<String> q = new Queue<>();
		
			
		assertEquals(q.size(),0);
		
		try
		{
			q.dequeue();
			fail("Queue is empty");
		} catch(Exception e) {}		
		
		assertEquals(q.size(),0);
		
		q.enqueue("s1");
		
		assertEquals(q.size(),1);

	}
	
	/*
	 * Test the first tranch of FIRST attribute
	 * Queue -> peek -> enqueue -> peek -> dequeue -> peek -> isEmpty -> iterator
	 */
	@Test
	public void firstTranchForFirst() {
		Queue<String> q = new Queue<>();
		
		try
		{
			q.peek();
			fail("Cannot peek on an empty Queue");
		} catch(Exception e) {}
		
		q.enqueue("s1");
		
		assertEquals("s1",q.peek());
		
		q.dequeue();
		
		try
		{
			q.peek();
			fail("Cannot peek on an empty Queue");
		} catch(Exception e) {}		
		
		q.isEmpty();
		
		q.iterator();
		
		try
		{
			q.peek();
			fail("Cannot peek on an empty Queue");
		} catch(Exception e) {}			
	}
	
	/*
	 * Test the second tranch of FIRST attribute
	 * Queue -> peek -> dequeue -> peek -> enqueue -> peek -> isEmpty -> iterator
	 */
	@Test
	public void secondTranchForFirst() {
		Queue<String> q = new Queue<>();
		
		try
		{
			q.peek();
			fail("Cannot peek on an empty Queue");
		} catch(Exception e) {}
		
		try
		{
			q.dequeue();
			fail("Queue is empty");
		} catch(Exception e) {}		
		
		try
		{
			q.peek();
			fail("Cannot peek on an empty Queue");
		} catch(Exception e) {}		
		
		q.enqueue("s1");
		
		assertEquals("s1",q.peek());
	
		q.isEmpty();
		
		q.iterator();
		
		assertEquals("s1",q.peek());
	}
}
