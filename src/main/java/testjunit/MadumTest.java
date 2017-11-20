package testjunit;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.princeton.cs.algs4.Queue;

/*
 * Test cases for Queue class
 */
public class MadumTest {

	/*
	 * Test the first tranch of LAST attribute Queue -> getLast -> enqueue ->
	 * getLAst -> dequeue -> getLast
	 */
	@Test
	public void firstTranchForLast() {
		
		Queue<String> q = new Queue<>();
		try {
			q.getLast();
			fail("Cannot get the Last of an empty Queue");
		} catch (Exception e) {
		}

		q.enqueue("s1");

		assertEquals("s1", q.getLast());

		q.dequeue();

		try {
			q.getLast();
			fail("Cannot get the Last of an empty Queue");
		} catch (Exception e) {
		}
	}

	/*
	 * Test the second tranch of LAST attribute Queue -> getLast -> dequeue ->
	 * getLAst -> enqueue -> getLast
	 */
	@Test
	public void secondTranchForLast() {
		
		
		Queue<String> q = new Queue<>();
		try {
			q.getLast();
			fail("Cannot get the Last of an empty Queue");
		} catch (Exception e) {
		}
		try {
			q.dequeue();
			fail("Cannot dequeue an empty Queue");
		} catch (Exception e) {
		}		
		try {
			q.getLast();
			fail("Cannot get the Last of an empty Queue");
		} catch (Exception e) {
		}
		q.enqueue("s1");
		assertEquals("s1", q.getLast());
	}

	/*
	 * Test the first tranch of N attribute Queue -> size -> enqueue -> size ->
	 * dequeue -> size
	 */
	@Test
	public void firstTranchForN() {
		
		Queue<String> q = new Queue<>();
		assertEquals(0, q.size());
		q.enqueue("s1");
		assertEquals(1, q.size());
		q.dequeue();
		assertEquals(0, q.size());
	}

	/*
	 * Test the second tranch of N attribute 
	 * Queue -> size -> dequeue -> size -> enqueue -> size
	 */
	@Test
	public void secondTranchForN() {
	}

	/*
	 * Test the first tranch of FIRST attribute 
	 * Queue -> peek -> enqueue -> peek -> dequeue -> peek
	 */
	@Test
	public void firstTranchForFirst() {
		Queue<String> q = new Queue<>();

		try {
			q.peek();
			fail("Cannot peek on an empty Queue");
		} catch (Exception e) {
		}

		q.enqueue("s1");

		assertEquals("s1", q.peek());

		q.dequeue();

		try {
			q.peek();
			fail("Cannot peek on an empty Queue");
		} catch (Exception e) {
		}
	}

	/*
	 * Test the second tranch of FIRST attribute 
	 * Queue -> peek -> dequeue -> peek -> enqueue -> peek
	 */
	@Test
	public void secondTranchForFirst() {
	}
}
